package test.Main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("나눌 숫자 입력: ");
			String inputNum1 = scan.nextLine();
			
			System.out.println("나누어 지는 숫자 입력: ");
			String inputNum2 = scan.nextLine();
			
			double num1=Double.parseDouble(inputNum1);
			double num2=Double.parseDouble(inputNum2);
			
			double result=num2/num1;
			System.out.println(num2+" 를 "+num1+" 으로 나누면 = "+result);		
			
		}catch(NumberFormatException nfe) { //문자입력
			System.out.println("숫자만 입력하세요.");
			nfe.printStackTrace();
		}catch(ArithmeticException ae) {
			System.out.println("나눌 숫자는 > 0");
			//ae.printStackTrace();
		}
		
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}
}
