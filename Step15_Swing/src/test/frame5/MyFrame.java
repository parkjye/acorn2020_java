package test.frame5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	//default생성자
	public MyFrame() {
		//레이아웃 매니저 지정하기
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		JButton removeBtn = new JButton("삭제");
		JButton addBtn = new JButton("추가");
		
		//프레임에 버튼 추가(FlowLayout의 영향을 받는다)
		add(sendBtn);
		add(removeBtn);
		add(addBtn);
		
		//ActionListener 인터페이스 type의 참조값
		//익명 로컬 이너 클래스로 인터페이스 참조값 가져옴
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("전송합니다");
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
				//MyFrame.this == this만 사용하면 listener를 가르키는거라서
				//클래스명.this 으로 명시해야 한다.
			}
		};
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다!");
			}
		};
		
		//lamda식 활용(오버라이드할 메소드가 한 개라서 가능
		ActionListener listener3 = (e)->{
			JOptionPane.showMessageDialog(MyFrame.this, "추가합니다!");
		};
		
		sendBtn.addActionListener(listener);
		removeBtn.addActionListener(listener2);
		addBtn.addActionListener(listener3);
		
	}
	
	
	public static void main(String[] args) {
		
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame에 담기
		MyFrame frame = new MyFrame(); 
		
		frame.setTitle("나의 프레임");
		
		//프레임을 닫으면 자동으로 프로세스가 종료되도록 한다.
		// EXIT_ON_CLOSE == 3(static final 상수) 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		
		
	} //main
}//Class
