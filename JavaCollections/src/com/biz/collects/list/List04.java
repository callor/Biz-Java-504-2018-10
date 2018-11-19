package com.biz.collects.list;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		addList(strList);
		
		int intSum = 0;
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++ ) {
			intSum += Integer.valueOf(strList.get(i)) ;
		}
		System.out.println(strList);
		System.out.println("합계:" + intSum);
		
		intSum = 0;
		for(int i = 0 ; i < nSize ; i++) {
			// 짝수만 합계산
			int intN = Integer.valueOf(strList.get(i));
			if(intN % 2 == 0) {
				intSum += intN;
			}
		}
		System.out.println("짝수합:" + intSum);

		int intEven = 0;
		int intOdd = 0;
		for(int i = 0 ; i < nSize ; i++) {
			// 짝수만 합계산
			int intN = Integer.valueOf(strList.get(i));
			if(intN % 2 == 0) {
				intEven += intN;
			} else {
				intOdd += intN;
			}
		}
		System.out.println("짝수합:" + intEven);
		System.out.println("홀수합:" + intOdd);
	}
	
	public static void addList(List<String> sList) {
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random() * (100+1));
			sList.add(intNum + "");
		}
	}

}






