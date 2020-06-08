package test.main;
import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 HandPhone type 지역변수 p1에 담기
		HandPhone p1 = new HandPhone();
		
		/*
		 * 인터넷을 해야한다. 즉 SmartPhone type 객체가 필요하다.
		 * p1안에 있는 값을 이용해서 인터넷을 할 수 있을까?
		 */
		SmartPhone p2 = (SmartPhone)p1;
		p2.doInternet(); 
		/*
		 * SmartPhone p2 = p1;
		 * HandPhone객체를 형변환없이 p2에 담게되면, `Class Cast Exception` 발생.
		 * HandPhone p1의 하위 Class = SmartPhone이기 때문에 사용 못함
		 * (부모 클래스는 자식 클래스의 자원 사용 X)
		 * */
		
	}
}
