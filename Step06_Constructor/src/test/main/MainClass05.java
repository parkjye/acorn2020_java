package test.main;

import java.util.*;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * Q1. 키보드로 부터 문자열을 입력받아서 콘솔창에 출력
		 */
		
		Scanner scan2 = new Scanner(System.in);
		//키보드로 입력받기 위해서 콘솔창을 열리게 해야한다.
		
		System.out.println("문자열을 입력하세요.");
		//Scanner 객체의 메소드를 이용해서 문자열(String)입력 받기

		String getStr = scan2.nextLine();
	
		System.out.println(getStr+"을(를) 입력했습니다."+"\n총 "+getStr.length()+"글자 입니다.");
		System.out.println("\nmain메소드가 종료됩니다.");
	}
}
