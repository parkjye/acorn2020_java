package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC ( Java DataBase Connectivity )
 * 
 * DataBase에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 * 
 * Oracle에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 * 사용할 수 있도록 설정해야 한다.
 *  
 * */
public class MainClass01 {
	public static void main(String[] args) {
		//DB와 연결하는 객체, 연결객체를 담을 지역변수 만들기
		Connection conn = null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속할 DB의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			//Connection 생성, 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//실행할 sql문 (문법 오류 주의)
			String sql = "SELECT deptno,ename,job FROM emp";
			
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			
			//PreparedStatement 객체를 이용해서 query문 수행하고 결과를
			//ResultSet 객체로 받아오기
			
			//리턴 값이 필요한 쿼리문일 때 사용(select 등)
			rs=pstmt.executeQuery();
			
			// 리턴 값이 필요 없는 쿼리문일 때 사용(insert, update, delete등)
			// rs=pstmt.executeUpdate();
			
			
			while(rs.next()) {
				int deptno=rs.getInt("deptno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				
				//출력하기
				System.out.println(deptno+" | "+ename+" | "+job);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}//main()
}//MainClass01
