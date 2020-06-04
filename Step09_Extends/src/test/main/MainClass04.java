package test.main;
import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		
		//SmartPhone type의 지역변수 p1을 만들 준비만 하고 만들어지지 않은 상태
		SmartPhone p1;
		
		// SmartPhone type의 지역변수 p2를 만들고 비워둔 상태(참조값이 담기지 않음)
		SmartPhone p2 = null;
		
		// SamrtPhone type의 지역변수 p3를 만들고 참조값을 넣어둔 상태
		SmartPhone p3 = new SmartPhone();
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립하지 않음
		//p1.Call();
		
		//null값이라 메소드 없음 `Null Pointer Exception` 발생.
		p2.Call();
		
		//p3에는 참조값이 들어있으므로 정상적으로 사용가능
		p3.Call();
		
	}//main()
}//class
