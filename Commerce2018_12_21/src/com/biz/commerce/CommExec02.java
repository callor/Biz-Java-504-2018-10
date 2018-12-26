package com.biz.commerce;

import com.biz.commerce.service.IoService;

public class CommExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 매입매출정보를 저장하고 있는 파일 이름(경로)를
		 * 문자열 변수에 저장
		 */
		String ioFile 
		= "src/com/biz/commerce/매입매출데이터(2018-12-21).txt";
		
		String pFile 
		= "src/com/biz/commerce/상품정보(2018-12-21).txt";
		
		/*
		 * IoService 클래스를 객체로 선언하여
		 * 매입매출 업무를 수행할 준비
		 * 
		 * ioFile 변수를 매개변수로 전달
		 * == 매입매출정보를 저장하고 있는 파일 이름을
		 * 매개변수로 전달하는 것과 같다.
		 */
		IoService is = new IoService(ioFile,pFile);
		
		/*
		 * 매입매출정보.txt 파일에서 데이터를 읽어서
		 * iolist에 저장하는 메서드 호출(실행)
		 */
		is.ioRead();
		
		/*
		 * 위에서 is.ioRead()메서드를 실행했으므로
		 * is의 iolist에 매입매출정보가 저장되어 있을 것이다.
		 * 그 정보를 확인 해 보자
		 * 
		 * is.ioView() 메서드를 호출(실행)해서
		 * 정보 확인
		 */
		is.ioView();
		
		/*
		 * 상품정보를 읽어 pList에 저장하기 위해서
		 * is.pRead() 메서드 실행
		 */
		is.pRead();
		is.pView();
		
		is.viewIoInfo2();
		
	}

}




