package com.biz.commerce;

/*
 * 자바야 지금부터 CommExec01 이라는 클래스를 시작한다
 */
public class CommExec01 {

	/*
	 * 만약 JVM에서 이 프로젝트를 실행할때,
	 * CommExec01 클래스에서 진입점 메서드를 호출할텐데
	 * 네가 응답하렴
	 */
	public static void main(String[] args) {
		/*
		 * 1부터 100까지 연속된 숫자중에서
		 * 짝수인 숫자만 모아서
		 * 그 덧셈을 하여 나에게 보여주렴
		 *
		 */
		
		/* 
		 * intSum 변수는 덧셈을 수행하면서
		 * 짝수들의 합을 저장할 변수로 선언한다.
		 */
		int intSum = 0;
		
		/*
		 * 반복문을 실행해서
		 * 1부터 100까지 연속된 숫자를 만들어 낸다
		 */
		for(int i = 1 ; i <= 100; i++) {

			/*
			 * for 안에서 if문을 사용해서
			 * 짝수 판별을 하고 짝수이면
			 * intSum 변수에 누적하라
			 */
//			if(i%2 == 0) {
//				intSum += i;
//			}
			/*
			 * 위 코드는 3단 들여쓰기 코드여서
			 * 별도로 메서드를 생성한 후
			 * 2단 코드로 변경하였다.
			 */
			
			/*
			 * for 반복문에서 생성된 숫자를
			 * addEvent() 메서드에게 매개변수로
			 * 전달한다.
			 */
			intSum += addEven(i);
		
		}
	}

	/*
	 * 숫자 1개를 num 매개변수에 받아
	 * 짝수이면 num 숫자를 return 하고
	 * 아니면 0을 return 한다.
	 */
	public static int addEven(int num) {
		if(num%2 == 0) return num;
		else return 0;
	}

}




