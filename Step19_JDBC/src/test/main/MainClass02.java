package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * member 테이블에 추가할 회원의 정보
		 * 1, 김구라, 노량진
		 * 
		 * [ 객체 ]
		 * 
		 * Connection
		 * 
		 * PrepareStatement 
		 * 	(sql문을 대신 수행하는 것 ex. select, insert, delete ... .)
		 * 
		 * */
		int num=1;
		String name="김구라";
		String addr="노량진";
		
		//DB 연결객체를 담을 지역변수 만들기
		Connection conn = null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
					
			//접속할 DB의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
					
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
					
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		try {
			//실행할 미완성 sql문
			String sql = "insert into member"
					+" (num, name, addr)"
					+" values(?, ?, ?)";
			
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			
			// ? 에 값을 바인딩해서 미완성된 sql문을 완성 시킨다.
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			
			//실제로 수행하기
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//안전하게 마무리 작업하기
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//main
}//MainClass02