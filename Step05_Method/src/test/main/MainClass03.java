package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		
		MyObject obj1=new MyObject();
		
		//.setNum(), .setName(), .uesCar() 메소드를 호출하세요.
		obj1.setNem(44);
		obj1.setName("jye");
		obj1.useCar(new Car());
		//Car c = new Car();
		//obj1.useCar(c);
		
	}
}
