package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 검색할 회원번호를 입력받고
		 * 입력받은 번호에 해당되는 회원 정보를 아래와 같이 출력하세요.
		 * 
		 * 만일 1을 입력한 경우,
		 * 	1 | 김구라 | 노량진
		 * 
		 * 입력한 번호가 없는 경우,
		 * 	1번 회원은 존재하지 않습니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 회원의 번호를 입력하세요: ");
//		String getStr = scan.nextLine();
//		int getNum = Integer.parseInt(getStr);
		int getNum = scan.nextInt();
		scan.close();
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = dao.getDate(getNum);
		
		if(dto==null) {
			System.out.println(getNum+"번 회원은 존재하지 않습니다.");
		}else{
			System.out.println(dto.getNum()+" | "+dto.getName()+" | "+dto.getAddr());
			
		}
		
	}//main
}//MainClass14
