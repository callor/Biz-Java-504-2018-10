package com.biz.arrays;

public class ScoreArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intScore = new int[5];
		for(int i = 0 ; i < intScore.length;i++) {
			intScore[i] = ConstMethod.makeScore();
		}
		
		for(int i = 0 ; i < intScore.length;i++) {
			System.out.print(intScore[i] +", ");
		}
		System.out.println("\n======================");
		
		for(int i = 0 ; i<intScore.length ; i++) {
			for(int j = i+1 ; j < intScore.length;j++) {
				if(intScore[i] > intScore[j]) {
					int t = intScore[i];
					intScore[i] = intScore[j];
					intScore[j] = t;
				}
			}
		}
		for(int i = 0 ; i < intScore.length;i++) {
			System.out.print(intScore[i] +", ");
		}
		System.out.println();

		
	}

}
