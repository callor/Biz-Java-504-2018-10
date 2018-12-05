package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<Integer> intList ;
	
	public MyClass02() {
		intList = new ArrayList();
	}
	
	public void push(int num) {
		intList.add(num);
	}
	
	public void show() {
		int intMulti = 1;
		for(int i : intList) {
			intMulti *= i;
		}
		System.out.println(intMulti);
	}
 	
}
