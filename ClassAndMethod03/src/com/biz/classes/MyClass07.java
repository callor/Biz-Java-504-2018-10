package com.biz.classes;

public class MyClass07 {

	String[] strArray ;
	
	public void insert(String strName) {
		strArray = strName.split("");
	}
	
	public void show() {
		for(String s : strArray) {
			System.out.print(s + ", ");
		}
		System.out.println("- " + strArray.length + "글자");
	}
	
}
