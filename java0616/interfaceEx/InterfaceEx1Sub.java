package org.java.interfaceEx;

public class InterfaceEx1Sub implements InterfaceEx1 {
	
	public int num1;
	public int num2;
	
	@Override
	public void abstracMethod() {
		System.out.println("abstractMethod 오버라이드");
	}
}
