package test.main;
import java.util.Random;
public class MainClass01 {
	public static void main(String[] args) {
		Random rNum = new Random();
		int getNum = rNum.nextInt(45)+1;
		System.out.println(getNum);
	}
}
