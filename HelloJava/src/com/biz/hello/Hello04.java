package com.biz.hello;

import java.util.ArrayList;
import java.util.List;

public class Hello04 {

	public static void main(String[] args) {

		String[] strArray = new String[5];
		// strArray는 몇개( = 길이 : lenght)?
		
		// 문자열만을 추가해서 list로 만들기 위한 선언
		List<String> strList = new ArrayList();
		
		// 정수 숫자만을 추가해서 list로 만들기 위한 선언
		List<Integer> intList = new ArrayList();
		
		System.out.println(strList.size()); // 몇개??
		
		strList.add("Korea");
		System.out.println(strList.size()); // 몇개??

		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea");
		System.out.println(strList.size()); // 몇개??
		System.out.println(intList.size()); // 몇개??
		intList.add(100);

	}

}







