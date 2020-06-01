package test.main;

import test.mypac.Rect;

public class MainClass05 {
	public static void main(String[] args) {

		// Rect객체 생성해서 참조값을 r1이라는 지역 변수에 담기
		Rect r1 = new Rect();
		
		//Rect객체의 필드에 값 대입
		r1.width = 10;
		r1.height = 20;
		
		//Rect 객체의 메소드를 호출해서 리턴되는 int값을 a라는 지역변수에 담기
		int a = r1.getArea();
		
		Rect r2 = new Rect();
		r2.width = 5;
		r2.height = 10;
		int b = r2.getArea();
		
		System.out.println(a);
		System.out.println(b);
	}
}

