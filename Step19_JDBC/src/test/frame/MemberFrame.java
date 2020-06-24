package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener{
	//필드
	JTextField inputAddr, inputName;
	JButton saveBtn, deleteBtn;
	
	DefaultTableModel model;
	
	JTable table;
	
	//생성자
	public MemberFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		
		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);
		
		saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		
		deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		
		panel.add(label2);
		panel.add(inputAddr);
		
		panel.add(saveBtn);
		panel.add(deleteBtn);
		
		add(panel, BorderLayout.NORTH);
		
		//표형식으로 정보를 출력하기 위한 JTable
		table = new JTable();
		
		//칼럼명을 String[]에 순서대로 준비
		String[] colNames = {"번호", "이름", "주소"};
		
		//테이블에 출력할 정보를 가지고 있는 모델 객체
		model = new DefaultTableModel(colNames,0) {
			
			//인자로 전달되는 행(row), 열(column)수정 가능 여부를 리턴하는 메소드
			@Override
			public boolean isCellEditable(int row, int column) {
				//if 첫번째(0번째) 칼럼이면 수정이 불가 하도록 한다.
				if(column==0) {
					return false;
				}
				return true;
			}
		};
		
		//모델을 테이블에 연결한다.
		table.setModel(model);
		
		//스크롤이 가능 하도록 테이블을 JScrollPane에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		
		//JScrollPane을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		//테이블에 회원목록 출력하기
		displayMember();
		
		//테이블에서 발생하는 이벤트 리스너 등록하기
		table.addPropertyChangeListener(this);
	}//생성자 MemberFrame()
	
	public void displayMember() {
		//회원 목록을 얻어와서
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> list = dao.getList();
		
		//화면출력
		for(MemberDto tmp : dao.getList()) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
	
	//메인메소드
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto();
		
		if(command.equals("save")) {
			String getName = inputName.getText();
			String getAddr = inputAddr.getText();

			dto.setName(getName);
			dto.setAddr(getAddr);
			
			if(getName.equals("") || getAddr.equals("")) {
				JOptionPane.showMessageDialog(this, "정보 누락");
				inputName.setText("");
				inputAddr.setText("");
				return;
			}
			
			boolean isSuccess = dao.insert(dto);
			
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, getName+"님의 정보가 추가 되었습니다.");
				model.setRowCount(0);
				displayMember();
				inputName.setText("");
				inputAddr.setText("");
				return;
			}else {
				JOptionPane.showMessageDialog(this, "추가 실패");
			}
			
			//모델 초기화 하는 메소드
			model.setRowCount(0);
			displayMember();

		}else if(command.equals("delete")) {

			int selectedIndex=table.getSelectedRow();
			if(selectedIndex == -1) {
				JOptionPane.showMessageDialog(this, "선택한 데이터가 없습니다.");
				return;
			}
			
			//실제 삭제 할것인지 확인한다.
			int selection = JOptionPane.showConfirmDialog(this, "선택된 row를 삭제하겠습니까?");
			if(selection != JOptionPane.YES_OPTION) {
				return;
			}

			//row 삭제
			//model.getValueAt(selectedIndex, 0); == object type을 리턴하니까 캐스팅
			int num = (int)model.getValueAt(selectedIndex, 0);
			dao.delete(num);
			
			model.setRowCount(0);
			displayMember();
		}
		
	}//actionPerformed

	//현재 테이블 cell의 수정여부를 저장할 필드
	boolean isEditing = false;
	
	//propertyChange
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("tableCellEditor")) {
			if(isEditing) { //수정중일때
				
				//변화된 값을 읽어와서 DB에 반영한다.
				int selectedIndex=table.getSelectedRow();
				int num=(int)model.getValueAt(selectedIndex, 0);
				String name=(String)model.getValueAt(selectedIndex, 1);
				String addr=(String)model.getValueAt(selectedIndex, 2);
				
				//수정할 회원의 정보를 MemberDto객체에 담고, DB에 저장하기
				MemberDto dto = new MemberDto(num, name, addr);
				MemberDao.getInstance().update(dto);
				
				isEditing=false; //수정중이 아니라고 표시한다.
			}
			isEditing=true;
		}
		
	}
	
}//MemberFrame
