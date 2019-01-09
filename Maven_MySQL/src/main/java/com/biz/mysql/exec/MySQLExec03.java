package com.biz.mysql.exec;

import java.util.Scanner;

import com.biz.mysql.service.AddrService;
import com.biz.mysql.vo.AddrVO;

public class MySQLExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("주소록 등록");
		System.out.println("-------------------------");
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();

		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();

		AddrVO vo = new AddrVO(strName,strTel,strAddr);
		
		AddrService as = new AddrService();
		as.insert(vo);
		
		as.addrView();
	}

}
