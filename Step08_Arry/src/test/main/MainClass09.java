package test.main;
import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		/*  cherry, apple, banana, melon, 7 
		 * 
		 * 	5개의 문자열 중에서 랜덤으로 3개가 한줄에 출력되게 해보세요.
		 *    예)  cherry | apple | cherry
		 *         7 | apple | melon
		 *         7 | 7 | 7
		 *         
		 */
		
		//랜덤하게 출력할 문자열을 미리 배열에 담아 놓는다. 
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		
		//랜덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		
		//0~4 사이의 랜덤한 정수 3개 얻어내기
		for(int i=0;i<3;i++) {
			//랜덤한 정수를 얻어내서 
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum; //배열에 저장한다 
		}
		
		//랜덤한 정수 3개 참조
		int one=nums[0];
		int two=nums[1];
		int three=nums[2];
		
		//출력할 문자열을 line변수에 담고 출력
		String line=items[one]+" | "+items[two]+" | "+items[three];
		System.out.println(line);
	}
}