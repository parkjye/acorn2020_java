package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() { // ()->{}
				// TODO Auto-generated method stub
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		//메소드가 한 개일 경우에만 사용 가능하다.
		Drill d1 = ()->{
			System.out.println("벽에 20mm의 구멍 내기");
		};
		
		useDrill(d1);
		useDrill(()->{
			System.out.println("핸드폰에 1mm의 구멍 내기");
		});
		
	}//main
	
	public static void useDrill(Drill d) {
		d.hole();
	}
	
}//Class
