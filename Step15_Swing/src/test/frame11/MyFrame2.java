package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame implements ActionListener {
	//필드
	JTextField tf_num1, tf_num2;
	JLabel label_result;
	
	//default 생성자
	public MyFrame2() {
		//프레임의 레이아웃 법칙 설정하기
		setLayout(new BorderLayout());

		//Panel
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.ORANGE);
		//Panel을 북쪽에 배치
		add(topPanel, BorderLayout.NORTH);
		
		//JTextField 객체를 만들어서 JPanel에 추가하기
		tf_num1=new JTextField(10);
		topPanel.add(tf_num1);
		
		//기능 버튼 객체를 만들어서 JPanel에 추가하기
		JButton plusBtn = new JButton("+");
		JButton miusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("/");
		topPanel.add(plusBtn);
		topPanel.add(miusBtn);
		topPanel.add(multiBtn);
		topPanel.add(divideBtn);
		
		//두번째 JTextField 객체를 만들어서 JPanel에 추가하기
		tf_num2=new JTextField(10);
		topPanel.add(tf_num2);
		
		//JLabel
		JLabel label1 = new JLabel("=");
		label_result = new JLabel("0");
		topPanel.add(label1);
		topPanel.add(label_result);
		
		//버튼에 리스너 등록하기
		plusBtn.addActionListener(this);
		miusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		//버튼에 액션 command지정하기
		plusBtn.setActionCommand("plus");
		miusBtn.setActionCommand("mius");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
	
	}
	
	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2(); 
		frame.setTitle("계산기");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100,100,600,500);
		frame.setVisible(true);	
	} //main
	
	//ActionListener 인터페이스를 구현해서 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//JTextField에 입력한 문자열을 읽어와서 숫자(실수)로 바꿔준다.
			double num1=Double.parseDouble(tf_num1.getText());
			double num2=Double.parseDouble(tf_num2.getText());
			
			//연산의 결과값을 담을 지역변수
			double result = 0;
			
			//눌러진 버튼의 command 읽어오기(여러개의 버튼 구분을 위해서)
			String command = e.getActionCommand();
			
			if(command.equals("plus")) {
				result = num1 + num2;
			}else if (command.equals("mius")) {
				result = num1 - num2;
			}else if (command.equals("multi")) {
				result = num1 * num2;
			}else if (command.equals("divide")) {
				result = num1 / num2;
			}
			
			//결과값을 JLabel에 출력하기
			label_result.setText(Double.toString(result));
			tf_num1.setText("");
			tf_num2.setText("");
			
		} catch(Exception ex) {
			ex.printStackTrace();
			label_result.setText("숫자만 입력하세요.");
		} finally {
			tf_num1.setText("");
			tf_num2.setText("");
		}
		
	}//actionPerformed

	//연산 결과 resultLab 추가 & fiedlNum들 값 지우기
	public void getResult() {

	}

}//Class