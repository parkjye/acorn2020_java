package test.main;
import java.util.Random;
import java.util.Scanner;

public class MainClass12 {
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
			goGame();
		}
		
		//MainClass07.sthMethod(); 정리
		
		System.out.println("main 메소드가 종료 됩니다.");
		scan.close();
	
	}//main
	
	public static void goGame() {
		
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		Random ran=new Random();
		
		//랜덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		int[] points = {10, 20, 30, 40, 1000};
		
		//0~4 사이의 랜덤한 정수 3개 얻어내기
		for(int i=0;i<3;i++) {
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum;
		}
		
		for(int i=0; i<nums.length; i++) { //for문으로 3초 지연
			
			try {
			// 실행의 흐름(스레드)을 1초 잡아 놓기
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			System.out.print(items[nums[i]]+" ");
		}
		System.out.println(); //개행
		

		if(nums[0]==nums[1] && nums[1]==nums[2]) { //3개가 모두 같은경우
			/*점수 부여. dummy배열에 있는 숫자 3개가 같으므로
			 * 아무거나 하나 읽어서 점수를 얻어낸다.
			 * */
			int point = points[nums[0]];
			System.out.println(point+"점 입니다.");
		} else { 
			System.out.println("0점 입니다.");
		}

	} //goGame()
	
}//class
