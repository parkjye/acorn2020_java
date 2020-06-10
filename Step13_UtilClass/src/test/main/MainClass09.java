package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 3명의 회원정보(번호, 이름, 주소)를 HashMap객체에 담고
		 * HashMap 객체의 참조값을 ArrayList 객체에 순서대로 담아보세요.
		 * */
		Map<String, Object> mem1 = new HashMap<>();
		mem1.put("num", 1);
		mem1.put("name", "W.DRESSROOM");
		mem1.put("addr", "NEW YORK");
		
		Map<String, Object> mem2 = new HashMap<>();
		mem2.put("num", 2);
		mem2.put("name", "카밀");
		mem2.put("addr", "UREA");
		
		Map<String, Object> mem3 = new HashMap<>();
		mem3.put("num", 3);
		mem3.put("name", "테일러");
		mem3.put("addr", "LA");
		
		List<Map<String, Object>> mList = new ArrayList<>();
		mList.add(mem1);
		mList.add(mem2);
		mList.add(mem3);
		
//		int num=(int)mem1.get("num");
//		System.out.println(mList);
//		System.out.println(mList.get(0));
//		System.out.println(mList.get(0).get("num"));
//		
//		int num2=(int)mList.get(0).get("num");
//		System.out.println(num2);
		
		for(int i=0; i<mList.size(); i++) {
			int nums=(int)mList.get(i).get("num");
			String names = (String)mList.get(i).get("name");
			String addrs = (String)mList.get(i).get("addr");
			System.out.println(nums+" | "+names+" | "+addrs);
		}
		
		System.out.println("\n for 확장 \n");
		
		for(Map<String, Object> tmp : mList) {
			int nums=(int)tmp.get("num");
			String names=(String)tmp.get("name");
			String addrs=(String)tmp.get("addr");
			System.out.println(nums+" | "+names+" | "+addrs);
		}
		
		//참조연습
		List<Map<String, Object>> a = mList;
		Map<String, Object> b = mList.get(0);
		
		Object c=mList.get(0).get("num");
		Object d=mList.get(0).get("name");
		Object e=mList.get(0).get("addr");
		
		int f = (int)mList.get(0).get("num");
		String g = (String)mList.get(0).get("name");
		String h = (String)mList.get(0).get("addr");
		int i = ((String)mList.get(0).get("addr")).length();
				
	}
}
