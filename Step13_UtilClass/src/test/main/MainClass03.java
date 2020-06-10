package test.main;

import java.util.List;
import java.util.ArrayList;

public class MainClass03 {
	public static void main(String[] args) {
		//String type을 저장할 ArrayList객체 생성하고
		//참조값을 List 인터페이스 type지역변수 msgs에 담기
		
		List<String> msgs = new ArrayList<>();
		msgs.add("Taylor Swift");
		msgs.add("Lover");
		msgs.add("1989");
		msgs.add("Paper Lings");
		msgs.add("London Boy");
		
		//List 객체에 담긴 문자열을 for문을 이용해서 순서대로 콘솔창에 출력
		for(int i=0;i<msgs.size();i++) {
			System.out.println(msgs.get(i));
		}
		
		System.out.println("\n< 확장 for문을 사용해서 값 출력 >\n");
		
		//확장 for(<Generic Type> (지역)변수명 : List지역변수) { ... }
		for(String str: msgs) {
			System.out.println(str);
		}
		
		for(int i=msgs.size();i<msgs.size();i++) {
			System.out.println(msgs.get(i));
		}
		
	}//main
}//MainClass
