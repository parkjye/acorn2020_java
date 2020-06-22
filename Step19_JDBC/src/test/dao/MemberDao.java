package test.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemberDto;
import test.util.DBConnect;


/*
 * [ DAO (Data Access Object)의 약자 ]
 * 
 * - 만드는 방법
 * 	
 * 	1. 외부에서 객체를 생성하지 못하도록 생성자의 접근 지정자를 private으로 지정 
 * 	2. 자신의 참조값을 저장할 수 있는 필드를 priavte으로 선언
 * 	3. 자신의 참조값을 오직 하나만 생성해서 리턴해주는 static 메소드 만들기
 * 	4. 나머지 기능(Select, insert, update, delte)들은 non static으로 만들기
 * */
public class MemberDao {
	// 2번
	//자신의 찹조값을 저자할 privete 코드
	private static MemberDao dao;

	
	// 1번
	//외부에서 객체 생성하지 못하도록 한다.
	private MemberDao() {//참조값을 리턴해주는 메소드}
		
	}
	
	//3번
	public static MemberDao getInstance() {
		if(dao==null) { //최초 호출되면 ull이므로
			dao=new MemberDao(); //객체를 생성해서 static피드에 담는다.
		}
		return dao;
	}
	
	//회원 한 명의 정보를 리턴해주는 메소드
	public MemberDto getDate(int num){
		//회원 한 명의 정보를 담을 MemberDto
		MemberDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "select name, addr from member where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				dto = new MemberDto();

				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
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
		return dto;
	}
	
	//회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){
		
		List<MemberDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql = "select * from member order by num ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				MemberDto dto = new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				
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
		return list;
	}
	
	
	//4번
	//회원정보 DB에서 삭제하는 메소드
	public void delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=new DBConnect().getConn();
			
			String sql = "delete from member"
					+" where num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제합니다.");
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
	}
	
	//회원정보를 DB에 저장하는 메소드
	public void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new DBConnect().getConn();
			
			String sql="insert into member"
					+" (num, name, addr)"
					+" values( member_seq.NEXTVAL, ?, ?)";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 추가 했습니다.");
		
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
	}
	
	//회원정보를 DB에서 수정하는 메소드
	public void update(MemberDto dto) {
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
	};
	

}
