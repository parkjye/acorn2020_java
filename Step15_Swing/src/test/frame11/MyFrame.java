package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener{
	//필드
	JTextField fiedlNum1;
	JTextField fiedlNum2;
	
	JButton plus;
	JButton minus;
	JButton multipl;
	JButton divide;
	JButton removeBtn;
	
	JLabel symbolEqual;
	JLabel resultLab;
	
	double num1;
	double num2;

	//satatic final (문자)상수
	static final String COMMAND_PLUS="PLUS";
	static final String COMMAND_MINUS="MINUS";
	static final String COMMAND_MULTIPL="MULTIPLICATION";
	static final String COMMAND_DIVIDE="DIVIDE";
	
	static final String COMMAND_REMOVE="REMOVE";
	
	
	//default 생성자
	public MyFrame() {
		setLayout(new FlowLayout());
		
		fiedlNum1 = new JTextField(5);
		fiedlNum2 = new JTextField(5);
		
		plus = new JButton("+");
		plus.setActionCommand(COMMAND_PLUS);
		plus.addActionListener(this);
		
		minus = new JButton("-");
		minus.setActionCommand(COMMAND_MINUS);
		minus.addActionListener(this);
		
		multipl = new JButton("*");
		multipl.setActionCommand(COMMAND_MULTIPL);
		multipl.addActionListener(this);
		
		divide = new JButton("/");
		divide.setActionCommand(COMMAND_DIVIDE);
		divide.addActionListener(this);
		
		symbolEqual = new JLabel("=");
		resultLab = new JLabel("(결과)");
		
		removeBtn = new JButton("삭제");
		removeBtn.setActionCommand(COMMAND_REMOVE);
		removeBtn.addActionListener(this);
		
		//위치잡기
		add(removeBtn);
		
		add(fiedlNum1);
		
		add(plus);
		add(minus);
		add(multipl);
		add(divide);
		
		add(fiedlNum2);
		
		add(symbolEqual);
		add(resultLab);
		
		
		//JTextField 텍스트 받을 메소드
		
		//텍스트 받아서 double로 형변환(이거 필드로)
		
		
		//사칙연산 버튼 클릭하면 연산값 받고 = 누를 때 결과 나와야함.
		//계산할 때 double로 해야함.
		
		//예외처리
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame(); 
		frame.setTitle("계산기 연습");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);	
	} //main
	
	//ActionListener 인터페이스를 구현해서 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField 텍스트 받을거
		String strNum1 = fiedlNum1.getText();
		String strNum2 = fiedlNum2.getText();
		
		//String > double 형변환
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		//사칙연산 결과값
		// JTextField에서 string으로 가져와서 계산할 때 double 형변환
		// 다시 to String
		String result = null;
		
		//double to String전용 임시지역변수
		double temp = 0;
		
		//사칙연산 버튼 커멘드
		String command = e.getActionCommand();

		//계산
		if(command.equals(COMMAND_PLUS)) { //덧셈
			temp = num1+num2;
			result = Double.toString(temp);
			
		}else if(command.equals(COMMAND_MINUS)) { //뺄셈
			temp = num1-num2;
			
		}else if(command.equals(COMMAND_MULTIPL)) { //곱셈
			temp = num1*num2;
			
		}else if(command.equals(COMMAND_DIVIDE)) { //나눗셈
			temp = num1/num2;
			//result = Math.round(temp*100)/100.0; //소수점 두번째 반올림
		}

	}//actionPerformed



	//KeyListener 인터페이스 구현, 오버라이드된 메소드
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}//Class
