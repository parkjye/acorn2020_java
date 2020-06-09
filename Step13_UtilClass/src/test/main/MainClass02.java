package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		
		//정수를 저장할 수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//nums배열에 values넣기
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//nums배열의 크기
		int size=nums.size();
		
		//nums배열의 각 index의 item얻어오기(참조)
		int num1=nums.get(0);
		Integer num2=nums.get(1);
		int num3 = nums.get(2);
		
		//nums배열의 1번방의 data를 4로 변경
		nums.set(1, 4);
		
		//nums배열의 index 1번 삭제, 해당 index의 다음값들은 한 자리씩 당겨짐(==빈 index X)
		nums.remove(1);
		
		//nums배열 삭제
		nums.clear();
	}
}
