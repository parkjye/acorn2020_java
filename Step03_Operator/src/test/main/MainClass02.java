package test.main;
/*
 *  2. 증감 연산자 테스트
 *     변수에 있는 숫자 값을 1씩 증가 혹은 1씩 감소 시킬때 사용한다. 
 *  ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++; 
		num++;

		num++; //최종적으로 num == 3
		// ++;이 가장 늦다. 

		
		int num2=0;
		num2--; 
		num2--;
		num2--;	//최종적으로 num == -3

		int num3=0;
		int result1 = num3++; //result에 0이 대입되고 num3가 1증가한다.
		
		int num4=0;
		int result2 = ++num4; //num4가 1증가하고 result2에 1이 대입된다.
	}
}












