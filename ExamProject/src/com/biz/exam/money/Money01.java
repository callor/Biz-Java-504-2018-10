package com.biz.exam.money;

import com.biz.exam.service.MoneyService;

public class Money01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nMoney = 3949203;
		
		// 우리나라의 통화는
		// 5만원 ~ 10원권까지 있다.
		// nMoney 를 5만원 ~ 10원 권까지
		// 최소 수량으로 지급하고 할때
		// 각 통화 단위별로 매수를 계산하여 
		// 급여명세.txt 저장
		
		String file = "src/com/biz/exam/money/급여명세.txt";
		MoneyService ms = new MoneyService();
//		ms.makePaper(nMoney);
		ms.makePaperBoolean(nMoney);
		ms.viewPaper2();
		ms.writerPaper(file);
		

	}

}






