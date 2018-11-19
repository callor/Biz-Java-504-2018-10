package com.biz.collects.set;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TreeSet은 중복되지 않도록 데이터를 관리하고
		 * 저장된 데이터를 자동 정렬한다.
		 */
		Set<Integer> intSet = new TreeSet();
		for(int i = 0 ; i < 10; i++) {
			int intNum = (int)(Math.random() * (100 + 1));
			intSet.add(intNum);
		}
		System.out.println(intSet);

	}

}



