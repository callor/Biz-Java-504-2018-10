package com.biz.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> strSet = new HashSet();
		strSet = new TreeSet();
		
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("임꺽정");
		strSet.add("이몽룡");
		
		System.out.println(strSet);
		

	}

}
