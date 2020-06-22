package test.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass03 {
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
		 *  새로운 메뉴를 추가하고(레이디 그레이 / 5000 / 트와이닝)
		 *  단, num는 cafe_seq로 추가.
		 *  기존 메뉴 중 num=1인 data의 price를 2800으로 수정
		 * */
		
		//
		Connection conn = null;
				
		try {

			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//main
}//MainClass02
