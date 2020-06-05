package test.main;
import test.mypac.WaltDisney;
import test.mypac.Aladdin;

public class MainClass00 {
	public static void main(String[] args) {
		
		//1. playMovie()메소드를 호출해서 영화보기
		WaltDisney LionKing = new WaltDisney("박지예","라이온 킹",118);
		LionKing.playMovie();
		
		System.out.println("");

		//2. 새로운 영화의 개봉여부 확인하기
		LionKing.nextMovie("인어공주", 20);
		LionKing.nextMovie("모아이", 200);
		
		System.out.println("");
		
		//3. Aladdin 클래스의 메소드 호출
		Aladdin Mena = new Aladdin("카밀","알라딘",128);
		Mena.GenieSong();
		Mena.Abu();
		
		System.out.println("");
		
		//4. Aladdin 객체를 참조한 지역변수를 이용해서 WaltDisney클래스의 메소드 호출
		Mena.nextMovie("렌트", 3);
		Mena.playMovie(); //17행의 Mena변수에 담긴 전달인자 사용 
		

	}
}
