package test.mypac;

public class Phone extends Object{ //MainClass01
	//extends Object는 생략가능. 모든 class는 object클래스를 자동으로 상속받는다.

	public Phone() {
		System.out.println("Phone() 생성자 호출");
	}
	
	//전화거는 메소드
	public void Call() {
		System.out.println("전화를 걸어요");
	}

}
