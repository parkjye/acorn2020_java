package test.main;

import javax.swing.JFrame;

public class MainClass06 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("김구라");
		
		//창의 위치와 폭, 높이(x, y, width, height)
		f.setBounds(100, 100, 500, 500);
		
		//창이 화면상에 보이게 한다.
		f.setVisible(true);
		
		//창을 닫았을 때 프로세스도 자동으로 종료되도록 한다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* == f.setDefaultCloseOperation(3); 같은 동작을 한다.
		 * 
		 * cf. class에는 (특정 동작을 하는)상수값이 정해져있다. 
		 * 		final(예약어) == 상수화(값을 바꿀 수 X)가 된다. 
		 * 
		 * 		public class JFrame {
		 * 			public static final int EXIT_ON_CLOSE = 3;
		 * 		}
		 * 
		 * 	상수 개념 EX.
		 * 		3.14159
		 * 		final double PI = 3.14159;
		 * 		PI
		 * */
	}
}
