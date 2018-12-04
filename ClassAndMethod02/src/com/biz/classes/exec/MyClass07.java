package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	List<Integer> intList ;
	
	public MyClass07() {
		intList = new ArrayList();
	}
	
	public void add(int num) {
		intList.add(num);
	}
	
	public int sum() {

		int intLen = intList.size();
		int intSum = 0;
		for(int i = 0 ; i < intLen; i++) {
			int intNum = intList.get(i);
			intSum += intNum;
		}
		
		intSum = 0 ;
		for(int i : intList) {
			intSum += i;
		}
		/*
		int i = intList.get(0);
		int i = intList.get(1);
		int i = intList.get(2);
		int i = intList.get(3);
		int i = intList.get(4);
		int i = intList.get(5);
		*/
		
		// System.out.println("합계:" + intSum);
		return intSum;
		
	}
	
	
	
}
