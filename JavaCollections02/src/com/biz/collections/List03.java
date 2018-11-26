package com.biz.collections;

import java.util.ArrayList;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList();
		List<Integer> intList1 = new ArrayList<>();
		List<Integer> intList2 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 20 ; i++) {
			int rndNum = (int)(Math.random() * (100-50+1)) + 50;
			intList.add(rndNum);
		}
		
		int intSum = 0 ;
		for(Integer i : intList) {
			intSum += i;
		}
		System.out.println("합계:" + intSum);
		
		intSum = 0 ;
		for(int i = 0; i < intList.size();i++) {
			intSum += intList.get(i);
		}
		System.out.println("합계:" + intSum);
 
	}

}




