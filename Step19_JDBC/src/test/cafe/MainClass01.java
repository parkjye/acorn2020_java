package test.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  [ cafe: num(pk) / menu / price / cafename ]
		 *  
		 *  A. data 추가
		 *  	카페 메뉴 3개 추가.
		 *  	단, num는 시퀀스객체를 이용해서 넣기(시퀀스 명: member_seq)
		 *  
		 *  	1 / 아메리카노 / 3000 / 빽다방
		 *  	2 / 카푸치노 / 3500 / 바나프레소
		 *  	3 / 아인슈페너 / 4000 / 스타벅스
		 *  	
		 * */
		
		//
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int num;
		String menu = "아인슈페너";
		int price = 4000;
		String cafename = "스타벅스";
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "insert into cafe"
					+" (num, menu, price, cafename)"
					+" values( cafe_seq.NEXTVAL, ?, ?, ?)";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, menu);
			pstmt.setInt(2, price);
			pstmt.setString(3, cafename);
			
			pstmt.executeUpdate();
			
			System.out.println("저장완료");
			
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
}//MainClass01
