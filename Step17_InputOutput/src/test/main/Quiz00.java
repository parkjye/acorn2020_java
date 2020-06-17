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
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.plaf.FileChooserUI;

public class Quiz00 extends JFrame implements ActionListener{
	//필드
	static final String FILE_NEW="New_File";
	static final String FILE_OPEN="Open_File";
	static final String FILE_SAVE="Save_File";
	
	JTextArea textArea;
	
	//생성자
	public Quiz00() {
		this.setTitle("파일");
		setLayout(new BorderLayout());
		
		JMenuItem item_new = new JMenuItem("새 파일");
		JMenuItem item_open = new JMenuItem("열기");
		JMenuItem item_save = new JMenuItem("저장");
		
		item_new.setActionCommand(FILE_NEW);
		item_new.addActionListener(this);
		
		item_open.setActionCommand(FILE_OPEN);
		item_open.addActionListener(this);
		
		item_save.setActionCommand(FILE_SAVE);
		item_save.addActionListener(this);

		JMenu menu1 = new JMenu("파일");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);
		
		JMenuBar bar = new JMenuBar();
		bar.setOpaque(true);
		bar.setBackground(Color.ORANGE);
		bar.add(menu1);
		
		setJMenuBar(bar);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setVisible(false);
	}
	
	public static void main(String[] args) {
		
		Quiz00 f = new Quiz00();
		f.setBounds(600, 200, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}//main

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		
		if(command.equals(FILE_NEW)) {
			newContent();
		}else if(command.equals(FILE_OPEN)) {
			textArea.setText("");
			openContent();
		}else if(command.equals(FILE_SAVE)) {
			saveContent();
		}
	}//actionPerformed
	
	public void newContent() {
		textArea.setText("");
		textArea.setVisible(true);
		textArea.grabFocus();		
	}
	
	public void openContent() {
		JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
		int result = fc.showOpenDialog(this);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			
			try {
				FileReader fReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fReader);
				
				while(true) {
					String line = br.readLine();
					if(line==null) { break; }
					
					textArea.append(line);
					textArea.append("\n");
				}
				textArea.setVisible(true);
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
	
	public void saveContent() {
		JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
		int result = fc.showSaveDialog(this);
		
		String getText = textArea.getText();
		
		if(result == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			
			try {
				FileWriter fw = new FileWriter(file);
				fw.write(getText);
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, file.getName()+" 파일을 저장했습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}//Quiz00
