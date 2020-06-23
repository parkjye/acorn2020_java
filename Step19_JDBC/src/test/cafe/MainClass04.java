package test.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  [ cafe: num(pk) / menu / price / cafename ]
		 *  
		 *  A. data 삭제
		 *  
		 *  	1 / 아메리카노 / 3000 / 빽다방
		 *  	2 / 카푸치노 / 3500 / 바나프레소
		 *  	3 / 아인슈페너 / 4000 / 스타벅스
		 *  	4 / 레이디 그레이 / 5000 / 트와이닝
		 *  
		 *  2번 데이터 삭제
		 *  
		 * */
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int num = 2;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "delete from cafe where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			System.out.println("삭제 완료");
			
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
