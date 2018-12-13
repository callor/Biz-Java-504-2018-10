package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

public class BankService {
	
	List<BankVO> bankList;
	String strFileName;
	
	public BankService(String strFileName) {
		this.bankList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void bankInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호 >> ");
		String s = scan.nextLine();
		BankVO b = findId(s);
		if(b == null) {
			System.out.println("계좌번호 없음");
			return ;
		}
		
		int iB = b.getIntBalance();
		System.out.print("입금액 >> ");
		String strB = scan.nextLine();
		int intB = Integer.valueOf(strB);
		
		int lB = iB + intB;
		b.setIntBalance(lB);

		System.out.println("입금완료");
	
	}
	
	public BankVO findId(String strId) {
		for(BankVO v : bankList) {
			if(v.getStrId().equals(strId)) {

				return v; 
				///
//				System.out.println(v.toString());
//				System.out.print(v.getStrId());
//				System.out.print(v.getIntBalance());
//				System.out.println(v.getStrLastDate());
			}
		}
		return null;
	}
	
	public void readFile() {
		// TODO 파일을 읽어 bankList에 저장하는 메서드
		
		FileReader fr ;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(this.strFileName);
			buffer = new BufferedReader(fr);
			while(true) {
				String read = buffer.readLine();
				if(read == null) break;
//				System.out.println(read);

				String[] banks = read.split(":");
//				System.out.println(banks[0] + "-");
				
				System.out.printf("%s-%s-%s\n",
						banks[0],banks[1],banks[2]);
				
				BankVO vo = new BankVO();
				vo.setStrId(banks[0]);
				vo.setIntBalance(Integer.valueOf(banks[1]));
				vo.setStrLastDate(banks[2]);
				
				bankList.add(vo);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
			
			
}






