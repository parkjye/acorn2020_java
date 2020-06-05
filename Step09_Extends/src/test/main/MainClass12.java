package test.main;
import test.human.*;
public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적: 독서를 하고 싶다.
		 * 독서하는 프로그매잉을 해보세요.
		 * */
		
		//1
		Women w1 = new Women(new Blood("-","B"));
		w1.reading();
		
		//2
		Blood b1 = new Blood("+","O");
		Women w2 = new Women(b1);
		w2.reading();
		
		//3
		new Women(new Blood("+","AB")).reading();
	}
}
