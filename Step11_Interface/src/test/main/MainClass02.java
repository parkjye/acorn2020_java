package test.main;

//import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	//필드에 Remocon type
	static Remocon r3 = new Remocon() {
		
		@Override
		public void up() {
			// TODO Auto-generated method stub
			System.out.println("물건을 올려요");
			
		}
		
		@Override
		public void down() {
			// TODO Auto-generated method stub
			System.out.println("물건을 내려요");
		}
	};
	
	public static void main(String[] args) {
		/*
		 * Remocon 인터페이스를 구현한 익명의 local inner class의 생성자를 호출해서 
		 * 참조값을 얻어내서 Remocon type의 지역변수 r1에 대입하기.
		 * */
		
		Remocon r1 = new Remocon() {
			// 자동으로 implements or extends된다.
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("볼륨을 올려요");
			}

			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("볼륨을 내려요");
			}
			
		};
		
		useRemocon(r1);
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("채널을 올려요");
				
			}
			
			@Override
			public void down() {
				System.out.println("채널을 내려요");
				
			}
		});
		
		useRemocon(r3);
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
