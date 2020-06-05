package test.human;

public class Men extends Person{
	//Person 클래스의 생성자는 Blood type을 받으니까 상속받는 MenClass도 생성자 생성
	public Men(Blood blood) {
		super(blood); //부모 생성자에 필요한 값을 전달한다.
	}
	
	//메소드
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}

}
