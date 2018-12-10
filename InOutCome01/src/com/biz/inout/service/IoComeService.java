package com.biz.inout.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.IoComeVO;

public class IoComeService {
	
	List<IoComeVO> ioList;
	
	public IoComeService() {
		ioList = new ArrayList();
	}
	
	public void ioInOutInsert(IoComeVO vo) {
		// 단가 * 수량
		int intTotal = vo.getIntDan() * vo.getIntSu();
		vo.setIntTotal(intTotal);
		this.ioList.add(vo);
	}
	
	public void iolistPrint() {
		
		int intLen = ioList.size();
		System.out.println("매입리스트");
		System.out.println("===========================");
		System.out.println("거래일자");
		System.out.println("---------------------------");
		for(IoComeVO v : ioList) {
			if(v.getStInout().equals("매입")) {
				System.out.print(v.getStDate() + "\t");	
			} else {
				System.out.print(v.getStDate() + "\t");
			}
		}
		
		System.out.println("매출리스트");
		System.out.println("===========================");
		System.out.println("거래일자");
		System.out.println("---------------------------");
		for(IoComeVO v : ioList) {
			if(v.getStInout().equals("매출")) {
				System.out.print(v.getStDate() + "\t");	
			}
		}

		
		
		
		
		
	}
	
	
}
