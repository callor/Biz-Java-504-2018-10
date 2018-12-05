package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intList ;
	
	public MyClass04() {
		intList = new ArrayList();
	}
	
	public void push(String num) {
		intList.add(Integer.valueOf(num));
	}
	
	public int show() {
		int intMul = 1;
		for(int i  : intList) {
			intMul *= i;
		}
		return intMul;
	}
	
	
}
