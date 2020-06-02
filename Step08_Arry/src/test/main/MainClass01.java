package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*
		 * 배열 = 참조 데이터 type
		 * 한 번 길이가 정해지면 변경하지 못한다. 
		 * nums.length = 5 (고정)
		 * 
		 * 기본 데이터 type이 들어있는 배열
		 * */
		int[] nums= {10,20,30,40,50};
		
		double[] num2= {10.1, 10.2, 10.3, 10.4, 10.5};
		
		boolean[] truth= {true, false, false, true, true};
		
		//참조 데이터 type이 들어있는 배열
		String[] names= {"김구라", "해골", "원숭이", "주뎅이","덩어리"};
		
		//배열의 각 방 참조하기
		int resurt=nums[0];
		double result2=num2[1];
		boolean result3=truth[2];
		String result4=names[3];
		int result5=nums.length; //5
		
		//배열 객체의 메소드와 필드 사용하기
		int[] cloned = nums.clone();
		int size=nums.length; 
	}
}
