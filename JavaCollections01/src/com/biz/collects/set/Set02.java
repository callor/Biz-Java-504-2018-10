package com.biz.collects.set;

import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> strSet = new TreeSet();
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random() * (100+1));
			strSet.add(intNum + "");
		}
		System.out.println(strSet);

	}

}





