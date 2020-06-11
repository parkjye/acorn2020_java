package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Hello Frame");
		f.setBounds(100,100,500,500);
		//프레임을 닫았을 때 자동으로 프로세스 종료 되도록
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		//레이아웃 매니저를 사용하지 않도록 설정
		f.setLayout(null);
		//버튼 객체 생성
		JButton btn=new JButton("클릭");
		btn.setBounds(10, 10, 100, 40);
		//프레임에 버튼 추가하기
		f.add(btn);
		
		
	
		new MyFrame("나만의 프레임");
	}//main
	
	
	public static class MyFrame extends JFrame{
		//생성자
		public MyFrame(String title) {
			super(title);
			//초기화 작업
			setBounds(500, 300, 500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			setLayout(null);
			JButton btn = new JButton("클릭클릭");
			btn.setBounds(145, 250, 100, 40);
			add(btn);
			
			//this 생략가능
//			this.setBounds(200, 200, 500, 500);
//			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			this.setVisible(true);
		}
	}//MyFrame
}//MainClass
