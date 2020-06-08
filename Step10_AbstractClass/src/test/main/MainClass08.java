package test.main;

import test.mypac.Weapon;

public class MainClass08 {	
	//클래스의 필드에 Weapon type의 참조값 넣어두기
	//static 메소드내에서는 static자원만 사용 가능하기 때문에 static필드 선언
	static Weapon w = null;
	static Weapon w1 = new Weapon() { //Anonymous inner class
		@Override
		public void attack() {
			System.out.println("수중 공격을 해요");
			
		}
	};
	
	public static void main(String[] args) {
		//필드에 저장된 Weapon type의 참조값을 이용해서 useWeapon() 메소드 호출하기
		useWeapon(w1);
	}
			
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
}//MainClass08

