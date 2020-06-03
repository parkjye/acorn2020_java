package test.main;
import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		//Messenger 클래스의 static 메소드 3개를 하나씩 호출해보세요.
		
		Messenger.sendMessage("우와");
//		String a = Messenger.getMessage();
		System.out.println(Messenger.getMessage());
		Messenger.useCar(new Car());
		
		
		
	}
}
