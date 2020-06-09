package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		
		//String type을 저장할 수 있는 index로 관리되는 목록(list)객체
		//참조 데이터 type만 담을 수 있다.
		//ex ArrayList<Intager> i = new ArrayList<Intager>();
		//<Generic>, let names=[]; new ArrayList<String>();
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
