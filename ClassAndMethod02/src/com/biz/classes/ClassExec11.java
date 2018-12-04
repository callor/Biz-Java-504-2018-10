package com.biz.classes;

import com.biz.classes.exec.MyClass05;

public class ClassExec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass05 m1 = new MyClass05("메리",15);
		// strName = 메리, intAge = 15 를 세팅하여 초기화
		
		MyClass05 m2 = new MyClass05("메리");
		// strName = 메리, intAge = 니맘대로(기본값)으로 세팅
		
		MyClass05 m3 = new MyClass05();
		// strName, intAge 설정하기 귀찮아 마음대로 세팅
	}

}
