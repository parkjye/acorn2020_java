package test.main;
import test.human.*;
public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍 목적: 아래의 useMen() 메소드 호출
		 * 아래의 useMem() 메소드를 호출해 보세요.
		 * */
		
		//1. Men객체를 생성해서 참조값을 m1이라는 지역변수에 담기 
		Men m1 = new Men(new Blood("+","O"));
		
		//1-1. useMen()메소드를 호출하면서 Men객체의 참조값 전달하기
		useMen(m1);
		
		/*
		 * caution! 위의 코드를 실행하면 객체(참조값)는 총 4개가 생성된다.
		 * new Men / new Blood / (필드)String rh="+" / (필드)String type="O"
		 * */
		
		//2.
		MainClass13.useMen(new Men(new Blood("+","O")));	
	}
	
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
}
