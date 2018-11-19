package com.biz.collects.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List 클래스는 선언전용 클래스로
		// 객체를 생성하는 용도로는 사용 못함
		// List<String> strList1 = new List(); 

		List<String> strList = new ArrayList();
		List04.addList(strList);
		
		// while(와일, 화일)을 사용한 반복문 구현할때
		// List를 Iterator로 변환하여 사용한다.
		Iterator<String> itr = strList.iterator();
		
		int intSum = 0;
		while(true) {
			if( itr.hasNext() ) {
				String s = itr.next();
				intSum += Integer.valueOf(s);
			} else {
				break;
			}
		}
		intSum = 0;
		while(true) {
			if( !itr.hasNext() ) break;
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		intSum = 0;
		while(itr.hasNext()) {
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		
		
	

	}

}
