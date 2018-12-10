package com.biz.inout.exec;

import java.util.Scanner;

import com.biz.inout.service.IoComeService;
import com.biz.inout.vo.IoComeVO;

public class IoComeExec01 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		IoComeService is = new IoComeService();

		while(true) {
			IoComeVO vo = ioInsert();
			System.out.println(vo);
			
			// vo 에 담기는 값은 완성된 vo이거나, null 이다

			
			/*
			if(vo != null) {
				if(vo.getStDate().equals("-1")) {
					System.out.println("종료합니다");
					break;
				}
				// 변환과정에서 오류가 있었으면
				if(vo.getIntDan()< 0 || vo.getIntSu() < 0) {
					System.out.println("단가나 수량 입력 오류");
					continue;
				}
				is.ioInOutInsert(vo);
			}
			*/
		}
		
		
		
//		vo.setStDate("2018-12-10");
//		vo.setStInout("매입");
//		vo.setStPum("새콤달콤");
//		vo.setIntDan(2000);
//		vo.setIntSu(10);
//		
//		is.ioInOutInsert(vo);
		
		
	}
	
	public static IoComeVO ioInsert() {
		
		IoComeVO vo = new IoComeVO();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("===================");
		System.out.println("매입 매출 등록");
		System.out.println("-------------------");
		
		System.out.print("거래일(-1:종료) >>");
		String strDate = scan.nextLine();
		if(strDate.equals("-1")) {
			// vo.setStDate("-1");
			return null;
		};// 종료코드
		
		System.out.print("거래방법(매입/매출) >>");
		String strInOut = scan.nextLine();
		
		System.out.print("품목(상품명) >> ");
		String strPum = scan.nextLine();
		
		try {
			System.out.print("단가 >>");
			String strDan = scan.nextLine();
			// vo.setIntDan(-1);
			int intDan = Integer.valueOf(strDan);
			
			
			System.out.print("수량 >>");
			String strSu = scan.nextLine();
			// vo.setIntSu(-1);
			int intSu = Integer.valueOf(strSu);

			vo.setStDate(strDate);
			vo.setStInout(strInOut);
			vo.setStPum(strPum);
			vo.setIntDan(intDan);
			vo.setIntSu(intSu);
			
		} catch (Exception e) {
			System.out.println("입력이 잘못되었습니다.");
			return null;
		}
		return vo;
	}

}
