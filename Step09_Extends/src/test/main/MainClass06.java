package test.main;
import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		
		SmartPhone p1 = new SmartPhone();
		p1.doInternet();
		p1.mobileCall();
		
		//@Override
		p1.Call(); 
		p1.takePicture();
	}

}
