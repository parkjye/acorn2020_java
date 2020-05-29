package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스의 static메소드 호출하기
		MyUtil.send();
		//MyUtil 클래스의 static필드에 값 대입하기
		MyUtil.version="1.0";
	}
}
