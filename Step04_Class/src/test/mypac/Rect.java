package test.mypac;
public class Rect {
	//non static 필드
	public int width; //폭
	public int height; //높이
	
	/*
	 * 사각형의 면적을 리턴해주는 non static 메소드
	 * public void = 리턴 값 없음
	 * */
	public int getArea() {
		int area=this.width * this.height;
		return area;
	}
}
