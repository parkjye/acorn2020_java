package test.frame10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener{
	//
	JTextField inputMsg;
	JButton sendBtn;
	JButton removeBtn;
	JLabel lab1;
	
	//default생성자
	public MyFrame() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		//문자열 한 줄을 입력할 수 있는 JTextField 
		this.inputMsg=new JTextField(10); //10개의 컬럼
		add(inputMsg);
		
		inputMsg.addKeyListener(this);
		
		this.sendBtn = new JButton("전송");
		sendBtn.addActionListener(this);
		add(sendBtn);
		
		this.removeBtn = new JButton("삭제");
		removeBtn.addActionListener(this);
		add(removeBtn);
		
		//JLabel객체 생성
		this.lab1 = new JLabel("lab1");
		add(lab1);
		
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
		} else if(obj==removeBtn) {
			inputMsg.setText("");
		}
		
		//읽은 문자열을 JLabel에 추가하기
		lab1.setText(str);
		inputMsg.setText("");

	}
	
	//키를 눌렀을 때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		//눌러진 키보드의 코드값을 읽어온다.
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_ENTER) {//enter key
			String str = inputMsg.getText();
			lab1.setText(str);
			inputMsg.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Typed");
	};
	
	
}//Class
