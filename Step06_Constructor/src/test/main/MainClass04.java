package test.main;
import java.util.*;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * Q1. 프로그래밍의 목적: 무작위 정수를 얻어서 콘솔창에 출력.
		 * 
		 * */
		
		//Random객체를 생성해서 참조값을 지역변수에 담기
		Random r1 = new Random();
		
		//메소드를 호출하고 리턴값을 지역변수에 담기
		int getNum = r1.nextInt();
		
		//콘솔창 출력
		System.out.println(getNum);
		
		/*
		 * Q2. 원하는 범위 내에서 정수값을 얻어서 콘솔창에 출력
		 * 		( 범위: 1~45 ) 
		 * 		로또 각... 중복숫자제거, 배열, for(배열인덱스5까지) if return,
		 * 	int arr = []; 0-5,  
		 * */

		int getLotto = r1.nextInt(45)+1; //nextInt(45) 0~44
		System.out.println(Math.abs(getLotto)); //Math.abs() 절대값
		
	}
}
