package com.biz.classes;

public class Method01 {
	
	public void hello() {
		System.out.println("안녕하세요");
	}
	
	public void hello(String name) {
		System.out.println(name + "!! 안녕");
	}
	
	public void hello(int num) {
		if(num == 7) {
			System.out.println("7은 행운의 숫자");
		} else if(num == 8 ){
			System.out.println("8은 완전 숫자");
		} else {
			System.out.println("나도 몰라");
		}
	}

}
