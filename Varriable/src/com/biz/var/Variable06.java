package com.biz.var;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 0;
		int intSum = 0;
		
		intNum1 = intNum1 + 1;
		intSum += intNum1; // intSum = intSum + intNum1
		intNum1 += 1; // num1 => 2
		intSum += intNum1;
		
		intNum1 += 1;
		intSum += intNum1;
		
		// Ư���� += 1 �϶���
		intNum1 ++ ;
		intSum += intNum1;
		
		intNum1 ++;
		intSum += intNum1;

		++intNum1 ;
		intSum += intNum1;
		
		// ���� �տ� ++�� ������
		// ������� ���� = ���� + 1�� ����
		// �׸��� �� ����� intSum�� �����Ѵ�.
		intSum += ++intNum1 ;
		
		// �� ��  
		intSum += intNum1++;
		// ���� = ������ ���� �ڿ� ++�� ������
		// ������ ������ �ٷ� ������
		// ���� = ���� + 1�� �����Ѵ�.
	
	}

}
