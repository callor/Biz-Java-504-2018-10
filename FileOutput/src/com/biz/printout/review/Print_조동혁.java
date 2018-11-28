package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_조동혁 {

	/*
	 * PrintWriter 클래스를 사용해서 구구단 5단을 gugudan.txt 파일에 작성하시오. 
	 * 5 x 1 = 5 
	 * 5 x 2 = 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String printFile = "D:/bizwork/workutf/ExFiles/gugudan.txt";  // 파일 위치와 파일 이름을 지정 

		try {                                                         // PrintWriter를 이용한 파일을 생성시에는 pw라는 객체를 초기화하면서
			PrintWriter pw = new PrintWriter(printFile);              // try...catch문으로 감싸줘야함
			
			int intNum = 5;                                           // 구구단 5단 >> 정수형 변수 intNum변수에 5라는 값을 저장

			for (int index = 0; index < 9; index++) {                 // for문을 이용하여 1 ~ 9까지 반복 및 연산을 하기위해 
				                                                      // i라는 정수형 변수 초기화 및 선언 
				pw.print(intNum);                                     // 파일내에 저장 (출력)
				pw.print(" x ");
				pw.print(index + 1);
				pw.print(" = ");
				pw.println(intNum * (index + 1));
			}

			pw.close();                                               // 닫아주지 않으면 파일 저장을 하고 읽는데에 불편함이 있어서
                                                                      // 파일을 생성하고 파일내에 내용을 저장시키고나면 닫아줘야한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("완료");                                   // "완료"라는 문자열을 console에 출력해서 실행확인                                  

	}

}
