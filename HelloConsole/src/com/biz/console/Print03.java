package com.biz.console;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// 문자 char, Character
		// 1개의 영문자, 숫자, 특수문자를
		// 저장하거나, 통신(인터넷포함)을 
		// 통해 전달하고자 할때 사용하는 것으로
		// 모든 정보를 1개의 1byte(8bit) 공간에서
		// 처리할수 있다.
		System.out.println('A');
		System.out.println('0');
		System.out.println(' ');

		// (int)'A' : 문자 A의 ASCII코드 값을 보여달라
		// (int)'0' : 문자 0의 ASCII코드 값을 보여달라
		// (int)' ' : space 문자의  ASCIII코드 값을 보여라 
		System.out.println((int)'A');
		System.out.println((int)'0');
		System.out.println((int)' ');
		System.out.println((int)'a');
		System.out.println((int)'*');
		System.out.println((int)'"');
		System.out.println((int)'\'');
	}
}
