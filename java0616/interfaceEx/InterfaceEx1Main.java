package org.java.interfaceEx;

public class InterfaceEx1Main {
	public static void main(String[] args) {
		
		InterfaceEx1Sub i1 = new InterfaceEx1Sub();
		i1.num1 = 100;
		i1.num2 = 200;
		i1.abstracMethod();
		//�������̽��� ��ӹ��� Ŭ������ �������̽��� ��� ��������
		
		InterfaceEx1 i2 = new InterfaceEx1Sub();
		i2.abstracMethod();
//		��ӹ��� Ŭ���� ��� ��������
	}
}
