package com.biz.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray =  {
			"홍길동",
			"이몽룡",
			"성춘향",
			"임꺽정"
		};
		
		// 기존배열을 List로 변환하는 방법
		// 이렇게 변환시키면 read Only가 된다.
		List<String> strList = Arrays.asList(strArray);
		// strList.remove(0);
		// strList.add("장길산");
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Collections.shuffle(strList);
		System.out.println(strList);
		

	}

}
