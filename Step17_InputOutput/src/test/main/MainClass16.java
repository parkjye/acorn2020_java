package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("C:\\acorn2020\\myFolder\\1.jpg");
			
			//읽어낸 byte를 출력할 객체
			fos = new FileOutputStream("C:\\acorn2020\\myFolder\\copied.jpg");
			
			//반복문 돌려서 읽어내기
			while(true) {
				//1 byte씩 읽어들인다.
				int data = fis.read();
				if(data==-1) { break; }
				
				//읽은 1byte 출력
				fos.write(data);
				fos.flush();
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
