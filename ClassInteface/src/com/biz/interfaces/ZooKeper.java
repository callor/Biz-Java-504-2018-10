package com.biz.interfaces;

public class ZooKeper {
	
	
	public void food(AnimalInterface ani) {
		System.out.println("인터페이스를 통한 명령수행");
	}
	
	/*
	public void food(Lion lion) {
		System.out.println("사자가 사과를 먹습니다");
	}
	
	public void food(Tiger tiger) {
		System.out.println("호랑이가 단감을 먹습니다");
	}
	*/

	
	
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(float a, float b) {
		System.out.println(a + b);
	}
	
}
