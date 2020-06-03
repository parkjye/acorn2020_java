package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		//String type의 크기가 3인 빈 배열객체를 만들어서 참조값 지역변수 names에 담기
		String[] names= {null, null, null};
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		String[] names2 = new String[3];
		names2[0] = "김구라";
		names2[1] = "해골";
		names2[2] = "원숭이";
	}
}
