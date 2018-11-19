package com.biz.collects.list;

import java.util.LinkedList;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new LinkedList();
		List04.addList(strList);
		
		int intSum = 0;
		/*
		 * for..each 라고 하는 향상된, 확장된 for 구문
		 * List를 0번째 위치부터 끝까지 반복적으로 순회하면서
		 * 연산을 처리할 경우 사용할 수 있는 for 구문
		 * 
		 * strList의 개수만큼 자동으로 반복 개수가 설정되며
		 * 매 회전 마다 strList로 부터 요소를 1개씩 읽어서
		 * String s에 복사 한다.
		 * 
		 * for 구문 내에서 s 변수를 사용해서 여러가지
		 * 연산을 수행할수 있다.
		 */
		for(String s : strList) {
			intSum += Integer.valueOf(s);
		}
		System.out.println(strList);
		System.out.println("합계:" + intSum);
		
		
	}

}
