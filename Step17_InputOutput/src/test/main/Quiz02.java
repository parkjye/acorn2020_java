package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener{
	//필드
	JTextField tf_msg;
	
	JTextArea jArea;
	
	JButton appendBtn;
	JButton loadBtn;
	
	JLabel console;
	
	//생성자
	public Quiz02() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		
		tf_msg = new JTextField(10);
		
		appendBtn = new JButton("추가하기");
		appendBtn.setActionCommand("append");
		appendBtn.addActionListener(this);
		
		loadBtn = new JButton("불러오기");
		loadBtn.setActionCommand("load");
		loadBtn.addActionListener(this);
		
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		topPanel.add(loadBtn);
		
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.ORANGE);
		
		//JTextArea
		jArea = new JTextArea(10, 20);
		jArea.setBackground(Color.LIGHT_GRAY);
		
		//프레임의 가운데에 JTextArea 배치
		add(jArea, BorderLayout.CENTER);
		add(new JScrollPane(jArea)); //스크롤
		
		//JLabel
		console = new JLabel();
		
	}
	
	public static void main(String[] args) {
		Quiz02 f = new Quiz02();
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		String getStr = tf_msg.getText();
		
		File memoFile = new File("C:\\acorn2020\\myFolder\\memo.txt");
		
		FileWriter wriFile = null;
		FileReader readFile = null;
		BufferedReader bufferRe = null;
				
		try {
			if(!memoFile.exists()) {
				System.out.println("파일 없음");
				return;
			}
			
			if(command.equals("append")) {
				wriFile = new FileWriter(memoFile, true);
				wriFile.append(getStr);
				wriFile.write("\r\n");
				
				tf_msg.setText("");
				
				System.out.println("append 완료");
				
			} else if(command.equals("load")) {
				readFile = new FileReader(memoFile);
				bufferRe = new BufferedReader(readFile);
				
				while(true) {
					String line = bufferRe.readLine();
					if(line==null) { break; }			
					
					jArea.append(line+"\n");
				}
				System.out.println("load 완료");
			}
			
		} catch(IOException IOE) {
			IOE.printStackTrace();
		} finally{
			try {
				if(wriFile!=null)wriFile.close();
				if(bufferRe!=null)bufferRe.close();
			}catch(IOException ioe) {}
		}
			
	}//actionPerformed
}//Quiz01
