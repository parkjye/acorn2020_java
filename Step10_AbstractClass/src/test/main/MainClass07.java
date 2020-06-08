package test.main;

import test.mypac.Weapon;

public class MainClass07 {	
	//run했을 때 실행순서가 시작되는 특별한 main메소드
	public static void main(String[] args) {
		/*
		 * Weapon 추상 클래스를 상속받은 
		 * 익명(Anonymoue)의 local inner class의 생성자를 호출해서,
		 * Weapon type의 참조값을 얻어내서 지역변수 w1에 담기
		 * */
		Weapon w1 = new Weapon() { //--익명클래스(Anonymoue local inner Class
			@Override
			public void attack() {
				System.out.println("아무나 공격해요");
			}
			
		};//익명클래스--
		
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공중 공격을 해요");
				
			}
		};

		//지역변수 사용
		useWeapon(w1);
		useWeapon(w2);
		
		//객체를 일회용으로 사용
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("지상 공격을 해요");
			}
		});
	}
		
	public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
		}
	}

