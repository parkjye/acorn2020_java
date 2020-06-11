package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 검색할 단어를 입력하세요: house
		 * house의 뜻은 집입니다.
		 * */
		Scanner scan = new Scanner(System.in);		
		System.out.print("검색할 단어를 입력하세요: ");
		String temp = scan.next();
		
		//1
		boolean isExist=dic.containsKey(temp);
		
		if(isExist) {
			System.out.println(temp+"의 뜻은 "+dic.get(temp)+"입니다.");
			return;
		} System.out.println("단어가 없습니다.");
		
		//2.
		//Map객체에서 입력한 문자열로 저장된 값 읽어오기
		String mean = dic.get(temp);
		
		//존재하지 않으면
		if(mean == null) {
			System.out.println(mean+" 은(는) 목록에 없습니다.");
		}else {
			//출력할 문자열 구성하기
			String line = mean+"의 뜻은 "+mean+" 입니다.";
			//출력하기
			System.out.println(line);
		}
		
	}
}
