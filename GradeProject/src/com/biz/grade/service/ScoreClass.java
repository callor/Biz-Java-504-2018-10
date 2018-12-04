package com.biz.grade.service;

public class ScoreClass {
	
	/*
	 * 1과목의 점수를 생성하는 메서드
	 */
	public int makeScore() {
		int intScore = 
				(int)(Math.random() * (100-50+1)) + 50;
		
		return intScore;
	}
	
}
