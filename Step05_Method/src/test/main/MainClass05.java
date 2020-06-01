package test.main;

import test.mypac.*;
import java.util.Scanner;

public class MainClass05 {
	/*
	 * test.mypac 패키지에 다양한 모양의 메소드를 가지는
	 * 클래스를 정의하고
	 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출하세요.
	 * */
	public static void main(String[] args) {
		
		PlayMusic PM = new PlayMusic();
		PlayMusicList PML = new PlayMusicList();
		
		PM.openApp("'시작'");
		
		//PlayMusicList 함수 안에 findML 함수 호출
		PM.findList().findML("박지예");
		
		//PlayMusicList02 함수안에 생성자로 호출
		PM.findList2("지예");
		
		//키보드 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("한곡반복은 1번, 랜덤플레이는 2번");
		int getNum = scan.nextInt();
		
		if(getNum==1) {
			PM.repeatList(1);
		}else if(getNum==2){
			PM.randomList(2);
		}else {
			System.out.println("왜 다른걸 누르셨어요...");
//			return;
		}
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("close 입력");
		String getStr = scan2.next();

		if(getStr.equals("close")) {
			PM.closeApp();
		}	
	}	
}
