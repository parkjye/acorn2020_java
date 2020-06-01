package test.main;
import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		Car nc1 = obj1.getCar();
		
		//useSome() 메소드를 호출하세요.
		obj1.useSome("jye", nc1);
		
		//doSome() 메소드를 호출하세요.
		Radio r1 = obj1.getRadio();
		Speaker s1 = obj1.getSpeaker();
		obj1.doSome(r1, s1);
		
		obj1.doSome(new Radio(), new Speaker());	
		
	}
}
