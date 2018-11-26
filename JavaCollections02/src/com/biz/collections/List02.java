package com.biz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new LinkedList();
		strList = new ArrayList();
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장영실");

		for(int i = 0 ; i < strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		int intCount = strList.size();
		for(int i = 0 ; i < intCount ; i++) {
			System.out.println(strList.get(i));
		}
		
		// list의 전체를 모두 반복하면서 view하거나
		// 어떤 처리를 해야할 경우
		for(String s : strList) {
			System.out.println(s);
		}
		
		
	}

}
