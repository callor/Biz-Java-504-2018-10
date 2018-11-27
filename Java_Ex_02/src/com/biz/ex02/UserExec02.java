package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserExec02 {

	/*main에서 키보드로 부터 
	 * 한 학생에 대한 
	 * 학번, 
	 * 학생이름, 
	 * 학년, 
	 * 주소, 
	 * 전화번호를 입력 받아 UserVO에 저장
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserVO userVO = new UserVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번>> ");
		String strNum = scanner.nextLine();
		userVO.setStrNum(strNum);
		
		System.out.println("학생이름 >> ");
		userVO.setStrName(scanner.nextLine());

		System.out.println("학년 >> ");
		userVO.setStrGrade(scanner.nextLine());

		System.out.println(userVO.toString());
		
		
	}

}
