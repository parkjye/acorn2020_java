package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class Quiz03_3 extends JFrame implements ActionListener{
	//필드
	JTextArea area;
	JScrollPane scroll;
	
	//생성자
	public Quiz03_3() {
		//extends JFrame을 해서 set~ method사용 가능
		setTitle("나의 파일");
		setLayout(new BorderLayout());
		
		//메뉴 아이템 3개 만들기 way01 
		JMenuItem item_new=new JMenuItem("New");
		JMenuItem item_open=new JMenuItem("Open");
		//way02. default생성자를 호출해서 객체를 생성한 후
		JMenuItem item_save=new JMenuItem("");
		//메소드를 이용해서 아이템 text전달도 가능
		item_save.setText("Save");
		
		//아이템에 액션command 지정하기
		item_new.setActionCommand("new");
		//아이템에 액션Listener 등록하기
		//implements ActionListener를 구현해서 this사용 가능
		item_new.addActionListener(this);
		
		item_open.setActionCommand("open");
		item_open.addActionListener(this);
		
		item_save.setActionCommand("save");
		item_save.addActionListener(this);
		
		//메뉴에 아이템 추가 
		JMenu menu1=new JMenu("File");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);
		
		JMenu menu2 = new JMenu();
		menu2.setText("도움말");
		
		//메뉴바에 메뉴 추가 
		JMenuBar mb=new JMenuBar();
		mb.add(menu1);
		mb.add(menu2);
		
		//프레임에 메뉴바 장착
		setJMenuBar(mb);
		
		//텍스트 area 를 프레임의 가운데에 배치 
		area=new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.ORANGE);
		area.setVisible(false);
	}
	
	//run했을 때 실행순서가 시작되는 메인 메소드
	public static void main(String[] args) {
		
		//프레임을 만들어서 화면에 띄우는 작업을 한다.
		//JFrame을 상속받은 class를 이용해서 객체 생성
		Quiz03_3 f=new Quiz03_3();
		
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	// File > 메뉴 아이템을 클릭하면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//클릭된 아이템의 액션 command를 읽어온다.
		String command = arg0.getActionCommand();
		
		if(command.equals("new")) {
			newContent();
			
		} else if(command.equals("open")) {
			openContent();
			
		} else if(command.equals("save")) {
			saveContent();
		}
		
	}//actionPerformed

	public void newContent() {
		area.setText("");
		area.setVisible(true);
		area.grabFocus(); //커서
	}	
	
	//파일에 저장하는 작업을 하는 메소드
	public void saveContent() {
		//JTextArea에 입력한 문자열을 읽어온다.
		String content = area.getText();
		
		JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
		int result = fc.showSaveDialog(this); //show'Save'Dialog
		
		//Chooser Dialog에서 '저장', '취소', '닫기' 버튼을 눌렀을 때 동작
		if(result == JFileChooser.APPROVE_OPTION) {
			
			//새로 만들 예정인 File객체의 참조값 얻어오기
			File file = fc.getSelectedFile();
			
			try {
				//파일에 문자열을 출력할 수 있는 객체 생성
				FileWriter fw = new FileWriter(file);
				fw.write(content);
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, file.getName()+" 파일을 저장했습니다.");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(result == JFileChooser.CANCEL_OPTION) {
			
		}else if(result == JFileChooser.ERROR_OPTION) {
			
		}
	}
	
	//파일에 있는 문자열을 읽어와서 출력하는 메소드
	public void openContent() {
		JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
		int result = fc.showOpenDialog(this); //show'Open'Dialog
		
		//Chooser Dialog에서 동작
		if(result == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				
				while(true) { 
					//문자를 한 줄씩 읽어낸다.
					String line = br.readLine();
					
					//더이상 읽을 문자열이 없으면 탈출
					if(line==null) { break; }
					
					//JTextArea에 문자열을 개행기호와 함께 append(누적 출력)하기
					area.append(line);
					area.append("\r\n");
				}
				area.setVisible(true);
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(result == JFileChooser.CANCEL_OPTION) {
			
		}else if(result == JFileChooser.ERROR_OPTION) {
			
		}
	}
	
}//Quiz03