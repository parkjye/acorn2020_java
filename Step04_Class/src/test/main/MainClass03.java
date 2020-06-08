package test.main;
import test.mypac.Car;
import test.mypac.MyUtil;
import test.mypac.YourUtil;

/*
 * heap 객체 / Stack 지역변수 / Static (field or Method)
 * 
 * Static
 * -**클래스 정보가 올라감
 * -필드, 메소드
 * -클래스명으로 구분
 * -클래스당 하나(single)만 만들어짐
 * -한 번 올라간 필드, 메소드는 해지가 안됨
 * -선언하면 모든 곳에서 공유하는 resource 개념
 * 
 * Stack
 * -**지역변수
 * 	-ex. car1, car2
 * 
 * heap
 * -**객체
 * -여러개의 객체가 만들어짐
 * -사용하지 않는 객체는 GC처리
 * 
 * */

public class MainClass03 {
	public static void main(String[] args) {
		
		new Car().drive(); //객체를 일회용으로 사용
		
		//참조값(Debug: ID)과 함께 Heap영역에 올라감
		Car car1=new Car();
		
		//car1의 참조값을 이용해서 drive()메소드 호출
		car1.drive(); 
		
		Car car2=new Car();
		car2.drive();
		
		//클래스명(MyUtil)과 함께 Static영역에 올라감
		//MyUril 클래스의 send() static 메소드 호출
		MyUtil.send();
		YourUtil.up();
		
		//static field에 값 넣기
		MyUtil.version = "10.1";
		System.out.println(MyUtil.version);
		
	}
}

