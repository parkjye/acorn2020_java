package test.auto;

public class Car {
	/*
	 * [ 접근제어자 ]
	 * 
	 * public : 다른 패키지에서도 접근 가능
	 * 
	 * protected : 상속 받은 클래스에서 접근 가능
	 * 
	 * default : 동일 패키지 내에서만 접근 가능 / 접근제어자를 사용하지 않으면 된다.
	 * 				ex. Car(Engine engine) { ... }
	 * 
	 * private : 자기 클래스에서만 접근 가능
	 * 
	 * */
	
	//필드
	protected Engine engine;
	
	//Engine 객체를 인자로 전달받는 생성자
	public Car(Engine engine) {
		//필드에 저장하기
		this.engine = engine;
	}
	
	//메소드
	public void drive() {
		if(engine==null) {
			System.out.println("Engine 객체가 없어서 달릴 수 없어요");
			return;
		}
		System.out.println("달려요");
	}
}//Car
