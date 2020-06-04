package test.auto;

public class Jeep extends Car{	
	//생성자 (Car 생성자가 Engine객체를 전달받음)
	public Jeep(Engine engine) {
		super(engine);
	}
	
	//메소드
	public void load(String str){
		System.out.println(str+" 오프로드 하고싶다");
	}
	
	public void off() {
		System.out.println("하산할게요");
	}
	
	public int dayOff(int mm, int dd) {
		int sum = mm + dd;
		return sum;
	}

}
