package test.main;

import test.mypac.Toy;
import test.mypac.ToyAirplane;
import test.mypac.ToyRobot;

public class MainClass02 {
	public static void main(String[] args) {
		
		//3. MainClass에서 호출		
		//동일한 type으로 객체 생성이 되서
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		//배열에 담을 수 있음
		Toy toys[] = {robot, airplane};
		
		for(int i = 0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}		
		
	} //main
} //MainClass02
