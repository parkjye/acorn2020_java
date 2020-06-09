package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 객체를 생성할 때 Generic 클랙스는 생략이 가능하다.
		 * 참조값을 담을 변수의 type에 명시하면 된다.
		 * */
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Orange> box2 = new FruitBox<>();
		FruitBox<Banana> box3 = new FruitBox<>();
		
		//객체를 바로 생성해서 사용할 때는 객체에 type명시 必
		new FruitBox<Apple>().push(new Apple());
		
		
	}
}
