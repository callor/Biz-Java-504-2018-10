package com.biz.classes;

public class MyClass {

	// 실제로 만들지 않아도
	// 자동으로 생성되는 method
	// 단순히 (자신)객체를 초기화 하는 용도로 주로 사용
	public MyClass() {
		System.out.println("빈 생성자");
	}
	
	// 매개변수가 있는 생성자
	// 특별히 어떤 변수나 명령을 실행하고자 할때 사용
	public MyClass(String s) {
		System.out.println(s + " 생성자");
	}
	
	// 1번 method
	public void hello() {
		System.out.println("Hi");
	}
	
	// 2번 method
	public void hello(String name) {
		System.out.println(name + " 안녕!!!");
	}
	
}
