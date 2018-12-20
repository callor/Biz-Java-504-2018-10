package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

public class BankService {
	
	List<BankVO> bankList;
	String balFile;
	Scanner scan;

	public BankService(String balFile) {
		bankList = new ArrayList();
		this.balFile = balFile;
		scan = new Scanner(System.in);
	}
	
	public void bankIOWriter(BankVO vo) {
		
		String filePath = "src/com/biz/bank/iolist/";
		String strId = vo.getStrID();
		int intBal = vo.getIntBalance();
		String strLastDate = vo.getStrLastDate();
		
		String strIO = vo.getStrIO();
		int intIO = vo.getIntIOCash();
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter(filePath + strId,true);
			pw = new PrintWriter(fw);
			
			pw.print(strId);
			pw.print(strLastDate);
			pw.print(strIO);

			if(strIO.equals("입금")) {
				pw.print(intIO);
				pw.print(0);
			} else {
				pw.print(0);
				pw.print(strIO);
			}
			pw.println(intBal);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void bankOutput() {
		System.out.print("출금계좌 >> ");
		String strId = scan.nextLine();
		BankVO vo = bankFindId(strId);
		if(vo == null) {
			System.out.println("계좌번호 오류!!");
			return ;
		}
		
		// 계좌번호가 정상이고, vo에는 
		// 해당 계좌번호의 정보가 담겨 있다.
		
		System.out.print("출금액 >> ");
		String strIO = scan.nextLine();
		int intIO = Integer.valueOf(strIO);
		
		if(intIO > vo.getIntBalance()) {
			System.out.println("잔액부족");
			return;
		} 
		
		// 새로운 코드
		// 출금일 경우 vo.strIO 에 "출금" 문자열 저장
		// vo.intIOCash에 출금금액을 저장
		// vo.balance에 - 출금액을 저장한다.
		
		vo.setStrIO("출금");
		vo.setIntIOCash(intIO);
		vo.setIntBalance(vo.getIntBalance() - intIO);
		
		this.bankIOWriter(vo);
		
		System.out.println("출금처리 완료!!!");
		
	}
	public void bankInput() {
		System.out.print("입금계좌 >> ");
		String strId = scan.nextLine();
		BankVO vo = bankFindId(strId);
		if(vo == null) return ;
		
		// 계좌번호가 정상이고, vo에는 
		// 해당 계좌번호의 정보가 담겨 있다.
		
		System.out.print("입금액 >> ");
		String strIO = scan.nextLine();
		int intIO = Integer.valueOf(strIO);
		
		// 새로운 코드
		// 입금일 경우 vo.strIO 에 "입금" 문자열 저장
		// vo.intIOCash에 입금금액을 저장
		// vo.balance에 +입금액을 저장한다.
		
		vo.setStrIO("입금");
		vo.setIntIOCash(intIO);
		vo.setIntBalance(vo.getIntBalance() + intIO);
		
		// old java 코드로 현재 날짜 가져오기
		SimpleDateFormat sm 
			= new SimpleDateFormat("yyyy-MM-dd");
		Date curDate = new Date();
		String strDate = sm.format(curDate);
		
		// New Java(1.8) 코드로 현재 날짜 가져오기
		LocalDate ld = LocalDate.now();
		strDate = ld.toString();
		
		vo.setStrLastDate(strDate);
		
		System.out.println("입금처리 완료!!!");
		
	}
	
	/*
	 * 계좌벊호를 매개변수로 받아서
	 * bankList에서 계좌를 조회하고
	 * bankList에 계좌가 있으면
	 * 		찾은 BankVO(vo)를 return 하고
	 * 없으면
	 * 		null을 return 하도록 한다.
	 */
	public BankVO bankFindId(String strId) {
		for(BankVO vo : bankList) {
			if(vo.getStrID().equals(strId))  
				return vo;
//				System.out.println("계좌번호 있음");
		}
		return null;
	}
	
	public void bankMenu() {
//		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("1.입금  2.출금  3.계좌조회  0.종료");
		System.out.println("==================================");
		System.out.print("업무선택 >> ");
		
		String strM = scan.nextLine();
		int intM = Integer.valueOf(strM);
		if(intM == 0) System.out.println("GoodBye!!");
		if(intM == 1) this.bankInput();  // System.out.println("입금");
		if(intM == 2) this.bankOutput(); //  System.out.println("출금");
		if(intM == 3) System.out.println("계좌조회");
	}
	
 	public void readBank() {
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(this.balFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String[] banks = reader.split(":");
				
				BankVO vo = new BankVO();
				vo.setStrID(banks[0]);
				vo.setIntBalance(Integer.valueOf(banks[1]));
				vo.setStrLastDate(banks[2]);
				bankList.add(vo);
				
			}
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
