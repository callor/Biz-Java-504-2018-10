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
		this.ioList.add(vo);
	}
	
	
}
