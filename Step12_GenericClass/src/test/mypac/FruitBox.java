package test.mypac;

public class FruitBox<T> {
	/* 
	 * class 클래스명<Generic type>  
	 * 
	 * - 클래스를 정의할 때 Generic type을 지정해서 특정 type을 동적으로 지정할 수 있다.
	 * 
	 * - <GenericType명> 변수명처럼 자유롭게 명시할 수 있다.  
	 * 
	 * - public class FruitBox<T, T2> 여러개의 type사용 가능하다.
	 * 
	 * - Generic을 지정하지 않으면 Object type이 된다.
	 *  */
	
	//필드
	private T item;
	
	//메소드
	public void push(T item) {
		this.item=item;
	}
	
	public T pull() {
		return item;
	}
}
