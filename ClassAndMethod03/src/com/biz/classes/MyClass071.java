package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass071 {
	
	List<String> strList ;
	
	public MyClass071() {
		strList = new ArrayList();
	}
	
	public void insert(String name) {
		strList.add(name);
	}
	
	public void show() {
		// 리스트 만큼반복하면서
		for(String s1 : strList) {
			
			//각 항목의 문자열을 분해하고
			String[] s2 = s1.split("");
			// 분해된 문자열 만큼 또 반복하면서
			for(String s22 : s2) {
				// 각 글자와 , 를 출력하고
				System.out.print(s22 + ", ");
			}
			// 다 출력되면 글자수를 출력
			System.out.println("-" + s2.length + "글자");
		}
	}
	
	

}
