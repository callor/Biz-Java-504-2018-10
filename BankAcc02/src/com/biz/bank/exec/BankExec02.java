package com.biz.bank.exec;

import com.biz.bank.service.BankService;

public class BankExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strFileName = "src/com/biz/bank/bankBalance.txt";
		BankService bs = new BankService(strFileName);
		
		bs.bankMenu();
		System.out.println("Good Bye!!");

	}

}
