package org.java.interfaceEx;

interface In1{
	void in1();
}

class A {
	
}

class B extends A implements In1 {

	@Override
	public void in1() {
		System.out.println("�������̽� �߻�޼��� in1����");
	}
}


public class InheritanceEx extends B {
	
	public static void main(String[] args) {
		
	}
}
