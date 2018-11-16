package com.biz.arrays.ext;

import com.biz.arrays.service.GradeService;

public class ArrayGrade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeService gService = new GradeService();
		
		gService.gradeVO.setIntKor(gService.makeScore());
		gService.gradeVO.setIntEng(gService.makeScore());
		gService.gradeVO.setIntMath(gService.makeScore());
		gService.gradeVO.setIntSci(gService.makeScore());
		
		gService.makeTotal();
		System.out.println("============================");
		gService.viewGrade();
		System.out.println("============================");
		

	}

}






