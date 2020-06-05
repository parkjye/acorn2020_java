package test.main;
/*
 * 클래스 안에 만든 클래스: inner Class
 * 메소드 안에 만든 클래스: local inner Class
 * */

public class MainClass04 {
	public static void main(String[] args) {
		
		//헐? 메소드안에서도 클래스 정의 가능?
		class Gura{
			public void say() {
				System.out.println("안녕! 나는 구라야");
			}
		}
		
		//메소드안에 정의한 클래스를 이용해서 객체 생성하고 
		//참조값을 지역변수 g1에 담기
		Gura g1 = new Gura();
		g1.say();
	}
}
