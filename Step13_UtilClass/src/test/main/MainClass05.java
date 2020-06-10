package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Info;

public class MainClass05 {
	public static void main(String[] args) {
		//Info 클래스로 객체를 생성해서 참조값을 ir1이라는 지역변수에 담기
		Info i1 = new Info();
		
		//필드는 public으로 선언했기 때문에 직접 접근해서 대입연산자로 값을 대입하기.
		i1.num=1;
		i1.name="김구라";
		i1.addr="노량진";
		
		Info i2 = new Info();
		i2.num=2;
		i2.name="해골";
		i2.addr="행신동";
		
		//위의 Info type객체의 참조값을 List객체에 순서대로 담아보세요.
		List<Info> info = new ArrayList<>();
		info.add(i1);
		info.add(i2);
		
		//for문을 이용해서 출력
		for(Info infos:info) {
			System.out.println(infos.num+" | "+infos.name+" | "+infos.addr);
		}
	}
}
