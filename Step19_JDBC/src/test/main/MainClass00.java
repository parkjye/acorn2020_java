package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass00 {
	public static void main(String[] args) {
		/*
		 * create table cafe 
		 * (num number primary key,
		 *	menu varchar2(20),
		 *	price number,
		 *	cafename varchar2(20));
		 * 
		 *  [ cafe ]
		 *  num(pk) / menu / price / cafename
		 *  
		 * */
		
		//DB와 연결하는 객체 생성, 메소드 호출
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
