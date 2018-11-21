package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

/*
 * 키보드에서 문자나 숫자를 입력받아서
 * (어떤)연산을 수행한 후
 * 결과를 console에 표시하는 코드 작성
 */
public class SystemIn01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 30이라는 값을 기억장소에 (단순히)저장하라
		int intNum1 = 30;
		
		// 30이라는 값을 console에 표시하라는 명령
		System.out.println(30);

		// 키보드에서 어떤 값(문자열, 숫자)을 읽기
		
		//1. 입력장치를 감시하는 객체(input)생성
		InputStream input = System.in;
		
		//2. 입력장치 중에서 키보드에서 뭔가 입력을 하면
		//  키보드 버퍼에서 값을 읽기 위한 객체 생성
		Scanner scanner = new Scanner(input);
		
		//3. 키보드 버퍼에 문자열이 채워지는 동안
		//   키보드 버퍼를 감시
		System.out.println("키보드 버퍼 감시 시작....");
		String strKeyInput = scanner.nextLine();
		System.out.println("키보드 버퍼에서 값 읽음....");
		System.out.println(strKeyInput);
		
		
	}
}








