package test.main;

//import test.mypac.Box; 
//import test.mypac.Car;
//import test.mypac.Rect;
//import test.mypac.Member; 

import test.mypac. * ; 

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		Member a = Box.mem; //null
		Rect b = Box.rect; //null
		Car c = Box.car; //참조값이 들어있다.
		c.drive(); //메소드 호출 가능
		
		Box.car.drive();
		System.out.println();
		//public static PrintStream out = new ___
		
		//null, 참조값이 없어서 에러남. (NullPointerException 발생)
		a.showInfo(); 
		b.getArea();		
		
	}
}
