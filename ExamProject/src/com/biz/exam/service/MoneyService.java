package com.biz.exam.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoneyService {
	
	int int50K ;
	Map<String,Integer> mList ;
	String[] paperName ;
	
	public MoneyService() {
		int50K = 50000;
		mList = new HashMap();
		paperName = new String[]{
			"5만원권",
			"1만원권",
			"5천원권",
			"1천원권",
			"500원권",
			"100원권",
			"50원권",
			"10원권"
		};
	}
	
	public void writerPaper(String file) {
		
		PrintWriter pw ;
		try {
			pw = new PrintWriter(file);
			for(String name : mList.keySet()) {
				pw.println(name + " : " 
						+ mList.get(name));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewPaper2() {
		
		for(String name : mList.keySet()) {
			System.out.println(name + " : " 
					+ mList.get(name));
		}
	}
	
	public void viewPaper() {
		
		// Map에서 key 부분만 분리해 내기
		Iterator<String> keys 
			= mList.keySet().iterator();

		while(keys.hasNext()) {
			String name = keys.next();
			System.out.println(name + " : " 
					+ mList.get(name));
		}
		
	}

	public void makePaperBoolean(int nMoney) {
		
		boolean sw = true;
		for(String name : paperName ) {
			
			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			
			mList.put(name,nCount);
			
			// if(nMoney < 10) break;
			
			if(sw) {
				int50K = (int50K / 5);	
			} else {
				int50K = (int50K / 2);
			}
			sw = !sw;
		}
	}
	
	public void makePaper(int nMoney) {
		
		int[] intCM = new int[8];
		
		// 3949203;
		// nMoney를 5만원권으로 나누면 5만원권의 매수가
		// 구해지는데
		// 5만원권
		intCM[0] = (nMoney / int50K);
		nMoney = nMoney - (intCM[0] * int50K);
		
		// 1만원
		int50K = int50K / 5;
		intCM[1] = (nMoney / int50K);
		nMoney = nMoney - (intCM[1] * int50K);
		
		// 5천원
		int50K = int50K / 2;
		intCM[2] = (nMoney / int50K);
		nMoney = nMoney - (intCM[3] * int50K);

		// 1천원
		int50K = int50K / 2;
		intCM[3] = (nMoney / int50K);
		nMoney = nMoney - (intCM[3] * int50K);

		// 5백원
		int50K = int50K / 2;
		intCM[4] = (nMoney / int50K);
		nMoney = nMoney - (intCM[4] * int50K);

		// 1백원
		int50K = int50K / 2;
		intCM[5] = (nMoney / int50K);
		nMoney = nMoney - (intCM[5] * int50K);

		// 50원
		int50K = int50K / 2;
		intCM[6] = (nMoney / int50K);
		nMoney = nMoney - (intCM[6] * int50K);

		// 10원
		int50K = int50K / 2;
		intCM[7] = (nMoney / int50K);
		nMoney = nMoney - (intCM[7] * int50K);

		
		for(int i : intCM) {
			System.out.println(i);
		}
		
		
	}

	public void makePaperInt(int nMoney) {

		int iSw = 1;
		while(true) {
			
			int nCount = (nMoney / int50K);
			nMoney -= (nCount * int50K);
			
			if(iSw == 1) {
				int50K = (int50K / 5);
//				iSw = 0;
			} else {
				int50K = (int50K / 2);
//				iSw = 1;
			}
			 iSw *= -1;

		}
	}
	

}
