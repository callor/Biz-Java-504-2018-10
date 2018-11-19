package com.biz.collects.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.biz.collects.list.List04;

public class ListToSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List04.addList(strList);
		
		// 중복되지 않은(순서가 무작위) 데이터 변환
		strList = new ArrayList(new HashSet(strList));
		
		// 오름차순 정렬된 중복되지 않은 데이터 변환
		strList = new ArrayList(new TreeSet(strList));

	}

}


