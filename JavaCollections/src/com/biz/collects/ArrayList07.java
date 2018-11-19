package com.biz.collects;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listNum 
			=new ArrayList();

		for(int i = 0 ; i < 45 ; i++) {
			listNum.add(i+1);
		}

		Collections.shuffle(listNum);
		for(int i = 0 ; i < 6 ;i++) {
			System.out.print(listNum.get(i) + ",");
		}
		System.out.println();
		
		
		
		
	
	}

}
