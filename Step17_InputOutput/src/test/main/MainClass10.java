package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("C:\\acorn2020\\myFolder\\folder1");
		
		f1.mkdir();
		System.out.println("디렉토리를 만들었습니다.");
		
		int i;
		for(i=0; i<5; i++) {
			File f2 = new File("C:\\acorn2020\\myFolder\\folder"+i);
			f2.mkdir();
			System.out.println(i+"번째 디렉토리를 만들었습니다.");
		}
		System.out.println("총 "+i+"개의 디렉토리를 만들었습니다.");
	}
}
