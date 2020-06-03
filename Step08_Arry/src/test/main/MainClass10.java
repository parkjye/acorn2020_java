package test.main;
import java.util.Random;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 	Q3. 
		 * 	cherry | cherry | cherry == 10점
		 * 	apple | apple | apple == 20점
		 * 	banana | banana | banana == 30점
		 * 	melon | melon | melon == 40점
		 * 	7 | 7 | 7 == 1000점
		 * 
		 * */
		
		String[] arrStr = {"cherry", "apple", "banana", "melon", "7"};
		String[] dummy = new String[3];
		Random ranNum = new Random();

		//부여할 점수를 미리 배열에 담아 놓는다.
		int[] dummyArr = new int[3];
		int[] points = {10, 20, 30, 40, 1000};
		
		
		if(dummy[0]==dummy[1] && dummy[1]==dummy[2]) { //3개가 모두 같은경우
			/*점수 부여. dummy배열에 있는 숫자 3개가 같으므로
			 * 아무거나 하나 읽어서 점수를 얻어낸다.
			 * */
			
			//int point = points[dummy[0]]; //change to int;
			//System.out.println(point+"점 입니다.");
			
		} else { 
			System.out.println("0점");
		}

		
	} //main
} //class
