package org.java.polymorphism;

public class ParentMain {
	public static void main(String[] args) {
		System.out.println("다형성");
		
		Parent p1= new Parent();
		p1.num1=10;
		p1.num2=20;
		p1.parentMethod();
		
		Parent p2=new Sub1();
		p2.num1=10;
		p2.num2=20;
		p2.parentMethod();
		
		Parent p3= new Sub1Sub();
		p3.num1=10;
		p3.num2=20;
		p3.parentMethod();
		//부모의 멤버만 호출가능
		
		Sub1 s1 = new Sub1();
		s1.num1=10;
		s1.num2=20;
		s1.num3=30;
		s1.num4=40;
		s1.sub1Method();
		s1.parentMethod();
		//부모+자식 멤버 모두 호출
	
		Parent p4=(Parent)new Sub1Sub();
		//(Parent)가 없어도 된다 -> upcasting
		Sub1 s2 = new Sub1Sub();
		
	}
}
