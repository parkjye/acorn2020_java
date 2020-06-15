package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		
		//이미 만들어졌거나 만들 예정인 파일을 access할 수 있는 File객체 
		File f1 = new File("c:/acorn2020/myFolder/gura.txt");
		
		try {
			//새로운 파일 만들기
			f1.createNewFile();
			System.out.println("gura.txt파일을 만들었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
