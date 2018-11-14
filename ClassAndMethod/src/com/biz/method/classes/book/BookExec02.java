package com.biz.method.classes.book;

public class BookExec02 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		BookVO book1 = new BookVO();
		book1.strName = "열혈자바";
		book1.strAuth = "윤성우";
		book1.strComp = "오랜지 미디어";
		book1.strDsc = "자바를 처음배우는데 좋은 교재";
		book1.intPrice = 30000;
		book1.intDC = 3000;
		
		BookDAO dao = new BookDAO();
		dao.vo = book1;
		dao.viewBook();
		
		BookDAO dao1 = new BookDAO();
		dao1.vo.strName = "자바야 놀자";
		dao1.vo.intPrice = 34000;
		dao1.vo.intDC = 3400;
		dao1.viewBook();

		BookDAO dao2 = new BookDAO();
		dao2.vo.strName = "데이터베이스";
		dao2.vo.intPrice = 45000;
		dao2.vo.intDC = 4500;
		dao2.viewBook();
		
		dao1.priceCacl(20);
		dao1.priceCacl(10);
		dao1.priceCacl(60);
		
		dao2.priceCacl(10);
		dao2.priceCacl(30);

		
		
	}
}
