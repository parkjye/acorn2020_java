package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * [ ArrayList (중요) ]
		 * 
		 * index로 관리되는 목록(list)객체이다.
		 * 
		 * `참조 데이터 type`만 담을 수 있다.
		 * 
		 * 가변배열: index가 유동적이다. (방 번호를 늘리거나 줄일 수 있다.)
		 * 
		 * ex. ArrayList<Intager> i = new ArrayList<Intager>();
		 * 		<Generic>, let names=[]; new ArrayList<String>();
		 * 
		 * ArryList에서 가장 많이 사용되는 메소드는 List type에 있다.
		 * 따라서, List 인터페이스 type으로 객체 생성을 많이함.
		 * ex. List<String> msgs = new ArrayList<String>();
		 * 
		 * */

		//Integer type을 담을 수 있는 ArrayList 객체 생성
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(4);
		nums.add(1);
		nums.add(0);
		nums.add(2);
		
		//String type의 ArrayList 객체 생성
		ArrayList<String> names = new ArrayList<String>();

		//String type의 참조값 저장하기
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//배열방의 크기 얻어오기
		int as = names.size();
		System.out.println(as);
		
		//각 방에 저장된 값 불러오기
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		System.out.println(names);
		
		//특정 방의 값 수정(덮어쓰기)
		names.set(1, "주뎅이");
		System.out.println(names);
		
		//특정 방의 값 삭제(방 자체를 제거하기)
		names.remove(1);
		System.out.println(names);
		
		//모든 방 삭제
		names.clear();
		System.out.println(names);
		
		
	}
}
