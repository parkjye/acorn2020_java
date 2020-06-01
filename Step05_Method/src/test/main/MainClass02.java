package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		
		// 동일한 type, 다른 ID(참조값)을 가지고 있다.
		Car a = obj1.getCar();
		Car b = obj1.getCar();
		Car c = obj1.getCar();
		
		//지역변수에 담긴 객체 사용하기
		a.drive();
		b.drive();
		c.drive();
	}

}
