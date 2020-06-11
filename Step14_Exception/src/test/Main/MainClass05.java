package test.Main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			//send() 메소드에서 발생하는 Exception 을 처리 해야 한다.
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
