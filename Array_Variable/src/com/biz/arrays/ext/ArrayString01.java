package com.biz.arrays.ext;

public class ArrayString01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrS = {
				"Korea",
				"Television",
				"tommorow",
				"yesterday",
				"morning"
		};
		for(int i = 0 ; i< 10; i++) {
			viewWord(arrS);
		}
	}
	
	public static void viewWord(String[] arrS) {
		int intCount = arrS.length * 5;
		for(int i = 0 ; i < intCount ; i++) {
			int idx1 = (int)(Math.random()*arrS.length);
			int idx2 = (int)(Math.random()*arrS.length);
			
			if(idx1 > idx2) {
				String s = arrS[idx1];
				arrS[idx1] = arrS[idx2];
				arrS[idx2] = s;
			}
		}
		System.out.println(arrS[1]);

	}

}
