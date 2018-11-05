package com.biz.console;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print** 키워드는 일반적으로
		// 무엇인가 정보를 보여주는 용도이다.
		// 컴퓨터에서 외부장치(모니터, 프린터)에
		// 데이터, 정보를 출력하는 키워드다
		System.out.println();
		System.out.println("hello");
		System.out.println(30);
		System.out.println(30+30);
		System.out.println("=====================");
		
		//() 를 사용해서 어떤 것을 처리하라고
		// 명령을 내릴때 () 안에 넣어주는 것들을
		// argument(s) 라고 한다.
		System.out.print(30);
		
		// key word 중에는 끝에 ()가 있는 키워드가 있고
		// 없는 키워드가 있는데
		// () 있는 키워드 = method 라고 부른다
		//    java외 다른 언어에는 함수, function 이라고
		//    부르기도 한다.
		System.out.print("hello");
		System.out.print(30+50);
		System.out.print("");  // null, Nothing 
		
		// *.*.println() : argument로 아무것도 주지 않아도
		// new line을 표시하는 기본 기능을 가지고 있기 때문에
		// argument를 주지 않아도 오류가 나지 않는다.
		
		// 그런데 *.*.print() 는 오로지 argument만을
		// 표시하도록 만들어진 method()이기 때문에
		// 아무것도 아닌값( null, "" )이라도 argument로
		// 넣어주지 않으면 오류가 발생하게 된다.
		
		// println()과 print()를 사용할때 예제
		System.out.println();
		System.out.println("30+40=" + (30+40));
		
		System.out.print(30);
		System.out.print("+");
		System.out.print(40);
		System.out.print("=");
		System.out.print(30+40);
		
		System.out.print("\n"); 
		// \n 은 \n 문자열을 표시하라는 의미가 아니고
		// new line 기호를 보내서 줄바꿈을 하라는 의미이다
		System.out.println();
		
		// \t tab을 한번 입력하라
		System.out.println("대한\t\t민국\n만세");
		System.out.println("\t\t우리나라만세");

	}
}
