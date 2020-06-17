package example4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientMain extends JFrame implements ActionListener{	
	//필드
	JTextField tf_msg;

	//서버와 연렬된 Socket 객체의 참조값을 담을 필드
	Socket socket;
	
	
	//생성자
	public ClientMain() {
		//서버에 소켓 접속을 한다.
		try {
			socket=new Socket("192.168.0.20", 5050);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//레이아웃을 borderLayout으로 지정하기
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel(); //패널
		panel.setBackground(Color.PINK);
		
		//입력창
		tf_msg = new JTextField(10);
		
		//버튼
		JButton sendBtn = new JButton("전송");
		sendBtn.setActionCommand("send");
		
		//패널에 입력창과 버튼 추가
		panel.add(tf_msg);
		panel.add(sendBtn);
		
		//프레임의 아래쪽에 패널 배치하기
		add(panel, BorderLayout.SOUTH);
		
		//버튼에 리스너 등록
		sendBtn.addActionListener(this);
	}
		
	public static void main(String[] args) {
		//프레임 객체 생성
		ClientMain f = new ClientMain();
		f.setTitle("채팅창");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}//main

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//전송할 문자열
		String msg = tf_msg.getText();
		
		try {
			System.out.println("Socket 연결 성공!");
			
			//문자열을 서버에 전송(출력Output)하기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(msg);
			osw.write("\n"); //개행기호도 출력(서버에서 줄단위로 읽어낼 예정)
			osw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}//ClientMain
