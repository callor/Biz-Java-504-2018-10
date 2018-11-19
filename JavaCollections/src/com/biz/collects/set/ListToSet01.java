package com.biz.collects.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.collects.list.List04;

public class ListToSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List04.addList(strList);

		System.out.println(strList);
		
		//1. strList에서 
		// 	중복되지 않은 데이터를 만 추출하고 싶다
		//2. 추출된 데이터는 정렬이 되어 있으면 좋겠다.
		Set<String> strSet = new HashSet(strList);
		System.out.println(strSet);
		
		Set<String> strTreeSet = new TreeSet(strList);
		System.out.println(strTreeSet);
		
		//3. 새로운 Set이 아닌 strList를
		//  중복되지 않고, 정렬된 strList로 바꾸고 싶다.
		strList = new ArrayList(new TreeSet(strList));
		
		Set<String> sSet = new TreeSet(strList);
		strList = new ArrayList(sSet);
		
		

	}

}




