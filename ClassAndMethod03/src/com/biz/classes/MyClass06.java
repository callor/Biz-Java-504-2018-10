package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<Integer> intList;
	public MyClass06() {
		intList = new ArrayList();
	}
	
	public void push(int num) {
		intList.add(num);
	}

	public String show() {
		String sRet = "";
		for(int i : intList) {
			sRet += i; // "" + 숫자
		}
		return sRet;
	}
}




