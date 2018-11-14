package com.biz.method.classes.oop01;

public class BookDAO {

	BookVO vo ;
	
	// 생성자 method
	public BookDAO() {
		this.vo = new BookVO();
	}
	
	public void viewBook() {
		System.out.println("==============");
		System.out.println("책정보");
		System.out.println("--------------");
		System.out.println("책이름:" + vo.strName);
		System.out.println("저자:" + vo.strAuth);
		System.out.println("출판사:" + vo.strComp);
		System.out.println("내용:" + vo.strDsc);
		System.out.println("가격:" +	vo.intPrice);
		System.out.println("할인:" + vo.intDC);
	}
	
	// 책을 구매할때 계산을 수행하는 method
	public void priceCacl(int intCount) {
		int intSum = (vo.intPrice - vo.intDC) 
						* intCount;
		System.out.println("=========================");
		System.out.println("구매한도서:" + vo.strName);
		System.out.println("구매권수:" + intCount);
		System.out.println("합계:" + intSum);
		System.out.println("=========================");
	}
	
	
	
	
	
	
	
	
	
	
}
