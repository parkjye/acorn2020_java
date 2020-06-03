package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * Q2.
		 * Random 객체를 이용해서 로또 번호를 6개 얻어내서 배열에 저장한다.
		 * 모두 다 저장이 되면 for문을 이용해서 배열에 저장된 모든 번호를
		 * 콘솔창에 순서대로 출력한다.		
		 * */
		
		int[] getLotto = new int[6];
		Random rNum = new Random();
		
		
		//for(int tmp : arry[]배열)
		
		for(int tmp : getLotto) {	
			tmp = rNum.nextInt(45)+1;
		}
		
		System.out.print("Lotto 번호: ");
		
		for(int z=0; z<getLotto.length;z++) {
			System.out.print(getLotto[z]+" ");
		}
	}
}
