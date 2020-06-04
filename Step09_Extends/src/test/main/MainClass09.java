package test.main;

import test.auto.*;

public class MainClass09 {
	public static void main(String[] args) {
		//Car클래스를 상속받아서 만든 클래스로 객체를 생성해서
		//아래의 useCar() 메소드를 호출하세요.
		
		Jeep jp = new Jeep(new Engine());
		useCar((Car)jp); 
		MainClass09.useCar(jp);
		
	}//main
	public static void useCar(Car car) {
		car.drive();
	}
	
}//class
