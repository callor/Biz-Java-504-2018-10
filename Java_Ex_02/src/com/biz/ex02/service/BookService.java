package com.biz.ex02.service;

import java.util.Scanner;

import com.biz.ex02.vo.BookVO;

public class BookService {
	
	public BookVO bookVO ;
	Scanner scan ;

	public BookService() {
		bookVO = new BookVO();
		scan = new Scanner(System.in);
	}
	
	public void makeBookInfo() {
		System.out.print("책제목 >>");
		String strTitle = scan.nextLine();
		bookVO.strTitle = strTitle;
		
		System.out.print("가격 >>");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		bookVO.intPrice = intPrice;
	}
	
	public void viewBookInfo() {
		System.out.println("책제목 : " + bookVO.strTitle);
		System.out.println("가격 : " + bookVO.intPrice);
	}
	
}







