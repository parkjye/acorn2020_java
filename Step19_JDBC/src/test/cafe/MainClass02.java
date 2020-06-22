package test.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  [ cafe: num(pk) / menu / price / cafename ]
		 *  
		 *  A. data 수정
		 *  
		 *  	1 / 아메리카노 / 3000 / 빽다방
		 *  	2 / 카푸치노 / 3500 / 바나프레소
		 *  	3 / 아인슈페너 / 4000 / 스타벅스
		 *  
		 *  2번 메뉴의 cafename을 `할리스`로 변경하기
		 * */
		
		//
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int num=2;
		String cafename = "할리스";
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "update cafe"
					+" set cafename=? where num=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, cafename);
			pstmt.setInt(2, num);
			
			pstmt.executeUpdate();
			
			System.out.println("수정 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//main
}//MainClass02
