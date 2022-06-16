package org.java.interfaceEx;

public class Interface_1_main implements InterfaceEx_1, InterfaceEx_2 {
	
	@Override
	public void abstract1() {
		System.out.println("abstract1 오버라이딩");
	}

	@Override
	public void abstract2() {
		System.out.println("abstract2 오버라이딩");
	}
	
}	
