package org.java.abstractEx;

public class Abstract1Main {
	public static void main(String[] args) {
		
		//new Abstract1();
		
		//Abstract1Sub a1= new Abstract1Sub();
		Abstract1 a1 = new Abstract1Sub();
		//다형성으로 부모 가져오기 가능
		a1.abstractMethod1();
	}
}
