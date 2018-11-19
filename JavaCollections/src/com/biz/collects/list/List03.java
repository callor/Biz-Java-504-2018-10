package com.biz.collects.list;

import java.util.LinkedList;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<String> strList = new ArrayList();
		List<String> strList = new LinkedList();

		addList(strList);
		System.out.println(strList);
		
		rmList(strList);
		System.out.println(strList);
		
	}
	
	// 임의 숫자를 생성해서 List 10개 만들기
	public static void addList(List<String> sList) {
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random() * (10+1));
			sList.add(String.valueOf(intNum));
		}
	}
	
	// List중에 8이 있으면 모두 삭제
	public static void rmList(List<String> sList) {
		int nSize = sList.size();
		for(int i = 0 ; i < nSize ;i ++) {
			sList.remove("8");
		}
	}

}







