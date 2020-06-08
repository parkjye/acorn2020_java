package test.main;
import test.mypac.*;
public class MainClass05 {
	public static void main(String[] args) {
		
		//SmartPhone 객체를 생성해서 Phone type 지역변수 p1에 담기
		//자식 class를 부모 class에 담아도 됨
		Phone p1 = new SmartPhone();
		
		//Q. p1에 들어있는  참조값을  이용해서 전화를 건다면
		p1.Call();
		
		//p1에 들어있는 참조값을 이용해서 이동 중에 전화를 걸고 싶다면,
		//p1에 들어있는 참조값을 HandPhone type 지역변수에 casting해서 담는다 
		HandPhone p2 = (HandPhone)p1;
		p2.mobileCall();
		p2.Call();
		
		p1.Call();
		
		//p1에 들어있는 참조값을 이용해서 인터넷을 하고 싶다면
		SmartPhone p3 = (SmartPhone)p1;
		p3.Call();
		p3.doInternet();
		
		p1.Call();
		
	}
}
