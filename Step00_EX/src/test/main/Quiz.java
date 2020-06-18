package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener, KeyListener{
	//필드
	JTextField text;
	
	//생성자
	public Quiz() {
		setLayout(new BorderLayout());
		//setLayout(null);
		
		text = new JTextField(10);
		add(text, BorderLayout.CENTER);
		
		JButton btn = new JButton("button");
		add(btn, BorderLayout.EAST);
		btn.setActionCommand("btn");
		btn.addActionListener(this);
		
		JButton btn2 = new JButton("button");
		add(btn2, BorderLayout.WEST);
		btn2.setActionCommand("btn");
		btn2.addActionListener(this);
		
		JButton btn3 = new JButton("button");
		add(btn3, BorderLayout.SOUTH);
		btn3.setActionCommand("btn");
		btn3.addActionListener(this);
		
		JButton btn4 = new JButton("button");
		add(btn4, BorderLayout.NORTH);
		btn4.setActionCommand("btn");
		btn4.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		Quiz f = new Quiz();
		f.setTitle("Quiz Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(600, 200, 500, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String command = arg0.getActionCommand();
		
		if(command.equals("send")) {
			String str = text.getText();
		}else if(command.equals("btn")) {
			text.setText("");
		}
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
