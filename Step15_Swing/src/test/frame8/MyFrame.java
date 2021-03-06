package test.frame8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//
	JTextField inputMsg;
	JButton sendBtn;
	JButton removeBtn;
	
	//default생성자
	public MyFrame() {
		setLayout(new FlowLayout());
		//문자열 한 줄을 입력할 수 있는 JTextField 
		this.inputMsg=new JTextField(10); //10개의 컬럼
		add(inputMsg);
		
		this.sendBtn = new JButton("전송");
		sendBtn.addActionListener(this);
		add(sendBtn);
		
		this.removeBtn = new JButton("삭제");
		removeBtn.addActionListener(this);
		add(removeBtn);
		
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
		Object obj = e.getSource();
		String str=null;
		
		if(obj==sendBtn) {
			str = inputMsg.getText();
			JOptionPane.showMessageDialog(this, str);
		}else if(obj==removeBtn) {
			inputMsg.setText("");
		}

	}
	
}//Class
