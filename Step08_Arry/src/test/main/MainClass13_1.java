package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass13_1 {
	public static void main(String[] args) {
		/*
		 * 가위바위보
		 * 전적표시, 반복
		 * Step06. MainClass06. > GUI
		 * */
		
		String[] items= {"가위", "바위", "보"};
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 1.사용자 입력을 받는다.
		System.out.println("가위(s), 바위(r), 보(p) 입력: ");
		String clientInput=scan.nextLine();
		
		//2. "s" = 0, "r" = 1, "p" = 2로 변경
		int me=0;
		
		if(clientInput.equals("s")) {
			me=0;
		} else if(clientInput.equals("r")) {
			me=1;
		} else if(clientInput.equals("s")) {
			me=2;
		}
		
		//3. Computer도 랜덤으로 숫자 부여받음 (0,1,2)
		int com = ran.nextInt(3);
		
		// win, draw, lose 문자열 받을 변수 선언
		String result = null;
		
		//4. 승패 판단
		if( (me==0 && com==2) || (me==1 && com==0) || (me==2 && com==1)) { //이김
			result="win";
		}else if(me==com) { //비김
			result="draw";
		}else { //짐
			result="lose";
		}
		
		System.out.println("나: "+items[me]+" vs 컴: "+items[com]);
		System.out.println(result);
	}
}
