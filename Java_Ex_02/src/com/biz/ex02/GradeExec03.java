package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;

import com.biz.ex02.service.GradeService;
import com.biz.ex02.vo.GradeVO;

public class GradeExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeService gs = new GradeService();
		
		for(int i = 0 ; i < 5 ; i++) {
			gs.makeScore(i);
		}
		gs.viewScore();
	}
}






