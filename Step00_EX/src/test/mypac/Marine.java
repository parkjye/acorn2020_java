package test.mypac;

public class Marine {
	public static int attackPower=6;
	public int energy=40;
	
	
	//움직이는 메소드
	public void move() {
		System.out.println("마린이 움직여요");
	}
	
	//공격하는 메소드
	public void attack() {
		System.out.println(Marine.attackPower+"의 공격력으로 공격을 해요");
	}
	
	public void showEnergy() {
		System.out.println("현재 에너지: "+this.energy);
	}
}

