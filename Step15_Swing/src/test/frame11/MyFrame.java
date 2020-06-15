package test.frame11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
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
	
	//사칙연산 결과값 toString
	String result;

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
		resultLab = new JLabel("0");
		
//		removeBtn = new JButton("삭제");
//		removeBtn.setActionCommand(COMMAND_REMOVE);
//		removeBtn.addActionListener(this);
		
		//위치잡기
//		add(removeBtn);
		
		add(fiedlNum1);
		
		add(plus);
		add(minus);
		add(multipl);
		add(divide);
		
		add(fiedlNum2);
		
		add(symbolEqual);
		add(resultLab);
	
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
		//예외처리
		try { 
			//JTextField 텍스트 받을거
			String strNum1 = fiedlNum1.getText();
			String strNum2 = fiedlNum2.getText();
			
			//String > double 형변환
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			//double to String전용 임시지역변수
			double temp = 0;
			
			//사칙연산 버튼 커멘드
			String command = e.getActionCommand();

			//계산
			if(command.equals(COMMAND_PLUS)) { //덧셈
				temp = num1+num2;
				result = Double.toString(temp);
				getResult();
				return;
			}else if(command.equals(COMMAND_MINUS)) { //뺄셈
				temp = num1-num2;
				result = Double.toString(temp);
				getResult();
				return;
			}else if(command.equals(COMMAND_MULTIPL)) { //곱셈
				temp = num1*num2;
				result = Double.toString(Math.round(temp*100)/100.0);
				getResult();
				return;
			}else if(command.equals(COMMAND_DIVIDE)) { //나눗셈
				temp = num1/num2;
				result = Double.toString(Math.round(temp*100)/100.0);
				getResult();
				return;
			} //else if
			
		} catch(NumberFormatException nfe) {
			resultLab.setText("숫자만 입력하세요.");
			nfe.printStackTrace();
		} catch(Exception ex) {
			resultLab.setText("계산기를 종료합니다.");
			ex.printStackTrace();
		} finally {
			fiedlNum1.setText("");
			fiedlNum2.setText("");
		}

	}//actionPerformed

	//연산 결과 resultLab 추가 & fiedlNum들 값 지우기
	public void getResult() {
		resultLab.setText(result);
		fiedlNum1.setText("");
		fiedlNum2.setText("");
	}

}//Class