package test.mypac;
/*
 * 사용자 정의 Exception도 만들 수 있다.
 * 실행시 발생하는 Exception은 RuntimeException을 상속 받아서 만들면 된다. 
 * */
public class SleepyException extends RuntimeException {
	//예외 메시지를 생성자의 인자로 전달받아서
	public SleepyException(String msg) {
		super(msg); //부모 생성자에 전달
	}
}
