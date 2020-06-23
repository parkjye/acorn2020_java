package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 이용해 문자열을 두 번 입력받는다.
		 * 즉, 새로 추가할 이름과 주소를 입력 받아서
		 * MemberDao 객체를 이용해서 DB에 저장 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String getName = scan.nextLine();
		System.out.println("주소: ");
		String getAddr = scan.nextLine();
		scan.close();
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto();
		
		dto.setName(getName);
		dto.setAddr(getAddr);

		boolean isSuccess = dao.insert(dto);

	}//main
}//MainClass12
