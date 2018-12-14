package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

/*
 * BankService 클래스에서 핵심부분
 * 1. findId() : bankList에서 계좌번호를 조회하는 부분
 * 가. 매개변수로 strId(String) 값을 받고
 * 나. bankList를 순회(반복)하면서
 * 다. bankList에 들어있는 vo의 strId값을 추출해서
 *    (bankList.get(i).getStrId() 또는 vo.getStrId() 이용)
 * 라. 매개변수로 받은 strId와 일치하는 값이 있는지 검사를한다.
 * 	  if(vo.getStrId().equals(strId)), if(strId.equals(vo.getStrid())
 * 
 * 마. 만약 bankList에 찾고자 하는 id 가 없을 경우
 * 		if(vo.getStrId().equals(strId) == false) 
 * 	 또는 if(vo.getStrId().equals(strId) != true)라고 쓰이나
 * 	 보편적 코드에서는 if(!vo.getStrId().equals(strId)) 라고 사용한다
 * 
 * 바. findId() 는 null을 return해서 값이 없을 알리고
 * 
 * 사. 만약 bankList에 찾고자 하는 id 가 있으면
 * 아. findId()는 찾은 vo를 return 해 준다.
 * 
 * 
 */
public class BankService {
	
	List<BankVO> bankList;
	
	String strFileName;
	String ioFolder;
	
	Scanner scan ;
	
	// 맴버변수 영역에 있는 변수, 객체는
	// 생성자에서 초기화를 한다
	public BankService(String strFileName) {
		
		this.bankList = new ArrayList();
		this.strFileName = strFileName;
		this.ioFolder = "src/com/biz/bank/iolist/";
		
		this.scan = new Scanner(System.in);
	
	}
	
	// 원장을 update
	public void bankBalanceWrit() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(strFileName);
			for(BankVO vo : bankList) {
				pw.println(
					vo.getStrId() + ":"
					+ vo.getIntBalance() + ":"
					+ vo.getStrLastDate()
				);
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 입출금 내역을 저장하는 method
	public void bankIoWrite(String io, int intB,BankVO v) {
		
		FileWriter fw;
		PrintWriter pw;
		String thisId = v.getStrId(); // 계좌번호
		
		try {
			// 2번째 매개변수 true : 파일을 Append mode로 열어라
			fw = new FileWriter(ioFolder + thisId,true);
			pw = new PrintWriter(fw);
			if(io.equals("I")) {
				pw.printf("%s:%s:%d:%d:%d:%s\n", 
						v.getStrLastDate(),
						"입금",
						intB,
						0,
						v.getIntBalance(), 
						v.getStrLastDate());
			} else {
				pw.printf("%s:%s:%d:%d:%d:%s\n", 
						v.getStrLastDate(),
						"출금",
						0,
						intB,
						v.getIntBalance(), 
						v.getStrLastDate());

			}
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void bankMenu() {
		
		this.readFile();
		while(true) {
			System.out.println("========================================");
			System.out.println("1.입금   2.출금   3.계좌조회    0.종료");
			System.out.println("----------------------------------------");
			System.out.print("업무선택 >> ");
			String sMenu = scan.nextLine();
			int intMenu = Integer.valueOf(sMenu);
			if(intMenu ==0 ) break ;
			if(intMenu == 1) this.bankInput();
			if(intMenu == 2) this.bankOutput();
		}
		
	}
	
	public void bankInput() {
		
		// 생성자에서 초기화 했으므로 필요 없음
		// Scanner scan = new Scanner(System.in);
		
		System.out.print("입금 계좌번호 >> ");
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
		this.bankBalanceWrit();
		this.bankIoWrite("I",intB,b);
	
	}
	
	public void bankOutput() {
		
		// 생성자에서 초기화 했으므로 필요 없음
		// Scanner scan = new Scanner(System.in);
		
		System.out.print("출금 계좌번호 >> ");
		String s = scan.nextLine();
		BankVO b = findId(s);
		if(b == null) {
			System.out.println("계좌번호 없음");
			return ;
		}
		
		int iB = b.getIntBalance();
		System.out.print("출금액 >> ");
		String strB = scan.nextLine();
		int intB = Integer.valueOf(strB);
		if(iB < intB) {
			System.out.println("잔액부족 출금불가!!");
			return;
		}
		
		int lB = iB - intB;
		b.setIntBalance(lB);

		System.out.println("출금완료");
		this.bankIoWrite("O",intB,b);
		this.bankBalanceWrit();
	
	}
	
	public BankVO findId(String strId) {
		for(BankVO v : bankList) {
			if(v.getStrId().equals(strId)) {
				return v; 
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






