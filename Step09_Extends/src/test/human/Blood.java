package test.human;

//혈액형 정보를 저장할 객체를 생성할 클래스
public class Blood {
	//필드, private 클래스, 객체 내애서만 사용할거임
	private String rh;
	private String type;
	
	public String name; //**
	
	//생성자
	public Blood(String rh, String type) {
		this.rh=rh;
		this.type=type;
	}
	
	/*
	 * 필드를 선언한 후 `get(타이핑) + ctrl+space bar`
	 * ==> 이클립스가 getter메소드를 자동으로 만들어 줄 준비를 한다.
	 * */
	
	//필드에 저장된 rh와 type를 리턴해주는 getter메소드
	public String getRh() {
		return rh;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName(String n) {
		return n;
	}
	
}
