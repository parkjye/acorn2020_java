package test.main;

import java.util.List;
import java.util.ArrayList;
import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type을 저장할 수 있는 ArryList 객체를 생성해서
		//	참조값을 List 인터페이스 type 지역변수 cars에 담기
		List<Car> cars = new ArrayList<Car>();
		
		
		//2. Car 객체(3)를 생성해서 List 객체에 저장해보세요.
		cars.add(new Car("벤틀리"));
		cars.add(new Car("롤스로이스"));
		cars.add(new Car("마세라티"));
		
		
		//3. for문을 이용해서 List객체에 저장된 모든 Car의 drive()메소드를 호출하세요.
		for(int i=0;i<cars.size();i++) {
			cars.get(i).drive();
		}
		
		System.out.println("\n tmp 지역변수를 사용해서 출력 \n");
		for(int i=0; i<cars.size();i++) {
			Car tmp=cars.get(i);
			tmp.drive();
		}
		
		System.out.println("\n확장 for문을 사용해서 출력\n");
		for(Car tmp:cars) {
			tmp.drive();
		}
		
	}//main
}//
