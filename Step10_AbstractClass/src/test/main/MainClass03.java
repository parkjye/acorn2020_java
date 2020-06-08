package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey; //inner Class(내부클래스) 
//import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		//zoo 클래스에 있는 getMonkey()메소드를 호출해서 
		//리턴되는 값을 m1 지역 변수에 담아보세요.

		Zoo z1 = new Zoo();
		
		//inner Class type Monkey
		Monkey m1 = z1.getMonkey(); 

		//메소드 호출하기
		m1.say();
		
		//내부클래스
		Zoo.Tiger t1 = z1.getTiger();
		t1.say();
	}
}
