package org.java.abstractEx;

public class AbstractEx2SubSub extends AbstractEx2Sub {
	//�θ�Ŭ������ �߻�Ŭ������ ��ӹޱ� ������ ��� �޼��� �����ؾ��Ѵ�
	
	@Override
	public void abstractMethod2(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}

	@Override
	public void abstractMethod1() {
		System.out.println("�߻�޼��� AbstractMethod1 ����");
	}
	public void basic() {
		System.out.println("�⺻�޼���");
	}

	
	
}
