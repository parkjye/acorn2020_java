package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * Q1.
		 * Scanner 객체를 이용해서 문자열을 5번 입력받는다. (while, for?)
		 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
		 * 모두 다 입력 받은 후 for문을 이용해서 배열에 저장된
		 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성하세요
		 * */
		
		String[] arrStr = new String[5]; //문자 배열		
		Scanner scanStr = new Scanner(System.in); //스캔
		
		for(int i=0;i<arrStr.length;i++) {
			System.out.println((i+1)+"번째 문자열 입력");
			String getStr = scanStr.nextLine();
			
			arrStr[i] = getStr;
		}
		
		for(int j=0; j<arrStr.length; j++) {
			System.out.print(arrStr[j]+" ");
				if(j==arrStr.length-1) { //마지막 개행
					System.out.println();
				}
		}
		
		/* Resource leak: 'scan' is never closed
		 * 스캐너객체 사용하고 close해줘야함 리소스 누수
		 * */
		scanStr.close(); //
		
	} //public static void main
} //class