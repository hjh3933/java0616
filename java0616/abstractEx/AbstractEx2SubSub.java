package org.java.abstractEx;

public class AbstractEx2SubSub extends AbstractEx2Sub {
	//부모클래스도 추상클래스를 상속받기 때문에 모든 메서드 구현해야한다
	
	@Override
	public void abstractMethod2(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}

	@Override
	public void abstractMethod1() {
		System.out.println("추상메서드 AbstractMethod1 구현");
	}
	public void basic() {
		System.out.println("기본메서드");
	}

	
	
}
