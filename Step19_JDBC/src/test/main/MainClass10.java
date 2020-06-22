package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//만일 MemberDao 객체의 참조값이 필요하다면?
		
		//Static 메소드를 이용해서 MemberDao 객체 참조값을 받아올 수 있다.
		MemberDao dao = MemberDao.getInstance();
		
		//새로 추가할 회원의 정보라면
		MemberDto dto=new MemberDto();
		dto.setName("정어리");
		dto.setAddr("상도동");
		
		//MembDao 객체의 메소드를 질용해서 저장할 수 있다.
		dao.insert(dto);
		
		///////////////// Part 02.
		
		MemberDao dao2=MemberDao.getInstance();
		//수정할 회원의 정보라면
		MemberDto dto2=new MemberDto(1, "김구라", "독산동");
		dao2.update(dto2);
	}
}
