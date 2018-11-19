package com.biz.collects;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList 
				= new ArrayList();
		
		intList.add(30); // 0
		intList.add(40); // 1
		intList.add(50); // 2
		intList.add(60); // 3
		intList.add(70); // 4
		
		// intList의 3번째 데이터 60을 보고 싶다
		int n = intList.get(3);
		System.out.println(n);
				
		System.out.println(intList.get(2));
		// intList의 2번째 데이터(50)를
		// 100으로 바꾸싶다.
		intList.set(2, 100);
		n = intList.get(2);
		System.out.println(n);
		
		// intList의 개수가 몇개냐
		int nSize = intList.size();
		System.out.println("intList개수 : " + nSize);
		for(int i = 0 ; i< intList.size();i++) {
			System.out.println(intList.get( i ));
		}
		
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + ":" 
						+ intList.get( i ));
		}
		
		System.out.println("==================");
		intList.remove(3);
		
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + ":" 
						+ intList.get( i ));
		}
		System.out.println("==================");

		intList.add(2,900);
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + ":" 
						+ intList.get( i ));
		}

		System.out.println("=================");
		intList.add(2,100);
		intList.add(4,100);
		intList.add(100);

		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + ":" 
						+ intList.get( i ));
		}
		
	}
}



