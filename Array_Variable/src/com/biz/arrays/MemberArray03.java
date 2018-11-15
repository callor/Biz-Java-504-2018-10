package com.biz.arrays;

public class MemberArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO[] arrVO = new MemberVO[100];
		for(int i = 0 ; i < arrVO.length;i++) {
			arrVO[i] = new MemberVO();
		}
		
		for(int i = 0 ; i<arrVO.length;i++) {
			System.out.println(arrVO[i]);
		}
	}
}
