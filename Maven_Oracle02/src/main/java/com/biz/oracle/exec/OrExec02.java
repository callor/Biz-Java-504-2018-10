package com.biz.oracle.exec;

import com.biz.oracle.vo.ScoreVO;

public class OrExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreVO vo = new ScoreVO();
		vo.setId(100);
		vo.setSt_num("001");
		vo.setSc_sb_code("001");
		vo.setSc_score(90);
		
		System.out.println(vo);
		
		vo = new ScoreVO(100,"001","001",90);
		
		System.out.println(vo);
		
		
		
		

	}

}
