package com.biz.control;

public class Control02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		
		// 5만원권 개수 계산
		count = intPay / intPaper;
		// count 변수는 int 형으로 선언되어 있기때문에
		// = 뒤에서 어떤 계산(연산)결과가 나와도
		// 무조건 소수점 이하는 잘라버리고
		// 정수부분만 count 변수에 저장된다.
		
		System.out.println("5만원권:" + count);
		
		// 이제 5만원권을 계산했으니
		// 5만원권을 제외한 금액에서 나머지 화폐종류를
		// 계산 한다.
		
		// 위에서 intPay로 부터 5만원권의 매수를
		// 계산 했으므로
		// 1만원권을 계산할때는 5만원권 금액만큼을
		// 제외하고 1만원 매수를 구해야 한다.
		intPay -= (intPaper * count);
		intPaper /= 5; // 액면가를 5만원에서 1만원으로 변겨

		count = intPay / intPaper;
		System.out.println("1만원권" + count);

		// 5천원권 구하기
		intPay -= (intPaper * count);
		intPaper /= 2; // 5천원권
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		// 천원권
		intPay -= (intPaper * count);
		intPaper /= 5; // 1천원권
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		// 오백원권
		intPay -= (intPaper * count);
		intPaper /= 2; // 5백원권
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		
		
		
		
		
		
	}

}
