package test.mypac;
/*
 * [ Data Transfer Object ] or [ Value Object ]
 * 
 * 객체를 생성할 클래스의 작성법
 * 
 * 1. private 접근 지정자로 필요한 필드(data type을 고려해서)를 만든다.
 * 2. default 생성자를 만든다.
 * 3. 모든 필드의 값을 생성자의 인자로 전달 받아서 필드에 저장하는 생성자를 Generate한다.
 * 4. 모든 필드의 접근 메소드 즉 setter, getter 메소드를 Generate한다.
 * 
 * 		Generate 방법: 마우스 우클릭 > Generate Constructor / Generate getters and stters
 * 
 * */
public class MemberDto {
	//private 접근 지정자로 필요한 필드를 정의한다.
	private int num;
	private String name;
	private String addr;
	
	//default 생성자를 정의한다.
	public MemberDto() {}
	//모든 필드의 값을 전달 받아서 필드에 저장하는 생성자를 정의한다.
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	//필드에 접근할 수 있도록 getter, setter 메소드를 만들어 놓는다.
	//cf. 필드이름에 따라서 메소드 이름 자동 생성된다.
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
