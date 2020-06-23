package test.main;

import java.util.Scanner;

import test.dao.MemberDao;

public class MainClass00 {
	public static void main(String[] args) {
		
		/*
		 * 삭제를 원하는 회원의 번호를 입력받아서 
		 * 해당 회원정보를 삭제
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 회원의 번호를 입력하세요: ");
		int getNum = scan.nextInt(); 
		
		MemberDao dao = MemberDao.getInstance();

		dao.delete(getNum);
		System.out.println(getNum+"번 회원의 정보를 삭제했습니다. ");
		
	}//main
}//MainClass00
