package com.biz.var;

public class Variable07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���࿬����
		// ������ �տ� ++,-- �����ڰ� ���� ���°��
		int intNum1 = 0;
		
		++intNum1; // intNum1 �� 1 �������Ѷ�
		intNum1 += 1;
		intNum1 = intNum1 + 1;

		--intNum1; // intNum1�� 1 ���ҽ��Ѷ�
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		// ���� ������
		// ������ �ڿ� 
		// ++, -- �����ڰ� ���߿� ���°�
		intNum1++ ;
		intNum1 += 1;
		intNum1 = intNum1 + 1;
		
		intNum1-- ;
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		int intSum = 0;
		intNum1 = 0;
		
		intNum1 += 1;
		intSum += intNum1 ; // intSum > 1
		
		
		intNum1 = 0;
		intSum = 0;
		intSum += ++intNum1 ;
		System.out.println("intNum : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		intSum += intNum1++ ;
		System.out.println("intNum : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		
		intSum = ++intNum1;
		// �Ʒ��� ���� �ڵ�
		intNum1 += 1;
		intSum = intNum1;
		
		intSum = intNum1++;
		intSum = intNum1;
		intNum1 +=1 ;
		
		intNum1 = 0;
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		
		System.out.println(intNum1++);
		System.out.println(intNum1);
		
		// ���� intNum1�� 1 ���� ��Ų��
		// ������ ���� intSum �� ����
		intSum = ++intNum1;
		
		// ���⼭�� intNum1 �� �� ��ȭ��
		// intSum�� ������ ��ġ�� �ʴ´�.
		intSum = intNum1 ++;
		
		
		
		
		
		
		
		
	}

}
