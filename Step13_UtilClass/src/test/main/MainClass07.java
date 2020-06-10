package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		//default 생성자를 이용해서 객체를 생성한경우
		MemberDto m1 = new MemberDto();
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		
		//인자로 필드에 저장할 생성자를 이용해서 객체를 생성한 경우
		MemberDto m2 = new MemberDto(2, "해골", "행신동");
		
		//위에서 생성한 객체의 참조값을 List 객체에 담아보세요.
		List<MemberDto> mList = new ArrayList<>();
		mList.add(m1);
		mList.add(m2);
		
		/*
		 * for문을 이용해서 List객체에 담긴 MemberDto 객체를 순서대로 참조해서
		 * 아래와 같은 형식으로 출력하세요.
		 * 
		 * 1 | 김구라 | 노량진
		 * 2 | 해골 | 행신동
		 * */
		
		//1
		for(MemberDto md : mList) {
			System.out.println(md.getNum()+" | "+md.getName()+" | "+md.getAddr());
		}		
		
		//2
		for(MemberDto md : mList) {
			//출력할 문자열 구성
			String line=md.getNum()+" | "+md.getName()+" | "+md.getAddr();
			//출력
			System.out.println(line);
		}
		
		//참조 테스트
		List<MemberDto> a = mList;
		
		MemberDto b=mList.get(0);
		
		int c = mList.get(0).getNum();
		
		String d = mList.get(0).getName();
		
		String e = mList.get(0).getAddr();
		
		int f = mList.get(0).getName().length();
	
	}
}
