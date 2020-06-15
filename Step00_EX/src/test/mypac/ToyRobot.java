package test.mypac;

public class ToyRobot implements Toy{ //MainClass02
	
	//2-2. (ToyAirplane class의 메소드와 비교)
	// 동일한 Interface에 있는 메소드지만,
	// 객체에 따라 메소드를 별도로 구현을 할 수 있다. 
	
	@Override
	public void walk() {
		System.out.println("로봇은 걸을 수 있어요");
		
	}

	@Override
	public void run() {
		System.out.println("로봇은 달릴 수 있어요");
		
	}

	@Override
	public void alarm() {
		System.out.println("로봇은 알람 기능이 없어요");
		
	}

	@Override
	public void light() {
		System.out.println("로봇은 라이트가 있어요");
		
	}
	
	
}
