package test.main;
import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		
		//Phone클래스로 객체 생성해서 참조값을 지역변수에 담기
		//다형성: 하나의 객체를 여러가지 type으로 받을 수 있다.
		//override: 
		
		Phone p1=new Phone();
		Object p2=new Phone();
		p1.Call();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역변수에 담기
		//상속받으면 부모클래스에있는 메소드를 자식클래스에서 사용할 수 있다.
		HandPhone p3 = new HandPhone();
		Phone p4 = new HandPhone();
		Object p5 = new HandPhone();
		// Object type으로 받으면 Object type이상 메소드만 사용가능. (a객체의 부모타입으로)
		
		p3.Call();
		p3.mobileCall();
		p4.Call();
		
		//이미 만들어진 객체의 참조값을 다른 type으로 받아보기
		Phone p6 = p3;
		Object p7=p3;
		//같은 참조값(id)을 가지고 있지만, 객체를 받은 type에 따라 사용할 수 있는 필드, 메소드가 다르다.(like 사용설명서)
		
		
		//String str=p3; //오류, 부모타입으로 받을 수 있다.

		
	}//main
}//Class
