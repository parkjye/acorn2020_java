package test.mypac;

public class Car { //MainClass02
	//필드
	public String name;
	
	//생성자
	public Car(String name) {
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.name=name; //this (Car의 객체.전역변수)
	}
	
	//메소드
	public void drive() {
		System.out.println(name+"이(가) 달려요");
	}
}
