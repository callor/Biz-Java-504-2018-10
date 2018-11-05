


//코드를 작성할때
// 단어와 단어들을 나열하여 문장을 만들고
// 문장들이 어울려서 어떤 기능(결과)를 만들어 낸다
public class HelloWorld01 {

	// 만약 단어와 단어사이를 띄어쓰기를 한칸 이상
	// 하지 않거나
	// _ 를 넣거나 숫자를 넣으면
	// 그것은 정상적인 문법이 아니기 때문에
	// 오류를 표시 한다.
	// void main : 정상적인 문법
	// void_main : 오류 >> void_main이라는 한 단어로 인식
	// void2main : 오류 >> void2main이라는 단어로 인식
	// static 2void : 2void는 아예 단어가 아니라고 인식
	// _test : 일단 의미는 모르지만 단어로 생각
	public static void main(String[] args) {
		// 슬래시(/) 두개가 연속으로 시작되는 문장은
		// 빈줄과 같이 인식 
		// comment, 주석, 참고사항
		// TODO Auto-generated method stub
		
		
		/*
		 * 특별히 빈칸으로 구분되지 않는 문장은
		 * 단어와 단어사이에 마침표(.)를 포함해서
		 * 단어와 단어를 구별한다.
		 * 
		 * Ctrl + d : 한줄 지우기
		 * Ctrl + z : undo
		 * Ctrl + s : 저장
		 * 
		 */
		System.out.println(30 * 40); // 숫자 30과 40을 곱해서 결과 보여주기
		System.out.println(); // 아무것도 보여주 않기 단, 줄바꿈만 하기

		// 큰따옴표로 묶인 것은 무엇이든지 모두
		// 문자열(String)이라고 한다.
		// 문자열은 보이는 그대로이다.
		System.out.println("Hello"); // Hello라는 글자를 보여주기
		System.out.println("30+40"); // 30+40 이라는 글자를 보여주기
		
		// 문자열들을 덧셈(연산)하면
		// 문자열들을 서로 순서대로 연결하여
		// 1개의 문자열로 만들어라
		// 그리고 그 문자열을 보여달라
		System.out.println("Republic" +"of" + "Korea");
		System.out.println("Republic " + "of " + "Korea");
		
		// 먼저 숫자 30과 40을 덧셈한 후
		// 마치 "30+40=" + "70" 한 결과 처럼 보여라
		System.out.println("30+40=" + (30+40));
		
		// 먼저 "30+40=" + "30"을 만들고
		// "30+40=30" + "40"을 만들어서
		// 보여라
		System.out.println("30+40=" + 30 + 40);

	}
}
