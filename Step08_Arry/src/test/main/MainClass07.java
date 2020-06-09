package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * Q2.
		 * Random 객체를 이용해서 로또 번호를 6개 얻어내서 배열에 저장한다.
		 * 모두 다 저장이 되면 for문을 이용해서 배열에 저장된 모든 번호를
		 * 콘솔창에 순서대로 출력한다. (중복제거 X)
		 * */
		
		int[] getLotto = new int[6];
		Random rNum = new Random();
		
		for(int i=0;i<getLotto.length;i++) {
			getLotto[i] = rNum.nextInt(45)+1;
		}
		
		for(int j=0;j<getLotto.length;j++) {
			System.out.println(getLotto[j]+" ");
		}
	}
}
