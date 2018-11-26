package com.biz.inout.service;

import java.util.Scanner;

import com.biz.inout.vo.InoutVO;

public class InoutService {
	
	InoutVO inoutVO ;
	
	// 클래스의 생성자
	public InoutService() {
		inoutVO = new InoutVO();
	}
	
	public void makeInout() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("날짜(19990101) >>");
		String strDate = scanner.nextLine();
		
		System.out.print("구분(1:매입, 2:매출) >>");
		String strIO = scanner.nextLine();

		System.out.print("단가 >>");
		String strDanga = scanner.nextLine();

		System.out.print("수량 >>");
		String strSu = scanner.nextLine();

		System.out.print("부가세(1:과세, 2:면세) >>");
		String strVat = scanner.nextLine();
		
		// inoutVO = new InoutVO();
		inoutVO.setStrDate(strDate);
		inoutVO.setStrIO(strIO);
		inoutVO.setIntDanga(Integer.valueOf(strDanga));
		inoutVO.setIntSu(Integer.valueOf(strSu));
		inoutVO.setVat(Byte.valueOf(strVat));
		
	}
	

}










