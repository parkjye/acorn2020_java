package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AcornFrame extends JFrame implements ActionListener{
	JButton btnNorth;
	
	public AcornFrame() {
		setLayout(new BorderLayout());
		
		btnNorth = new JButton("전송");
		add(btnNorth, BorderLayout.NORTH);
		btnNorth.addActionListener(this);
	}
	
	public static void main(String[] args) {
		AcornFrame f = new AcornFrame();
		f.setTitle("acorn");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,400,400);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	}
}
