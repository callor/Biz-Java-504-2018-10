package com.biz.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1;
		int intNum2;
		
		intNum1 = 30;
		
		intNum2 = intNum1; 
		//intNum1�� �� 30�� �о
		// intNum2�� �����϶� = ���簳��

		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = 50;
		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
	
		intNum1 = intNum1 + 10;
		// 1. intNum1�� ����� 50�� CPU�� ������
		// 2. 10�� CPU�� ������
		// 3. �� ���� + �����ϰ�
		// 4. �� ����� �ٽ� intNum1 �� ����
		// ==> intNum1�� 10�� ����, ����
		intNum1 = intNum1 + 10;
		intNum1 = intNum1 + 10;
		
		//?? intNum1 
		System.out.println("Last:" + intNum1);
	}
}
