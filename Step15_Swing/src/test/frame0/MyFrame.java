package test.frame0;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//
	
	//생성자
	public MyFrame() {
		setLayout(new FlowLayout());
		
		//JButton sendBtn=new JButton("전송");
		JButton removeBtn=new JButton("삭제");
		//add(sendBtn);
		add(removeBtn);
	}
	
	public static void main(String[] args) {
		//JFrame
		MyFrame frame = new MyFrame();
		frame.setTitle("Frame 연습");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}

}
