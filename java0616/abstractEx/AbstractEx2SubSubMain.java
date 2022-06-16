package org.java.abstractEx;

public class AbstractEx2SubSubMain {
	public static void main(String[] args) {
		
		AbstractEx2 a1 = new AbstractEx2SubSub();
		a1.abstractMethod1();
		//할아버지것만소환가능
		AbstractEx2Sub a2 = new AbstractEx2SubSub();
		a2.abstractMethod1();
		a2.abstractMethod2(20, 30);
		//할아버지+아버지
		AbstractEx2SubSub a3 = new AbstractEx2SubSub();
		a3.basic();
		a3.abstractMethod1();
		a3.abstractMethod2(5, 5);
		//손자는 자기거 포함 다 가져올 수 있지
	}
}
