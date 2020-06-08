package test.main;
/*
 *  6. 3항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * [ 3항 연산자 ]
		 * 1항=isWait / 2항="기다려요" / 3항="기다리지 않아요"
		 * true(왼쪽) false(오른쪽)
		*/
		boolean isWait=false;
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
		System.out.println(result);
		

		// 위의 3항 연산자는 아래와 같이 if ~ else문과 같은 로직이다.

		String result2=null;
		
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		
		System.out.println(result2);
	}
}











