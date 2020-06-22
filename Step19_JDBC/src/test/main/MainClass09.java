package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="이정호";
		String addr="독산동";
		
		MemberDto dto = new MemberDto(num, name, addr);
//		dto.setName(name);
//		dto.setAddr(addr);
//		dto.setNum(num);

		update(dto);
		
	}//main
	
	public static void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="update member set name=?, addr=? where num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			pstmt.executeUpdate();
			
			System.out.println("회원 정보 수정 완료");
			
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
	}//update
	
	
}//MainClass09
