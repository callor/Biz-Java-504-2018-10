package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass03 {

	List<Integer> intList ;
	
	public MyClass03() {
		intList = new ArrayList();
	}
	
	public void push(int num) {
		intList.add(num);
	}
	
	public int show() {
		int intMul = 1;
		for(int i : intList) {
			intMul *= i ;
		}
		return intMul;
	}
	
	
}
