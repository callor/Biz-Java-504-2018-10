package com.biz.inout.exec;

import java.util.Scanner;

import com.biz.inout.service.IoComeService;
import com.biz.inout.vo.IoComeVO;

public class ioComeExec01 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		IoComeService is = new IoComeService();

		IoComeVO vo = ioInsert();
		System.out.println(vo);
		
//		vo.setStDate("2018-12-10");
//		vo.setStInout("매입");
//		vo.setStPum("새콤달콤");
//		vo.setIntDan(2000);
//		vo.setIntSu(10);
//		
//		is.ioInOutInsert(vo);
		
		
	}
	
	public static IoComeVO ioInsert() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("===================");
		System.out.println("매입 매출 등록");
		System.out.println("-------------------");
		
		System.out.print("거래일(-1:종료 >>");
		String strDate = scan.nextLine();
		if(strDate.equals("-1") ;// 종료코드
		
		System.out.print("거래방법(매입/매출) >>");
		String strInOut = scan.nextLine();
		
		System.out.print("품목(상품명) >> ");
		String strPum = scan.nextLine();
		
		System.out.print("단가 >>");
		String strDan = scan.nextLine();
		int intDan = Integer.valueOf(strDan);
		
		System.out.print("수량 >>");
		String strSu = scan.nextLine();
		int intSu = Integer.valueOf(strSu);

		IoComeVO vo = new IoComeVO();
		vo.setStDate(strDate);
		vo.setStInout(strInOut);
		vo.setStPum(strPum);
		vo.setIntDan(intDan);
		vo.setIntSu(intSu);
		
		return vo;
	}

}
