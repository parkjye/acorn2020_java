package test.auto;

public class Jeep extends Car{	
	//생성자 (Car 생성자가 Engine객체를 전달받음)
	public Jeep(Engine engine) {
		super(engine);
	}
	
	//메소드
	public void load(String str){
		System.out.println(str+"이(가) 산을 달려요");
	}
	
	public void off() {
		System.out.println("하산할게요");
	}
	
	public int dayOff(int dd) {
		return dd;
	}
	
	public int Booking(int d) {
		return d;
	}

}
