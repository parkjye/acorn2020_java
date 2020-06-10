package test.animal;

public class Animal<A, B> {
	//필드
	private A item;
	private B item2;
	
	public void push(A item, B item2) {
		this.item=item;
		this.item2=item2;
	}
	
	public A pullA() {
		return item;
	}
	
	public B pullB() {
		return item2;
	}
}
