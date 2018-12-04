package com.biz.classes;

import com.biz.classes.exec.MyClass06;

public class ClassExec12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass06 m = new MyClass06();
		
		/*
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random() * 100) + 1;
			m.add(intNum);
		}
		*/
		m.add(3);
		m.add(2);
		m.add(6);
		m.add(3);
		m.add(7);
		
		m.sum();
		
	}

}
