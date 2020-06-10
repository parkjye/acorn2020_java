package test.main;
import test.animal.*;
public class MainClass00 {
	public static void main(String[] args) {
		Animal<Elephant, Bird> a1 = new Animal<Elephant, Bird>();
		Animal<Monkey, Bird> a2 = new Animal<>();
		Animal<Wolf, Bird> a3 = new Animal<>();
		
		a1.push(new Elephant(), new Bird());
		
		Bird re = a1.pullB();
		Elephant re2 = a1.pullA();
		
		System.out.println(re);
		
	}
}
