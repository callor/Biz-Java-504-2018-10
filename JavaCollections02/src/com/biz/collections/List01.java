package com.biz.collections;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrString = new String[10];
		
		arrString[0] = "홍길동";
		arrString[1] = "이몽룡";
		for(int i = 0 ; i < arrString.length; i++) {
			System.out.println(arrString[i]);
		}
		
		arrString = new String[20];
		
		// 초기에는 아무것도 없는 빈 객체
		List<String> strList = new ArrayList();
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		
		List<Integer> intList = new ArrayList();
		intList.add(30); //0
		intList.add(40); //1
		intList.add(50); //2
		intList.add(60);
		intList.add(70);
				
		System.out.println(strList.get(0));
		System.out.println(intList.get(3));
		intList.set(2, 100);
		
		System.out.println("========================");
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		intList.remove(2); // 2번위치의 리스트를 삭제
		System.out.println("========================");
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		System.out.println("========================");
		for(int i = 0 ; i < strList.size();i++) {
			System.out.println(strList.get(i));
		}
		strList.remove("성춘향");
		System.out.println("========================");
		for(int i = 0 ; i < strList.size();i++) {
			System.out.println(strList.get(i));
		}
				
		

	}

}
