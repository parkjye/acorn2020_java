package test.main;
import test.human.*;
public class MainClass10 {

	public static void main(String[] args) {
		//Blood객체를 생성해서 참조값을 b1 지역변수에 담기
//		Blood b1 = new Blood("Rh+","B", "박지예");
		
		Blood b2 = new Blood("Rh-","B");
		Blood b1 = new Blood("Rh+","B");
		
		String getName1 = b1.getName("박지예");
		String getName2 = b2.getName("김동완");
		
		//
		String result1=b1.getRh();
		String result2=b1.getType();
		
		String result3=b2.getRh();
		String result4=b2.getType();
		
		//
		System.out.print("이름: "+getName1+" ");
		System.out.println("혈액형: "+result1+result2);
		
		System.out.print("이름: "+getName2+" ");
		System.out.println("혈액형: "+result3+result4);
		
		
	}
}
