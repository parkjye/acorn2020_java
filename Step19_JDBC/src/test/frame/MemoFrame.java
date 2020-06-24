package test.frame;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemoDao;
import test.dto.MemoDto;

/*
 * create table memo
 * (num number primary key,
 *  content varchar2(30),
 *  regdate date);
 * 
 * create sequence memo_seq;
 * 
 * 위와 같이 테이블과 시퀀스를 만들고 해당 테이블에 데이터를
 * select, insert, update, delete 기능을 수행할 수 있는 memoFrame을 만들어 보세요.
 * 
 * 	[ 조건 ]
 * 	1. num 칼럼값은 시퀀스를 이용해서 넣으세요
 * 	2. regdate 칼럼(등록일)의 값은 sysdate를 이용해서 넣으세요. 
 *  3. 수정은 content만 수정 가능하게 하세요.
 *  4. MemoDto, MemoDao를 만들어서 프로그래밍 하세요.
 *  
 * */
public class MemoFrame extends JFrame implements ActionListener, PropertyChangeListener, KeyListener{
	//필드
	JTextField txtField;
	JButton saveBtn, removeBtn, openBtn;
	
	JTable table;
	DefaultTableModel model;
	
	//생성자
	public MemoFrame() {
		setLayout(new BorderLayout());
		
		JLabel txtLabel = new JLabel("MEMO");
		txtField = new JTextField(20);
		
		saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		
		removeBtn = new JButton("삭제");
		removeBtn.setActionCommand("remove");
		removeBtn.addActionListener(this);
		
		openBtn = new JButton("열기");
		openBtn.setActionCommand("open");
		openBtn.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(txtLabel);
		panel.add(txtField);
		panel.add(saveBtn);
		panel.add(removeBtn);
		//panel.add(openBtn);
		add(panel, BorderLayout.NORTH);
		
		//table
		table = new JTable();
		String[] colNames = {"번호", "내용", "날짜"};
		
		model = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if(column==0 || column==2) {
					return false;
				}
				return true;
			}
		};
		
		table.setModel(model);
		
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		//DB에 저장된 memo
		displayMemo();
		
		//이벤트 리스너(테이블, 텍스트필드)
		table.addPropertyChangeListener(this);
		txtField.addKeyListener(this);
	}
	
	//main()
	public static void main(String[] args) {
		MemoFrame f = new MemoFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(500, 200, 600, 500);
		f.setTitle("MemoFrame");
		f.setVisible(true);
	}
	
	//저장된 memo 불러오기
	public void displayMemo() {
		MemoDao dao = MemoDao.getInstance();
		List<MemoDto> list = dao.selectAll();
		
		for(MemoDto tmp: list) {
			Object[] tableRow = {tmp.getNum(), tmp.getContent(), tmp.getRegdate()};
			model.addRow(tableRow);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		
		MemoDao dao = MemoDao.getInstance();
		MemoDto dto = new MemoDto();
		
		if(command.equals("save")) {
			
			String getContent = txtField.getText();
			dto.setContent(getContent);
			
			if(getContent.equals("")) {
				JOptionPane.showMessageDialog(this, "입력된 정보가 없습니다.");
				return;
			}
			
			boolean isSuccess = dao.insert(dto);
			
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "입력한 내용이 추가됐습니다.");
				model.setRowCount(0);
				displayMemo();
				txtField.setText("");
				return;
			}
		}else if(command.equals("remove")) {
//			if(selectRow == -1) {
//				JOptionPane.showMessageDialog(this, "선택된 데이터가 없습니다.");
//				return;
//			}
//			
//			int selection = JOptionPane.showConfirmDialog(this, "삭제?");
//			if(selection != JOptionPane.YES_OPTION) {
//				return;
//			}
			
			int selectRowCount = table.getSelectedRowCount();
			int[] selectRows = table.getSelectedRows();
			
			for(int i=0; i<selectRowCount; i++) {		
				int num = (int)model.getValueAt(selectRows[i], 0);
				dao.delete(num);	
			}
			
			JOptionPane.showMessageDialog(this, "삭제 완료");
			txtField.setText("");
			
			}
			model.setRowCount(0);
			displayMemo();
			
		}//actionPerformed

	boolean isEditing = false;
	
	//data 수정
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		if(arg0.getPropertyName().equals("tableCellEditor")) {
			if(isEditing) {
				int selectRow = table.getSelectedRow();
				int num = (int)model.getValueAt(selectRow, 0);
				String content = (String)model.getValueAt(selectRow, 1);
				
				MemoDto dto = new MemoDto(num, content, null);
				MemoDao.getInstance().update(dto);
				isEditing = false;
			}
			isEditing=true;
		}
		
	}

	//키보드 keyPressed 이벤드
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_ENTER) {
			MemoDao dao = MemoDao.getInstance();
			MemoDto dto = new MemoDto();
			
			String getContent = txtField.getText();
			dto.setContent(getContent);
			dao.insert(dto);
			txtField.setText("");
			model.setRowCount(0);
			displayMemo();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}//MemoFrame
