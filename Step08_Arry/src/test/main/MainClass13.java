package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * [ 컴퓨터와 가위바위보 하기]
		 * 
		 * 가위(s), 바위(r), 보(p):s
		 * 
		 * 나: 가위 vs 컴: 보
		 * win~ or lose~
		 * */
		
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine(); //s
		
		Random ran = new Random();
		String[] items = {"가위", "바위", "보"};
		int[] nums = new int[3];
		
	

		while(true) {
			int getNum = ran.nextInt(3); //2
			
			if(getNum > 1) {
				System.out.println("win");
			} else if(getNum > 2) {
				System.out.println("draw");
			} else {
				System.out.println("lose");
			}
			
			System.out.println();
			
		}
		
	} //main
} //class
