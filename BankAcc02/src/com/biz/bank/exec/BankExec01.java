package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;

public class BankExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String strFileName = "src/com/biz/bank/bankBalance.txt";
		Scanner scan = new Scanner(System.in);
		BankService bs = new BankService(strFileName);
		
		bs.readFile();
		
		while(true) {
			System.out.println("========================================");
			System.out.println("1.입금   2.출금   3.계좌조회    0.종료");
			System.out.println("----------------------------------------");
			System.out.print("업무선택 >> ");
			String sMenu = scan.nextLine();
			int intMenu = Integer.valueOf(sMenu);
			if(intMenu ==0 ) break ;
			if(intMenu == 1) bs.bankInput();
			if(intMenu == 2) bs.bankOutput();
		}
		System.out.println("Good Bye!!");
		

	}

}
