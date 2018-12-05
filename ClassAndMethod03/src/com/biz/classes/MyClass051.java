package com.biz.classes;

public class MyClass051 {

	String strNum;

	public MyClass051() {
		strNum = "";
	}

	public void push(String num) {
		strNum += num;
	}

	public String show() {
		return strNum;
	}

}
