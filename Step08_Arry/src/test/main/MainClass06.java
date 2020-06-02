package test.main;

import java.util.Random;
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
				if(j==4) { //마지막 개행
					System.out.println();
				}
		}
		
		/*
		 * Q2.
		 * Random 객체를 이용해서 로또 번호를 6개 얻어내서 배열에 저장한다.
		 * 모두 다 저장이 되면 for문을 이용해서 배열에 저장된 모든 번호를
		 * 콘솔창에 순서대로 출력한다.		
		 * */
		
		int[] getLotto = new int[6];
		Random rNum = new Random();
		
		for(int x=0; x<getLotto.length; x++) {	
			getLotto[x] = rNum.nextInt(45)+1;
			
			for(int y=0; y<x; y++) { //랜덤 숫자 중복제거
				if(getLotto[x]==getLotto[y]) {
					x--;
				}
			} //랜덤숫자 중복제거 ----끝
		}
		
		System.out.print("Lotto 번호: ");
		
		for(int z=0; z<getLotto.length;z++) {
			System.out.print(getLotto[z]+" ");
		}
		
	} //public static void main
} //class