package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File myFile = new File("c:/");
		
		//파일객체목록 (File[])을 얻어내기
		File[] files = myFile.listFiles();
		
		//반복문 돌면서 출력
		for(File temp:files) {
			//만일 해당 파일 객체가 디렉토리라면
			if(temp.isDirectory()) {
				System.out.println("[ "+temp.getName()+" ]");
			}else { //파일이면
				System.out.println(temp.getName());
			}	
		}
		
	} //main
}//MainClass08
