package com.biz.arrays.ext;

import com.biz.arrays.service.GradeService;

public class ArrayGrade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeService[] gS = new GradeService[10];
	
		makeDLine();
		makeTitle();
		makeSLine();
		
		for(int i = 0 ; i <gS.length;i++) {
			gS[i] = new GradeService();
			gS[i].gradeVO.setStrNum(""+(i+1));
			gS[i].makeScoreAll();
			gS[i].makeTotal();
			gS[i].viewGrade();
		}
		makeDLine();
	}
	
	public static void makeDLine() {
		for(int i = 0 ; i < 55 ; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	public static void makeSLine() {
		for(int i = 0 ; i < 55 ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void makeTitle() {
		System.out.print("학번\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("과학\t");
		
		System.out.print("총점\t");
		System.out.print("평균\n");
	}


	
	
}
