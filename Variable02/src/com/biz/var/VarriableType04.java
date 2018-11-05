package com.biz.var;

public class VarriableType04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charAlpha = 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';

		System.out.println(charAlpha);
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		
		// char 문자형 변수값을
		// int 형 변수에 복사하면
		// 해당 문자의 ASCII코드가 복사 된다.
		int intAlpha = charAlpha; // 'A' 가 65로 바뀌어 복사
		int intNum = charNum; //'0'이 48로 바뀌어 복사
		int intSpec = charSpec; // '%' 가 37로 바뀌어 복사
		int intSpace = charSpace; // ' '가 32로 바뀌어 복사
		
		System.out.println("=== int char ===");
		System.out.println(intAlpha);
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);

		
		
		System.out.println(charAlpha + charNum);
		System.out.println(charAlpha + charSpec);
		System.out.println(charAlpha + charSpace);
		
		int intSQ = charAlpha + 20;
		System.out.println(intSQ);
		System.out.println((char)intSQ);
		
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		
		System.out.println("================");
		intAlpha = charAlpha;
		System.out.println((char)intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		
		
		
		
	}

}
