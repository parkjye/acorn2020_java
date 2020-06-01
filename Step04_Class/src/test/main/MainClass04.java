package test.main;
import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * (1, 김구라, 노량진) 
		 * 이라는 int, string, string type의 값을 
		 * 객체의 필드에 저장하는 프로그래밍을 하세요.
		 * 단, 객체를 생성할 클래스의 이름은 Member로 작성하세요.
		 * */
		
		Member mem = new Member();
		
		mem.num=1;
		mem.name="김구라";
		mem.addr="노량진";
		
		Member.id=10;
		//Info.id=22; 에러
		
		
		// (2, 해골, 행신동)도 새로운 Member객체를 생성해서 담아보세요.
		Member mem2 = new Member();
		
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="노량진";
		
		mem.showInfo();
		mem2.showInfo();
	}
}

