package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		//MemberDao 객체의 참조값 얻어오기
		
		MemberDao dao1 = MemberDao.getInstance();
		MemberDao dao2 = MemberDao.getInstance();
		MemberDao dao3 = MemberDao.getInstance();
		
		//dao1, dao2, dao3 안에 있는 참조값은 모두 같다.(Single ton)
		if(dao1 == dao2) {
			System.out.println("dao1, dao2는 같아요");
		}
		if(dao2 == dao3) {
			System.out.println("dao2, dao3는 같아요");
		}
	}
}
