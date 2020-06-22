package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		
		//아래의 insert() 메소드를 호출해서 회원 한 명의 정보를 추가하세요.
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		insert(dto);
	}//main
	
	public static void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql="insert into member"
					+" (num, name, addr)"
					+" values( member_seq.NEXTVAL, ?, ?)";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 추가 했습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//insert
	
}//MainClass08
