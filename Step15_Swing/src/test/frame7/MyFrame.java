package test.frame7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JButton sendBtn;
	JButton removeBtn;
	
	//default생성자
	public MyFrame() {
		//레이아웃 매니저 지정하기
		setLayout(new FlowLayout());
		
		this.sendBtn = new JButton("전송");
		removeBtn = new JButton("삭제");
		
		//프레임에 버튼 추가(FlowLayout의 영향을 받는다)
		add(sendBtn);
		add(removeBtn);
		
		//MyFrame 객체의 참조값을 전달해서 리스너 등록
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
		
		ActionListener a= this;
		MyFrame b = this;
		JFrame c = this;
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
		
	//ActionListener 인터페이스를 구현해서 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생한 UI(JButton)의 참조값을 얻어온다.
		Object obj = e.getSource();
		
		if(obj==sendBtn) {
			JOptionPane.showMessageDialog(this, "전송합니다.");
		}else if(obj==removeBtn) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
		
	}
	
}//Class
