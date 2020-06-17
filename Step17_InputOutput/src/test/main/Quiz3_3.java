package test.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/* 
 * 01. extends JFrame implements ActionListener
 * 		> import, actionPerformed() @Override (ActionListener 영향)
 */
public class Quiz3_3 extends JFrame implements ActionListener{
	//필드
	
	
	/*
	 * 02. 
	 * 
	 * */
	public Quiz3_3() {
		
	}	
	
	public static void main(String[] args) {	
		/*
		 * 01-1. 화면에 띄울 프레임 만들기
		 * 		> JFrame을 상속받은 class를 이용해서 객체 생성
		 * 		> setBounds()
		 * 		> setDefaultCloseOperation()
		 * 		> setVisible()
		 * */ 
		Quiz3_3 frame = new Quiz3_3();
		frame.setBounds(600, 200, 100, 100); //위치
		//창 종료시 프로세스에서도 완전히 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
