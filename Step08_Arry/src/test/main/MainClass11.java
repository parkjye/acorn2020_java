package test.main;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//외형상 무한루프
		while(true) {
			System.out.print("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			
			/* 문자열 비교할 때 .equals 메소드를 사용해서 '내용 비교'해야함
			 * because: 참조값이 상이함 */
			
			if(str.equals("q")) { //무한 루프 탈출 조건
				break; //while탈출
			}
//			System.out.println("무언가 작업 합니다.");
			goGame();
		}
		
		//MainClass07.sthMethod(); 정리
		
		System.out.println("main 메소드가 종료 됩니다.");
		scan.close();
	
	}//main
	
	
	public static void goGame() {
		
	}
	
}//class
