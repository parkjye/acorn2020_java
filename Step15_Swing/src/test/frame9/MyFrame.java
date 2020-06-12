package test.frame9;

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
	//
	JTextField inputMsg;
	JButton sendBtn;
	JButton removeBtn;
	JButton removeBtnBottom;
	JLabel lab1;
	DefaultListModel<String> model;
	JList<String> list;
	
	//satatic final (문자)상수
	static final String COMMAND_SEND="send";
	static final String COMMAND_REMOVE_BOTTON="removeBotton";
	static final String COMMAND_REMOVE="remove";
	
	//default생성자
	public MyFrame() {
		setLayout(new BorderLayout());
		//문자열 한 줄을 입력할 수 있는 JTextField 
		inputMsg=new JTextField(10); //10개의 컬럼
		
		inputMsg.addKeyListener(this);
		
		sendBtn = new JButton("전송");
		sendBtn.setActionCommand(COMMAND_SEND); //static final
		sendBtn.addActionListener(this);
		
		removeBtn = new JButton("삭제");
		removeBtn.addActionListener(this);
		
		removeBtnBottom = new JButton("선택 삭제");
		removeBtnBottom.setActionCommand(COMMAND_REMOVE_BOTTON); //static final
		removeBtnBottom.addActionListener(this);
		//삭제 버튼 하단에 배치하기
		add(removeBtnBottom, BorderLayout.SOUTH);
		
		lab1 = new JLabel("lab1");
		
		//JPanel 객체 생성
		JPanel panel = new JPanel();
		
		//패널도 레이아웃을 지정할 수 있다.(기본값은 FlowLayout가운데 정렬이다)
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//JPanel에 UI추가하고
		panel.add(inputMsg);
		panel.add(sendBtn);
		panel.add(removeBtn);
		panel.add(lab1);
		
		//패널에 배경색 지정하기
		panel.setBackground(Color.yellow);
		
		//JFrame에 JPanel을 북쪽에 배치하기
		add(panel, BorderLayout.NORTH);
		
		//목록을 출력할 수 있는 Jlist
		list= new JList<String>();
		
		//기본 모델 객체
		model = new DefaultListModel<String>();
		model.addElement("김구라");
		model.addElement("해골");
		model.addElement("원숭이");
		
		//목록에 모델 연결하기
		list.setModel(model);
		
		//목록을 프레임의 가운데에 배치하기
		add(list, BorderLayout.CENTER);
		
		//스크롤 패널
		JScrollPane sc = new JScrollPane(list, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		add(sc, BorderLayout.CENTER);
		
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
	
		//눌러진 버튼의 command를 읽어온다.
		String command=e.getActionCommand();
		
		if(command.equals(COMMAND_SEND)) { //전송버튼을눌렀을때
			send();
		}else if(command.equals(COMMAND_REMOVE)) { //삭제버튼을 눌렀을 때
			inputMsg.setText("");
		}else if(command.equals(COMMAND_REMOVE_BOTTON)) {//하단의 삭제버튼을 눌렀을때
			//JList 객체에게 선택된 item이 있는지,
			//있다면 몇 번째 아이템이 선택되었는지 물어봐야한다.(메소드를 이용해서 알아본다)
			int selectNum = list.getSelectedIndex();
			if(selectNum >= 0) { //선택된 cell이 있을 때
				int result = JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");
				
				if(result == JOptionPane.YES_OPTION) {
					model.remove(selectNum); //model.removeElementAt(selectNum); 인덱스 위치의 요소를 제거
				}
			}else {
				JOptionPane.showMessageDialog(this, "삭제할 cell을 선택하세요.");
			}
		}
	} //actionPerformed

	//문자열 읽어오는 메소드
	public void send() {
		String str = inputMsg.getText();
		lab1.setText(str);
		model.addElement(str);
		inputMsg.setText("");
	};
	
	//키를 눌렀을 때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		//눌러진 키보드의 코드값을 읽어온다.
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_ENTER) {//enter key
			send();
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
