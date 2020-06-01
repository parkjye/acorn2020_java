package test.main;

import test.mypac.*;

public class MainClass05 {
	/*
	 * test.mypac 패키지에 다양한 모양의 메소드를 가지는
	 * 클래스를 정의하고
	 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출하세요.
	 * */
	public static void main(String[] args) {
		
		PlayMusic p1 = new PlayMusic();
		
		p1.getName("김구라");
		p1.useCom(4, new Speaker());
		p1.getCar(new Car());
		
		p1.startM("Start");
		p1.endM(44, "End");
		
		////////////////////////
		
		PlayMusic pm1 = new PlayMusic();
		
		
	}	
}
