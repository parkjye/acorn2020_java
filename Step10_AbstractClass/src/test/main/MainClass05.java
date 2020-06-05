package test.main;

public class MainClass05 {
	//필드
	public String myName="김구라";
	public static String yourName="원숭이";
	
	public static void main(String[] args) {
		//static 메소드 안에서 this는 의미가 없고 사용불가
//		System.out.println(this.myName);
//		System.out.println(MainClass05.myName);
		
		//myName은 non static필드이므로 참조값으로 접근 가능
		System.out.println(new MainClass05().myName);
		
		//yourName 이라는 필드는 static이므로 클래스명. 으로 접근가능
		System.out.println(MainClass05.yourName);
		
		//yourName과 main() 메소드는 동일 클래스 내부에 있기때문에 클래스명 생략 가능
		System.out.println(yourName);
		
		//this는 static 메소드 안에서 의미가 없음 (객체안에서 의미있음)
		//System.out.println(this.yourName); 
		
	}
}
