package test.main;
import test.human.*;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적: 영화를 보고 싶다.
		 * 영화를 보는 프로그래밍의 목적을 달성해보세요.
		 * */
		
		/*
		 * 1. Men객체 생성
		 * 2. Men객체는 Person Class의 상속을 받고,
		 * 		생성자는 Blood type이 필요함
		 * 3. Blood Class의 생성자는 String type 2개를 받음
		 * */ 
		
		//Way1.
		Men m1 = new Men(new Blood("+","B"));
		m1.seeMovie();
		
		// Way2.
		Blood b1 = new Blood("+", "B");
		Men men = new Men(b1);
		men.seeMovie();
		
		// Way3. 일회용
		new Men(new Blood("+", "B")).seeMovie();

	}
}
