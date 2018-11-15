package com.biz.arrays;

public class Score02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intKor = {
				88,
				87,
				98,
				78,
				95,
				76
		};
		int[] intEng = { 88,74,63,55,33,65,65 };
		
		System.out.println(intKor[0]);
		System.out.println(intKor[2]);
		System.out.println(intKor[1]);
		System.out.println(intKor[4]);
		// intKor 배열에 저장된 정수 데이터는 
		// 모두 6개이다.
		// 각 데이터는 
		//	index 0번부터 index 6까지 저장되어 있다
		// 그런데 index 7번 위치의 데이터를 읽으려고
		// 시도 하였기 때문에
		// Array Index Out of Bound 오류(Exception) 이
		// 발생 했다.
		//System.out.println(intKor[7]);
		
		

	}
	
	
	
	

}
