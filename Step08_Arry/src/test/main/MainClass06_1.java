package test.main;
import java.util.Scanner;

public class MainClass06_1 {
	public static void main(String[] args) {
        /*
         *  [ 연습 2 ]
         *  
         * 1.
         * scanner 객체를 이용해서 문자열을 5번 입력 받는다.
         * 입력 받은 문자열은 차례대로 배열에 저장되어야 한다.
         * 모두 입력 받은 후 for문을 이용해서 배열에 저장된 
         * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요.
         *
         */
		
		Scanner scanStr = new Scanner(System.in);
		String[] strArry = new String[5]; //문자배열
		inputStr(strArry,scanStr);
		outputStr(strArry);
		}
	
	//문자열 입력
	public static void inputStr(String[] inStrArry, Scanner scanS) {
		for(int i=0; i<inStrArry.length; i++) {
			System.out.println((i+1)+"번째 문자열을 입력하세요");
			inStrArry[i] = scanS.nextLine();
		}
	}
	
	// 문자열 출력
	public static void outputStr(String[] outStrArry) {
		for(int i=0; i<outStrArry.length; i++) {
			System.out.print(outStrArry[i]+" ");
			if(i==outStrArry.length-1) {
				System.out.println();
			}
		}
	}
}
