package test.main;
import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		
		//Student 객체를 생성해서 참조값을 s1이라는 변수에 담기
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.study();
		s1.goSchool();
	}
}
