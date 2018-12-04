package com.biz.classes;

public class CatClass {

	// 기본생성자
	// 기본생성자는 최초 클래스를 만들면
	// 보이지는 않지만 자동으로 생성이 된다
	// 
	// 하지만!!
	// 임의로 매개변수가 있는 생성자를 만들면
	// 기본생성자는 자동으로 만들어지지 않는다.
	
	// 그래서!!
	// 임의 생성자를 만들면, 반드시(가급적) 
	// 기본생성자를 만들어 주는 것이 좋다.
	public CatClass() {
		
	}
	
	public CatClass(String name) {
		System.out.println(name + " 객체 생성");
	}
	
}
