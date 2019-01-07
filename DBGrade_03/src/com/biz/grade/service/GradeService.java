package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {

	Scanner scan ; 
	String fileName ;
	
	public GradeService(String fileName) {
		this.fileName = fileName;
		this.scan = new Scanner(System.in);
	}
	
	public void gradeMenu() {
		while(true) {
			System.out.println("=================================");
			System.out.println("1.학생정보관리  2.성적관리 0.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >> ");
			
			String strM = scan.nextLine();
			if(Integer.valueOf(strM) == 1) {
				StudentService stService 
				= new StudentService(fileName);
				stService.stdMenu();
				
			} else if ( Integer.valueOf(strM) == 2) {
				ScoreService scService
				= new ScoreService();
				scService.scoreMenu();
				
			} else if ( Integer.valueOf(strM) == 0) {
				return;
			}
		}
	}
	
}
