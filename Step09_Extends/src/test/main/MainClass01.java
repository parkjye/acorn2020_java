package test.main;
import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		
		//다형성: 하나의 객체를 여러가지 type으로 받을 수 있다.
		
		//Phone클래스로 객체 생성해서 참조값을 지역변수에 담기
		Phone p1=new Phone();
		Object p2=new Phone();
		p1.Call();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역변수에 담기
		//상속(extends)받으면 부모 클래스에 있는 필드, 메소드를 자식 클래스에서 사용할 수 있다.
		HandPhone p3 = new HandPhone();
		Phone p4 = new HandPhone();
		Object p5 = new HandPhone();
		

		/*
		 * Phone type으로 받으면 Phone type이상 메소드만 사용 가능. (객체의 부모타입)
		 * 
		 * ex. p4는 HandPhone객체를 생성해서, Phone type 지역변수에 담아서
		 * 		Phone, Object의 기능만 사용할 수 있다. 	
		 * */
		
		p3.Call();
		p3.mobileCall();
		p4.Call();
		
		/*	같은 참조값(id)을 가지고 있지만,
		 *  객체를 받은 type에 따라 사용할 수 있는 필드, 메소드가 다르다.(like 사용설명서)
		 * */

		
		 /* 
		  * HandPhone p8 = (HandPhone) p5;의 경우
		  * (casting)연산자를 사용해야 함.
		  * 
		  * 단, Phone > HandPhone으로 캐스팅 안됨. Phone이 상위클래스
		 */
		HandPhone p8 = (HandPhone) p5;
		
		p8.Call();
		p8.mobileCall();
		
		//이미 만들어진 객체의 참조값을 다른 type으로 받아보기
		
		Phone p6 = p3;
		Object p7 = p3;
		//String str=p3; //오류, 부모타입으로 받을 수 있다.
		
		
	}//main
}//Class
