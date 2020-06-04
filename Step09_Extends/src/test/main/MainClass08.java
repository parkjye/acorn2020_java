package test.main;

import test.auto.*;

public class MainClass08 {
	public static void main(String[] args) {
		//Truck 객체를 생성해서 .drive() .dump()메소드를 호출하세요.
		//Car c1 = new Car(new Engine());
		
		Truck t1 = new Truck(new Engine());
		t1.drive();
		t1.dump();
			
//		Truck t2 = new Truck(null);
//		t2.drive();
		
		//SportsCar 객체를 생성해서 .drive() 메소드를 호출하세요.
		SportsCar t3 = new SportsCar(new Engine());
		t3.drive();
		
		Jeep j1 = new Jeep(new Engine());
		j1.load("붕붕아");
		j1.off();
		System.out.println(j1.dayOff(7, 1)+"일에 연차낼게요");


	}
}
