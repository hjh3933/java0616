package org.java.interfaceEx;

public interface InterfaceEx1 {
	//인터페이스의 멤버
	//int num1; 오류
	
	//final필드 가능
	public static final int MAXINUM = 100;
	
	public abstract void abstracMethod();	//추상메서드 가능(90%)
//	public abstract 생략가능
	
	default void defaultMethod() {
		System.out.println("default 메서드");	//default메서드 가능
	} 
	public static void staticMethod() {		//static메서드 가능
		System.out.println("static 메서드");
	}
//	public void basicMethod() {} 기본 메서드는 오류
	
	
	
	
}
