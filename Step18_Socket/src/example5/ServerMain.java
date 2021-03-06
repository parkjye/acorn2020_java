package example5;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {
	//필드
	static List<ServerThread> threadList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//필요한 객체를 저장할 지역변수 미리 만들기
		ServerSocket serverSocket=null;
		
		try {
			//5000번 통신 port를 열고 클라이언트의 접속을 기다린다.
			serverSocket = new ServerSocket(5050);
			
			while(true) {
				//클라이언트의 소켓 접속을 기다린다.
				Socket socket=serverSocket.accept();
				
				//방금 접속한 클라이언트를 응대할 스레드를 시작시킨다.
				ServerThread thread = new ServerThread(socket);
				thread.start();
				
				//생성하고 시작한 스레드참조값을 List에 저장하기
				threadList.add(thread);
			}

		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
				
			}catch(Exception e) {}
		}
		
	}//Main
	
	//내부 클래스로 스레드 객체를 생성할 클래스를 정의한다.
	// extends Thread + run()
	//static main() 메소드에서 클래스를 사용하기 위해 static 예약어를 붙여서 정의한다.
	public static class ServerThread extends Thread{
		//필드
		Socket socket;
		
		//클라이언트에게 문자열을 출력할 수 있는 객체
		BufferedWriter bw;
		
		//
		String chatName;
		
		
		//생성자의 인자로 Socket객체를 전달받도록 한다.
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달받은 Socket 객체의 참조값을 필드에 저장한다.
			this.socket=socket;
		}
		
		//인자로 전달된 문자열을 Socket을 통해서 출력하는 메소드
		public void sendMessage(String msg) throws IOException {
			//반복문 돌면서 모든 스레드의 BufferedWriter 객체를 이용해서 문자열을 전송한다.
			for(ServerThread tmp:threadList) {
				tmp.bw.write(msg); //문자열 출력
				tmp.bw.newLine(); //개행기호 출력==\r\n
				tmp.bw.flush(); //방출
			}
		}
		//참여자 목록을 얻어내서 Client에게 출력해주는 메소드
		public void sendChatNameList() {
			JSONObject jsonObj = new JSONObject();
			JSONArray jsonArr = new JSONArray();
			
			for(int i=0; i<threadList.size(); i++) {
				ServerThread tmp = threadList.get(i);
				jsonArr.put(i, tmp.chatName);
			}
			
			jsonObj.put("type", "members");
			jsonObj.put("list", jsonArr);
			
			try {
				sendMessage(jsonObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		//새로운 작업단위가 시작되는 run() 메소드
		@Override
		public void run() {
			try {
				String clientIp = socket.getInetAddress().getHostAddress();
				System.out.println("접속한 클라이언트의 아이피: "+clientIp);
				
				//클라이언트로부터 읽어들일(Input) 객체의 참조값 얻어오기
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				//클라이언트에게 출력할 수 있는 객체
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				
				//BufferedWriter 객체의 참조값을 필드에 저장하기
				bw = new BufferedWriter(osw);
				
				while(true) {	
					//클라이언트가 전송하는 문자열을 읽어낸다.
					String msg = br.readLine();
					
					//전송된 JSON문자열을 사용할 준비를 한다.
					JSONObject jsonObj = new JSONObject(msg);
					
					//type을 읽어낸다.
					String type = jsonObj.getString("type");			
					if(type.equals("enter")) {
						//현재 스레드가 대응하는 클라이언트의 대화명을 필드에 저장
						String chatName=jsonObj.getString("name");
						this.chatName=chatName;
						//대화명 목록을 보내준다.
						sendChatNameList();
					}
					
					//클라이언트에게 동일한 메시지를 보내는 메소드를 호출한다.
					sendMessage(msg);
					
					if(msg==null) { break; } //클라이언트의 접속이 끊겼기 때문에 반복문 탈출.
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//접속이 끊겨서 종료되는 스레드는 List에서 제거한다.
				threadList.remove(this);
				//this가 퇴장한다고 메세지를 보낸다.
						
				try {
					JSONObject jsonObj = new JSONObject();
					jsonObj.put("type", "out");
					jsonObj.put("name", this.chatName);
					sendMessage(jsonObj.toString());
					sendChatNameList();
					
					if(socket!=null)socket.close();
				}catch(Exception e) {}
			}
		}
	}//ServerThread
	
	
}//ServerMain
