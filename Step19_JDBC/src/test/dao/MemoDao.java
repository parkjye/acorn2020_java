package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.MemoDto;
import test.util.DBConnect;

import java.util.ArrayList;
import java.util.List;

public class MemoDao {
	//필드
	private static MemoDao dao;
	
	//생성자
	private MemoDao() {}
	
	//객체 생성
	public static MemoDao getInstance() {
		if(dao == null) {
			dao = new MemoDao();
		}
		return dao;
	}
	
	//select, insert, update, delete
	
	/* * create table memo
 * (num number primary key,
 *  content varchar2(30),
 *  regdate date);*/
	
	//저장 insert
	public boolean insert(MemoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag=0;
		
		try {
			conn=new DBConnect().getConn();
			
			String sql="insert into memo"
					+" (num, content, regdate)"
					+" values( memo_seq.NEXTVAL, ?, SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}	
	}//insert();
	
	//수정
	public boolean update(MemoDto dto) {
//		MemoDto dto = new MemoDto();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag=0;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "update memo set content=? where num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			pstmt.setInt(2, dto.getNum());
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//전체 불러오기 selectAll
	public List<MemoDto> selectAll() {
		
		List<MemoDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn=new DBConnect().getConn();
			String sql = "select num, content, TO_CHAR(regdate, 'yyyy\"년\"mm\"월\"dd\"일\" am hh:mi') as regdate"
					+" from memo order by num ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				
				MemoDto dto = new MemoDto();
				dto.setNum(num);
				dto.setContent(content);
				dto.setRegdate(regdate);
				
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
	
	//한 개 불러오기 select
	public MemoDto select(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemoDto dto = null;
		
		try{
			conn = new DBConnect().getConn();
	
			String sql="select * from memo where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new MemoDto();
				
				dto.setNum(num);
				dto.setContent("ontent");
				dto.setRegdate("regdate");
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
	
	//삭제
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag=0;
		
		try {
			conn = new DBConnect().getConn();
			String sql="delete from memo where num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("삭제합니다.");
			
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
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}

}//MemoDao
