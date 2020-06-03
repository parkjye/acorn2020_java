/*
 * [ 생성자 ]
 * 
 * 	1. 클래스명과 동일하다.
 * 	2. 메소드 모양과 유사하지만 return type이 없다.
 *	3. 객체를 생성(new)할 때 호출된다.
 *	4. 객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.(like 초기화)
 *	5. 생성자르 명시적으로 정의 하지 않아도 기본 생성자는 있다고 간주된다.
 * 
 * */

package test.mypac;

public class Student {
	
	//생성자: 객체가 호출될 때 실행 new Student();
	public Student() {
		System.out.println("Student 클래스의 생성자 호출됨!_!");
	}
	
	public void study() {
		System.out.println("공부를 해요");
	}
	
	public void goSchool() {
		System.out.println("학교를 가요");
	}

}
