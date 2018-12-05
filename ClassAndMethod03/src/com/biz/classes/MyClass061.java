package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass061 {

	List<String> strList;
	public MyClass061() {
		strList = new ArrayList();
	}
	
	public void push(int num) {
		strList.add(String.valueOf(num));
	}

	public String show() {
		String sRet = "";
		for(String s : strList) {
			sRet += s;
		}
		return sRet;
	}
}




