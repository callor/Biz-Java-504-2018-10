package com.biz.collects.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList
			= new ArrayList();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장영실");
		strList.add("장보고");
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Collections.sort(strList, 
				Collections.reverseOrder());
		
		System.out.println(strList);
		
		

	}

}
