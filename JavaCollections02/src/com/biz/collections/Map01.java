package com.biz.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> addrs = new HashMap();
		addrs.put("홍길동","001001");
		addrs.put("이몽룡","002002");
		addrs.put("성춘향","003003");
		addrs.put("임꺽정","004004");
		
		System.out.println(addrs.get("성춘향"));
		addrs.remove("성춘향");
		
		System.out.println(addrs.get("성춘향"));

		// Map을 for를 이용해서 내용을 살펴보기위해서는
		// 먼저 key를 추출해서 Set 형태로 추출
		Set<String> keys = addrs.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + addrs.get(key));
		}
		
		Map<Integer,String> students = new HashMap();
		students.put(1, "홍길동");
		students.put(2, "이몽룡");
		students.put(3, "성춘향");
		students.put(4, "임걱정");
		students.put(5, "장길산");
		Set<Integer> nums = students.keySet();
		for(int i : nums) {
			System.out.println(students.get(i));
		}
		

		

	}

}
