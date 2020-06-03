package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을 수 있는 방 3개짜리 배열 객체를 생성해서 참조값을 
		 * 		bikes라는 지역변수에 담아보세요.
		 * 2. 배열의 각각의 방(0, 1, 2)에 Bike객체를 생성해서 담아보세요.
		 * 3. 반복문 for를 이용해서 배열의 각 방에 있는 Bike객체의 ride()메소드를 호출하세요.
		 * */
		
		Bike[] bikes = new Bike[3];
		
		for(int i=0; i<bikes.length; i++) {
			// Solution 1.
			bikes[i] = new Bike();
			bikes[i].ride();
		}	
	
		/*Solution 2.
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();

		for(int j=0; j<bikes.length; j++) {
			// i번째 방에 있는 Bike 객체의 참조값 불러오기
			Bike temp = bikes[j];
			//Bike 객체의 메소드 호출하기
			temp.ride();
		}*/ 

	}
}
