package com.biz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lottos = new ArrayList();
		
		for(int i = 0 ; i < 45 ;i++) {
			lottos.add(i+1);
		}
		
		for(int i = 0 ; i < 45 ; i++) {
			Collections.shuffle(lottos);	
		}
		
		Set<Integer> lottoSet = new TreeSet();
		for(int i = 0 ; i < 6 ; i++) {
			// System.out.println(lottos.get(i));
			lottoSet.add(lottos.get(i));
		}
		
		System.out.println(lottoSet);
		

	}

}
