package test.dto;

public class MemoDto02 {
	private int num;
	private String content;
	private String regdate;
	
	public MemoDto02() {
		
	}
	public MemoDto02(String content) {

		this.content= content;
	}
	public MemoDto02(int num, String content,String regdate) {
		this.num= num;
		this.content= content;
		this.regdate= regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}