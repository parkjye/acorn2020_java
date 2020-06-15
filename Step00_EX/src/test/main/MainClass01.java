package test.main;

import test.mypac.InterfaceA;
import test.mypac.InterfaceB;

public class MainClass01 {
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		
		ia.funA();
		ib.funB();
	}
}
