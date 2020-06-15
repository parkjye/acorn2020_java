package test.main;

import test.mypac.InterfaceA;
import test.mypac.InterfaceB;

public class InterfaceClass implements InterfaceA, InterfaceB {
	public InterfaceClass() {
		System.out.println("InterfaceClass 객체 생성");
	}
	
	@Override
	public void funA() {
		System.out.println("----funA()----");
		
	}
	
	@Override
	public void funB() {
		System.out.println("----funB()----");
		
	}



}
