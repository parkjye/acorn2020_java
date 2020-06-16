package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass17 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("C:\\acorn2020\\myFolder\\1.jpg");
			
			//읽어낸 byte를 출력할 객체
			fos = new FileOutputStream("C:\\acorn2020\\myFolder\\copied2.jpg");
			
			//byte 데이터를 읽어낼 방 1024개의 배열객체 생성
			byte[] buffer = new byte[1024];
			
			//반복문 돌면서 읽어내기
			while(true) {
				//byte[] 객체를 전달해서 읽어내고 리턴되는 데이터는 읽은 byte의 갯수가 리턴된다.
				int readedByte=fis.read(buffer);
				if(readedByte==-1) { break; } //더이상 읽을 byte가 없으면 반복문 탈출
				
				/* byte[]에 있는 데이터를 읽은 만큼 출력하기
					.write(배열[], 0번방부터, 파일크기까지) */
				fos.write(buffer, 0, readedByte);
			}
			System.out.println("파일을 성공적으로 복사했습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fis.close();
				} catch (IOException e) {}
		}
		
		
	}//main
}//MainClass16
