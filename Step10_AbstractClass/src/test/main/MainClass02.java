package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//클래스를 직접 만들고 객체 생성을 해서 아래의 uesWeapon()메소드를 호출하세요.
		
		//1
		useWeapon(new Gun());
		
		//2
		Weapon w1 = new Gun();
		useWeapon(w1);
		
		//3
		Gun g1 = new Gun();
		useWeapon(g1);
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		//w.reload();
	}
}
