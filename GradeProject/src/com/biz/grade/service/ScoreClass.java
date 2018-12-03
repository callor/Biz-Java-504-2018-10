package com.biz.grade.service;

public class ScoreClass {
	
	public int makeScore() {
		int intScore = 
				(int)(Math.random() * (100-50+1)) + 50;
		
		return intScore;
	}
	
}
