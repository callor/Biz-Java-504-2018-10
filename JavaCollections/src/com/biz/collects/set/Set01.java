package com.biz.collects.set;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set은 List와 비슷한데
		 * 중복데이터 없는경우
		 */
		Set<String> strSet6 = new HashSet<String>();
		Set<String> strSet7 = new HashSet<>();
		Set<String> strSet8 = new HashSet();
		
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		
		System.out.println(strSet8);

	}

}
