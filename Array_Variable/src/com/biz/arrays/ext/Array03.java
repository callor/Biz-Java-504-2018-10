package com.biz.arrays.ext;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intNum = new int[45];
		for(int i = 0 ;i < intNum.length;i++) {
			intNum[i] = i+1;
		}
		
		int intCount = intNum.length * 3;
		
		for(int i = 0 ; i < intCount ;i++) {
			int index1 = (int)(Math.random()*45); // 0 부터 44
			int index2 = (int)(Math.random()*45);
			
			if(intNum[index1] > intNum[index2]) {
				int t = intNum[index1];
				intNum[index1] = intNum[index2];
				intNum[index2] = t;
			}

		}
		
		for(int i = 0 ; i < 6; i++) {
			System.out.print(intNum[i]+ ", ");
		}
		
		
		

	}

}
