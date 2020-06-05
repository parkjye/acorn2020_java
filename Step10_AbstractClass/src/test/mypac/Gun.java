package test.mypac;

public class Gun extends Weapon{

	@Override
	public void attack() {
		System.out.println("빵야");
	}
	
	public void reload()
	{
		System.out.println("재장전합니다.");
	}
}
