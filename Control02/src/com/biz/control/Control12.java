package com.biz.control;

public class Control12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 급여액이 3000 이하이면 6%
		// 급여액이 3000 초과 10000 이하이면 9%
		// 10000을 초과하면 12%
		
		int intPay = 5000;
		if(intPay <= 3000) {
			System.out.println("세금:" +
					(intPay * .06));
		}
		// if( 10000 >= intPay && 3000 < intPay) {
		if( 10000 >= intPay && intPay> 3000) {
			System.out.println("세금:" +
					(intPay * .09));
		}
		if( intPay> 10000) {
			System.out.println("세금:" +
					(intPay * .12));
		}

		
		

	}

}
