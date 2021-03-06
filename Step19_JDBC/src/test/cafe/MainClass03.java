package test.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  [ cafe: num(pk) / menu / price / cafename ]
		 *  
		 *  A. data 추가
		 *  
		 *  	1 / 아메리카노 / 3000 / 빽다방
		 *  	2 / 카푸치노 / 3500 / 바나프레소
		 *  	3 / 아인슈페너 / 4000 / 스타벅스
		 *  
		 *  새로운 메뉴를 추가(레이디 그레이 / 5000 / 트와이닝)
		 *  단, num는 cafe_seq로 추가.
		 * */
		
		//
		Connection conn = null;
		PreparedStatement pstmt = null;  
		
		int num=0;
		String menu="레이디그레이";
		int price=5000;
		String cafename="트와이닝";
				
		try {
			conn = new DBConnect().getConn();
			
			String sql="insert into cafe"
					+" values( cafe_seq.NEXTVAL, ?, ?, ?)";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, menu);
			pstmt.setInt(2, price);
			pstmt.setString(3, cafename);
			
			pstmt.executeUpdate();
			
			System.out.println("메뉴를 추가 했습니다.");
			
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
