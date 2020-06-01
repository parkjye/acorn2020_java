package test.main;
import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 c1이라는 이름의 변수에 담기.
		Car c1 = new Car("벤틀리");
		Car c2 = new Car("롤스로이스");
		
		//c1에 담겨있는 참조값을 이용해서 .drive() 메소드를 호출
		c1.drive();
		c2.drive();
	}
}
