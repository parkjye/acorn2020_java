package test.mypac;

public class MyUtil {
	/*
	 * 필드(field), Method(메소드)
	 * 
	 * 1. static (field / method)
	 * 		하나(single)의 값 공유
	 * 2. non static (field / method)
	 * 
	 * */
	
	//A. static field
	public static String version; // = null;
	
	//1. static method
	public static void send() {
		System.out.println("전송합니다.");
	}
}
