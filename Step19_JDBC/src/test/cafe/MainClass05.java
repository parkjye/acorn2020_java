package test.cafe;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import test.dto.CafeDto;
import test.util.DBConnect;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  [ cafe: num(pk) / menu / price / cafename ]
		 *  
		 *  A. List<CafeDto>
		 *  
		 *  	1 / 아메리카노 / 3000 / 빽다방
		 *  	3 / 아인슈페너 / 4000 / 스타벅스
		 *  	4 / 레이디 그레이 / 5000 / 트와이닝
		 *  
		 *  num기준으로 오름차순 정렬해서 List<CafeDto> 객체에 담기
		 *  
		 * */
		
		List<CafeDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "select * from cafe order by num ASC";
			pstmt = conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String menu = rs.getString("menu");
				int price = rs.getInt("price");
				String cafename = rs.getString("cafename");
				
				CafeDto dto = new CafeDto();
				
				dto.setNum(num);
				dto.setMenu(menu);
				dto.setPrice(price);
				dto.setCafename(cafename);
				
				list.add(dto);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		for(CafeDto tmp:list) {
			System.out.println(tmp.getNum()+" | "+tmp.getMenu()+" | "+tmp.getPrice()+" | "+tmp.getCafename());
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getNum());
		}
		
	}//main
}//MainClass05
