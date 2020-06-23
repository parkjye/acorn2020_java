package test.dto;

public class CafeDto {
	//필드
	private int num;
	private String menu;
	private int price;
	private String cafename;
	
	//생성자
	public CafeDto(){}

	//생성자(필드에 저장할 값을 전달 받음)
	public CafeDto(int num, String menu, int price, String cafename) {
		super();
		this.num = num;
		this.menu = menu;
		this.price = price;
		this.cafename = cafename;
	}
	
	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCafename() {
		return cafename;
	}

	public void setCafename(String cafename) {
		this.cafename = cafename;
	}
	
	
}
