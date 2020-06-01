
/*
 * [ 메소드를 만들 때 고려해야하는 것 ]
 * 
 *	1. 접근 지정자, public
 *	2. 리턴 type, void
 *	3. 메소드명, walk
 *	4. 메소드에 전달하는 인자의 갯수와 데이터 type, ()
 * 
 * */

package test.mypac;
public class MyObject {
	/*
	 * public => 이 메소드는 어디에서든 접근 가능하다
	 * void => 이 메소드는 어떤 값도 리턴하지 않는다.
	 * walk => 메소드명
	 * walk => 이 메소드는 어떤값도 전달 받지 않는다.
	 * */
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	
	//int type을 리턴해주는 메소드
	public int getNumber() {
		int myNum=10;
		//int type을 리턴해야 문법이 성립한다.
		return myNum;
	}
	
	//String type을 리턴해주는 메소드
	public String getGreeting() {
		String greet ="안녕하세요";
		return greet;
	}
	
	//Car type을 리턴해주는 메소드
	public Car getCar() {
		Car  c1 = new Car();
		return c1;
	}
	
	//int type을 메소드의 인자로 전달 받는 메소드
	public void setNem(int num) {
		System.out.println("num: "+num);
		
	}
	
	//String type을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println("name: "+name);
	}
	
	//Car type을 메소드의 인자로 전달 받는 메소드
	public void useCar(Car car) {
		car.drive();
	}
	
}
