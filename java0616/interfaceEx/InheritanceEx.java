package org.java.interfaceEx;

interface In1{
	void in1();
}

class A {
	
}

class B extends A implements In1 {

	@Override
	public void in1() {
		System.out.println("인터페이스 추상메서드 in1구현");
	}
}


public class InheritanceEx extends B {
	
	public static void main(String[] args) {
		
	}
}
