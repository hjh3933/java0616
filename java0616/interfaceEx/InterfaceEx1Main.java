package org.java.interfaceEx;

public class InterfaceEx1Main {
	public static void main(String[] args) {
		
		InterfaceEx1Sub i1 = new InterfaceEx1Sub();
		i1.num1 = 100;
		i1.num2 = 200;
		i1.abstracMethod();
		//인터페이스를 상속받은 클래스로 인터페이스의 멤버 데려오기
		
		InterfaceEx1 i2 = new InterfaceEx1Sub();
		i2.abstracMethod();
//		상속받은 클래스 멤버 데려오기
	}
}
