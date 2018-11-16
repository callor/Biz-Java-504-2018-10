package com.biz.arrays.ext;

import com.biz.arrays.service.GradeService;

public class ArrayGrade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeService[] arrGS = new GradeService[10];
		for(int i = 0 ; i < arrGS.length;i++) {
			arrGS[i] = new GradeService();
			arrGS[i].gradeVO.setStrNum(""+ i+1);
			arrGS[i].gradeVO.setStrNum(String.valueOf(i+1));
			arrGS[i].makeScoreAll();
			arrGS[i].makeTotal();
		}
		
		makeLine();
		System.out.print("학번\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.print("과학\t");
		System.out.print("총점\t");
		System.out.print("평균\n");

		for(int i = 0 ; i < arrGS.length;i++) {
			arrGS[i].viewGrade();
			
			
			/*
			System.out.print(
					arrGS[i].gradeVO.getStrNum() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getIntKor() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getIntEng() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getIntMath() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getIntSci() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getIntSum() + "\t");
			System.out.print(
					arrGS[i].gradeVO.getFloatAvg() + "\n");
			*/
		}
		makeLine();

	}
	
	public static void makeLine() {
		for(int i = 0 ; i <50;i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	

}

