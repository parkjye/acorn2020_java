/*
 * [ 접근 지정자 ]
 * 
 * 	클래스, 필드, 메소드에 작성한다.
 * 
 * 1. public
 * 		- 어디에서나 자유롭게 접근 가능
 * 
 * 2. default (접근 지정자를 작성하지 않은 경우)
 * 		- 동일한 package 내에서만 접근 가능
 * 		- package가 다르면 import도 불가능
 * 
 * */

package test.mypac;
public class Marine {
	//공격력을 저장하고 있는 static 필드
	public static int attackPower=6; //static영역

	//에너지를 저장하고 있는 non static 필드
	public int energy=40; //heap영역
	
	
	//움직이는 메소드
	public void move() { //heap영역
		System.out.println("마린이 움직여요");
	}
	
	//공격하는 메소드
	public void attack() { //heap영역
		System.out.println(Marine.attackPower+"의 공격력으로 공격을 해요");
	}
	
	//현재 에머지를 출력하는 메소드
	public void showEnergy() {
		System.out.println("현재 에너지: "+this.energy);
	}
}

