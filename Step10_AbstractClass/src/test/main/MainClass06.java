package test.main;

import test.mypac.Weapon;

public class MainClass06 {	
	//inner Class로 Weapon 추상클래스 상속받기
	public static class yourWeapon extends Weapon {
		@Override
		public void attack() {
			System.out.println("아무나 공격해요");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * useWeapon() 메소드를 호출하는게 목적이다.
		 * 호출하려고 보니 Weapon추상 클래스 type객체의 참조값이 필요하다.
		 * 따라서 Weapon 추상 클래스를 상속받은 클래스를 파일로 만들어야 한다.
		 * 만약 클래스를 파일로 만들지 않고 inner Class로 만든다면?
		 * */
		
		Weapon w1 = new yourWeapon();
		useWeapon(w1);
		
		
		//local inner class도 이용해보자
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("이제 그만 공격하자");
			}
		}
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
		
	}

		
	public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
		}
	}

