package com.biz.classes;
public class DogClass {
	
	String strName;
	public DogClass() {
		
	}
	
	// 매개변수가 있는 생성자는
	// 내부에서 사용되는 변수를 초기화 하거나
	// 특별히 시작하면서 실행할 명령들을 코딩
	public DogClass(String strName) {
		this.strName = strName;
	}
	
	public void run() {
		System.out.println(this.strName + " 달린다");
	}
	

}


