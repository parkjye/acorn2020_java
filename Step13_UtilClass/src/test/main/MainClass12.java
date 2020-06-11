package test.main;

import java.util.HashSet;
import java.util.Set;

import test.mypac.Car;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * ArrayList: 인덱스(0, 1, ... n)로 관리
		 * 
		 * HashMap: key:value, key:value, ... key:value로 관리할 때(순서 중요X)
		 * 
		 * [ HashSet은 Set 인터페이스를 구현한 클래스이다. ]
		 * 
		 * - 순서가 없다
		 * 
		 * - Key값 없다.
		 * 
		 * - 중복을 허용하지 않는다. (중복제거할 때 자주 사용한다)
		 * 
		 * - 어떤 data를 묶음(집합)으로 관리학자 할 때 사용한다.
		 * 
		 * - Set type으로 받음
		 * */
		
		//정수값을 저장할 수 있는 HashSet<>();
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		
		set1.add(20);
		set1.add(20);
		
		set1.add(30);
		set1.add(30);
		
		//문자열을 저장할 수 있는 HashSet 객체
		HashSet<String> set2 = new HashSet<>();
		set2.add("kim");
		
		set2.add("lee");
		set2.add("park");
		
		set2.add("lee");
		set2.add("park");
		
		//Car객체를 저장할 수 있는 HashSet 객체
		Set<Car> set3 = new HashSet<>();
		
		//참조값이 다르기 때문에 중복 아님
		set3.add(new Car("벤틀리"));
		set3.add(new Car("벤틀리"));
		
		set3.add(new Car("롤스로이스"));
		set3.add(new Car("마세라티"));
		set3.add(new Car("소나타"));
		
		//아래와 같이 참조값이 같으면 중복제거
		Car car1=new Car("그랜저");
		set3.add(car1);
		set3.add(car1);
		

	}
}
