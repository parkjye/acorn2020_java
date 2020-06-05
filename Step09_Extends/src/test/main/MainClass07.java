package test.main;
import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 자식클래스를 생성자 호출하면 부모클래스 생성자도 호출
		 * 실행 후 콘솔창을 확인하면 부모 생성자가 먼저 호출되는 것을 알 수 있다.
		*/
		new SmartPhone();
	}
}
