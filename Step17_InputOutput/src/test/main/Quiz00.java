package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Quiz00 extends JFrame implements ActionListener{
	static final String FILE_NEW="New_File";
	static final String FILE_OPEN="Open_File";
	static final String FILE_SAVE="Save_File";
	
	JTextArea textArea;
	
	public Quiz00() {
		this.setTitle("파일");
		setLayout(new BorderLayout());
		
		JMenuItem item_new = new JMenuItem("New");
		JMenuItem item_open = new JMenuItem("Open");
		JMenuItem item_save = new JMenuItem("Sava");
		
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
		bar.add(menu1);
		
		setJMenuBar(bar);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		textArea.setBackground(Color.GREEN);
		textArea.setVisible(false);
	}
	
	public static void main(String[] args) {
		
		Quiz00 f = new Quiz00();
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}//main

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String command = arg0.getActionCommand();
		
		if(command.equals(FILE_NEW)) {
			newContent();
		}else if(command.equals(FILE_OPEN)) {
			openContent();
		}else if(command.equals(FILE_SAVE)) {
			saveContent();
		}
	}//actionPerformed
	
	public void newContent() {
		textArea.setText("");
		textArea.setVisible(true);
		
	}
	
	public void openContent() {
		
	}
	
	public void saveContent() {
		
	}
	
}//Quiz00
