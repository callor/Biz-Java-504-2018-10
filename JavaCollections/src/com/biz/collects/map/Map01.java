package com.biz.collects.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> strAddr 
			= new HashMap();

		strAddr.put("홍길동","001-001-0001");
		strAddr.put("성춘향","002-002-0002");
		strAddr.put("이몽룡","003-003-0003");
		strAddr.put("임꺽정","0041-004-0004");
		
		String sTel = strAddr.get("임꺽정");
		System.out.println(sTel);
		
		Set<String> strKey = strAddr.keySet();
		for(String s : strKey) {
			System.out.println(strAddr.get(s));
		}
		
		Map<Integer,String> intNum 
			= new HashMap();
		
		intNum.put(90, "홍길동");
		intNum.put(80, "이몽룡");
		intNum.put(70, "성춘향");
		intNum.put(60, "임꺽정");
		intNum.put(50, "장길산");
		
		String strName = intNum.get(70);
		System.out.println(strName);
		
		Set<Integer> setInt = intNum.keySet();
		for(int i : setInt) {
			String s = intNum.get(i);
			System.out.println(s);
		}
	}
}





