package org.java.interfaceEx;

public interface InterfaceEx1 {
	//�������̽��� ���
	//int num1; ����
	
	//final�ʵ� ����
	public static final int MAXINUM = 100;
	
	public abstract void abstracMethod();	//�߻�޼��� ����(90%)
//	public abstract ��������
	
	default void defaultMethod() {
		System.out.println("default �޼���");	//default�޼��� ����
	} 
	public static void staticMethod() {		//static�޼��� ����
		System.out.println("static �޼���");
	}
//	public void basicMethod() {} �⺻ �޼���� ����
	
	
	
	
}
