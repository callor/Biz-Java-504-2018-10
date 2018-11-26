package com.biz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random() * (100-50+1)) + 50;
			intList.add(intNum);
		}
		System.out.println(intList);
	
		// List를 Set으로 변환
		// List에서 중복된 값을 제거하고자 할때
		Set<Integer> intSet = new HashSet(intList);
		System.out.println(intSet);
		
		// 원래대로 List로 환원
		intList = new ArrayList(intSet);
		
		intSet = new TreeSet(intList);
		System.out.println(intSet);
		
	}

}
