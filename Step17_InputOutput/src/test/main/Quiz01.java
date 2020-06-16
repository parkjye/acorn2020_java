package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 이용해서 문자열 한 줄을 입력받고
		 * c:/acorn2020/myFoler/quiz.txt 파일을 만들어서
		 * 해당 파일에 문자열을 저장하세요.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String getStr = scan.nextLine();
		
		//파일객체
		File quizFile = new File("C:\\acorn2020\\myFolder\\quiz.txt");
		
		try {
			boolean isExist = quizFile.exists();
			if(!isExist) {
				quizFile.createNewFile();
			}
			
			FileWriter fw = new FileWriter(quizFile, true); //true: 문자열 누적됨 + .append();
			fw.append(getStr); //String == CharSquence type
			fw.write("\r\n");
			fw.close(); //자동으로 fw.flush();가 된다.

			System.out.println("파일 기록 완료");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try~catch
		
	}//main
}//Quiz01
