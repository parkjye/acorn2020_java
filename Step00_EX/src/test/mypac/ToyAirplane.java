package test.mypac;

public class ToyAirplane implements Toy{ //MainClass02

	// 2. Toy 인터페이스에 있던 메소드를 여기서 구현. 
	
	@Override
	public void walk() {
		System.out.println("비행기는 걷지 못해요");
		
	}

	@Override
	public void run() {
		System.out.println("비행기는 달리지 못해요");
		
	}

	@Override
	public void alarm() {
		System.out.println("비행기는 알람 기능이 있어요");
		
	}

	@Override
	public void light() {
		System.out.println("비행기는 라이트가 없어요");
		
	}

}
