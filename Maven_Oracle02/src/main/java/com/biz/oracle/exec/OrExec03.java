package com.biz.oracle.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.oracle.service.ScoreService;
import com.biz.oracle.vo.ScoreVO;

public class OrExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreService sc = new ScoreService();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 >> ");
		String st_num = scan.nextLine();
		
		List<ScoreVO> scList = sc.viewScore(st_num);
		for(ScoreVO vo : scList) {
			System.out.println(vo);
		}
		

	}

}
