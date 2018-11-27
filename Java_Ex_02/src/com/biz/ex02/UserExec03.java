package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<UserVO> userList = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++) {
			
			// 한사람의 데이터 시작
			UserVO vo = new UserVO();
			System.out.print("학번>> ");
			String strNum = scanner.nextLine();
			vo.setStrNum(strNum);
			
			System.out.print("학생이름>> ");
			String strName = scanner.nextLine();
			vo.setStrName(strName);
			
			System.out.print("주소>> ");
			String strAddr = scanner.nextLine();
			vo.setStrAddr(strAddr);
			
			System.out.print("학년>> ");
			String strGrade = scanner.nextLine();
			vo.setStrGrade(strGrade);
			
			System.out.print("전화번호>> ");
			String strTel = scanner.nextLine();
			vo.setStrTel(strTel);
			
			// 리스트에 추가
			userList.add(vo);
		}
		
		System.out.println("=================================");
		System.out.println("학번\t이름\t학년\t주소\t전화번호");
		System.out.println("--------------------------------");
		for(int i = 0 ; i < userList.size(); i++) {
			System.out.print(userList.get(i).getStrNum() + "\t");
			System.out.print(userList.get(i).getStrName() + "\t");
			System.out.print(userList.get(i).getStrGrade() + "\t");
			System.out.print(userList.get(i).getStrAddr() + "\t");
			System.out.print(userList.get(i).getStrTel() + "\n");
		}
		System.out.println("=================================");

	}

}
