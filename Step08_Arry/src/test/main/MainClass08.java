package test.main;
import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 	Q1.
		 *  cherry, apple, banana, melon, 7  
		 * 	5개의 문자열 중에서 하나가 랜덤으로 출력되게 하세요.
		 * 
		 *  Q2. 
		 *  5개의 문자열 중에서 3개가 한 줄에 한 번에 랜덤출력
		 *  ex. cherry | melon | cherry
		 *  	7 | apple | melon
		 *  	7 | 7 | 7
		 *  
		 *  ++) 확률 조정 cherry부터 역순으로 (++
		 * */
		
		String[] arrStr = {"cherry", "apple", "banana", "melon", "7"};
		Random ranNum = new Random();
		int getNum = ranNum.nextInt(5);
		
		//Q1.
		System.out.println(arrStr[getNum]);		
		
		//Q2.
		String[] dummy = new String[3];
		
		for(int i=0; i<dummy.length; i++) {
			int getNum2 = ranNum.nextInt(5);
			dummy[i] = arrStr[getNum2];
		}
		
		System.out.println(dummy[0]+" | "+dummy[1]+" | "+dummy[2]);
	
		
	} //main
}//class