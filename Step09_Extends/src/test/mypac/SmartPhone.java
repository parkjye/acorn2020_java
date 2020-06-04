package test.mypac;

public class SmartPhone extends HandPhone{
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//@Override는 부모의 메소드를 재정의한 메소드라고 표시해주는 어노테이션(@) (지워도 오류는 아니지만 편의상 기재함)
	@Override
	public void takePicture() {
		//super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
	
	@Override
	public void Call() {
		System.out.println("Phone Class에 있는 메소드 Override");
	}
}
