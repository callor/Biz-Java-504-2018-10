package com.biz.var;

public class VarriableTyle03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean 형에 대해 고찰
		int intNum1 = 30;
		int intNum2 = 40;
		
		boolean bNum ;
		
		// boolean은 비교 연산자를 통해 나온 결과
		bNum = intNum1 < intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 > intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 == intNum2;
		System.out.println(bNum);

		bNum = (intNum1 <= intNum2);
		System.out.println(bNum);

		bNum = (intNum1 >= intNum2);
		System.out.println(bNum);

		
		
	}
}
