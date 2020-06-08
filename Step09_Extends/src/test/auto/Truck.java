package test.auto;

public class Truck extends Car{ //MainClass08 ~ 

	public Truck(Engine engine) {
		//자식 생성자로 받은 객체를 부모 생성자에 전달해주어야 부모객체가 생성된다.
		super(engine); //super()는 부모생성자를 가리킨다.
	}
	
	//메소드
	public void dump() {
		System.out.println("짐을 쏟아내요");
	}
	
	
}//Truck
