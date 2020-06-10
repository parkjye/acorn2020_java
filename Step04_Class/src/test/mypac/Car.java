package test.mypac;
/*
 *  [ 클래스의 용도 ]
 *  
 *  1. 객체의 설계도 역할
 *  
 *  2. 데이터 type의 역할을 한다.
 *  	(ex. 데이터 type은 Car type)
 *  
 *  3. static 필드나 static 메소드를 가지고 있는 역할을 한다.
 *  
 *  	( 
 *  		cf. 객체 == field(데이터의 저장소)와 method(기능). 
 *  				field는 static field 또는 non static field로 구성되어있다.
 *  	)
 *  
 *  3-1. 클래스명(Class Name)이 같아도 패키지명(Package)이 상이하면 다른 클래스이다.
 *  
 * */
public class Car { //설계도
	//자동차의 이름을 저장할 필드
	public String name;
	
	//달리는 메소드
	public void drive() {
		System.out.println("부릉부릉 달려요");
	}

}
