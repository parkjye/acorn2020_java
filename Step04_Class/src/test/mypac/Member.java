package test.mypac;

public class Member {
<<<<<<< HEAD
	//non static 필드 정의하기
	public int num;
	public String name;
	public String addr;
	
	//non static 메소드 정의하기
	public void showInfo() {
		System.out.println(this.num+" | "+this.name+" | "+this.addr);
	}
}






=======
	
	//필드
	public int num;
	public String name;
	public String addr;	
	public static int id; //상위개념
	
	//메소드
	public void showInfo() {
		//this == (class Member)참조값
		System.out.println(this.num+" | "+this.name+" | "+this.addr);
		
		//String name="원숭이"; name == 지역변수
		
		/*
		 * 혼돈의 소지가 없다면 생략가능
		 * but, 지역변수 name이 선언되서 this.name 표기
		 * 
		System.out.println(num+" | "+this.name+" | "+addr);*/
	}

}
>>>>>>> refs/heads/study
