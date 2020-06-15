package test.mypac;
/*
 * [ 새로운 스레드 만드는 방법 ]
 * 
 * 1. Thread 클래스를 상속 받은 클래스를 정의한다.
 * 
 * 2. run() 메소드를 오버라이드 한다.
 * 
 * 3. run() 메소드 안에서 새로운 스레드에서 해야할 작업을 코딩한다.
 * 
 * 4. 만든 클래스로 객체를 생성하고 
 * 		해당 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다.
 * 		(Frame02/test.main)
 * 
 * */
public class CountThread extends Thread{ //1단계, Frame02
	
	@Override 
	public void run() { //2단계
		
		//3단계(run()메소드 안쪽이 새로운 작업단위가 된다.)
		int count=0;
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			count++;
			System.out.println("현재 카운트: "+count);
			if(count==10) {
				break;
			}
		}
		
	}//run()
	
}//CountThread
