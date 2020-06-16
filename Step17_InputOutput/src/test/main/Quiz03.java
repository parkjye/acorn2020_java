package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Quiz03 extends JFrame implements ActionListener{
	//필드	
	JTextArea area;
	
	//생성자
	public Quiz03() {
		
		setTitle("나의 파일");
		setLayout(new BorderLayout());
		
		//메뉴 아이템 3개 만들기
		JMenuItem item_new = new JMenuItem("New");
		JMenuItem item_open = new JMenuItem("Open");
		JMenuItem item_save = new JMenuItem("Save");
		
		item_new.setActionCommand("new");
		item_new.addActionListener(this);
		
		item_open.setActionCommand("open");
		item_open.addActionListener(this);
		
		item_save.setActionCommand("save");
		item_save.addActionListener(this);
		
		//메뉴에 아이템 추가
		JMenu menu1 = new JMenu("File");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);
		
		//메뉴바에 메뉴 추가
		JMenuBar mb = new JMenuBar();
		mb.add(menu1);
		
		//프레임에 메뉴바 장착
		setJMenuBar(mb);
		
		area = new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.ORANGE);
		area.setVisible(false);
		
//		JFrame jframe = new JFrame();
		 
	}
	
	public static void main(String[] args) {
		Quiz03 f = new Quiz03();
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}//main

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
		int result = fc.showOpenDialog(this);
		
		//선택한 파일을 access 할 수 있는 파일 객체
		File selectedFile = fc.getSelectedFile();

		//image
		FileInputStream fInput = null;
		FileOutputStream fOutput = null;
		
		byte[] buffer = new byte[1024];
		
		//txt
		FileReader fReader;
		BufferedReader bReader;
		
		
		// try ~ catch ~ finally
		try {
			if(result == JFileChooser.APPROVE_OPTION) {

				// 01. area true, 청소
				area.setVisible(true);
				area.setText("");
			
				//temp
				if(!selectedFile.exists()) {
					area.setText("파일이 없습니다.");
					area.setVisible(false);
					return;
				}
			
				//.txt파일 불러오기
				fReader = new FileReader(selectedFile);
				bReader = new BufferedReader(fReader);
			
				while(true) {
					String line = bReader.readLine();
					if(line==null) { break; }
					area.append(line+"\n");	
				}				
				
				//image 불러오기
				Image img = null; 
				fInput = new FileInputStream(selectedFile);
				InputStream bufferImg = new BufferedInputStream(fInput);
				img = ImageIO.read(bufferImg);
				
				while(true) {
					int readedByte = fInput.read(buffer);
					if(readedByte==-1) { break; }
					
					fOutput.write(buffer, 0, readedByte);
				}
				System.out.println("img open"); //consle.temp
				
			}else if(result == JFileChooser.CANCEL_OPTION) {
				
			}else if(result == JFileChooser.ERROR_OPTION) {
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//actionPerformed
	
}//Quiz03
