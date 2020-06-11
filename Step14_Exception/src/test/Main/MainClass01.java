package test.Main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		//숫자 형식의 문자열을 입력 받는다. "10.1", "11" 등
		String inputNum=scan.nextLine();
		
		/*
		 * - 예외가 발생할 가능성이 있는 곳을 묶어준다.
		 * - try{...} catch{...} 블록안에 있는 변수는 지역변수
		 * - (Java에서는) Exception을 객체로 관리한다.
		 * 
		 * try{ 
		 * 		...
		 * 	} catch(Exception type1 변수) {
		 * 		...
		 * 	} catch(Exception type2 변수) {
		 * 		...
		 * 	} catch(Exception type3 변수) {
		 * 		...
		 * 	}
		 * */
		
		try {
			//입력받은 숫자를 실제 숫자로 바꾼다.
			double num = Double.parseDouble(inputNum);
			
			//입력한 숫자에 100을 더한다.
			double result = num+100;
			
			System.out.println("입력한 숫자+100 = "+result);
		} catch(NumberFormatException nfe) {
			System.out.println("숫자를 입력하세요.");
			
			//예외정보를 콘솔창에 출력하기
			nfe.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
		
		

		
		
	}
}
