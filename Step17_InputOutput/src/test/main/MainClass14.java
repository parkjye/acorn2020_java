package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile = new File("C:\\acorn2020\\myFolder\\memo.txt");
		try{
			if(!memoFile.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			//파일에서 읽어들일 객체
			FileReader fr = new FileReader(memoFile);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				//반복문 돌면서 문자열을 줄단위(개행기호 기준)로 읽어낸다.
				String line = br.readLine();
				if(line==null) { //더이상 읽을 문자열이 없으면 반복문 탈출
					break;
				}
				//읽은 문자열 출력하기
				//출력할 때 개행기호 삭제됨(줄단위로 읽어서) System.out.print(line);
				System.out.println(line);
			}
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try~catch
	}
}
