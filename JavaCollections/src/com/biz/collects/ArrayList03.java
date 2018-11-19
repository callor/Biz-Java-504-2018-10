package com.biz.collects;

import java.util.ArrayList;

public class ArrayList03 {

	/*
	 * ArrayList
	 *   다수의 객체를 다루기 위한 
	 *   	Java의 Collection이며
	 *   최초 생성될때는 size()가 0이며
	 *   
	 *   필요에 따라서 값을 추가, 삭제 하며
	 *   크기를 자유롭게 설정하여 쓸수 있다.
	 *      
	 *   arrayList.add(값) : 끝에 값을 추가할때
	 *   arrayList.add(3,값) : 2번과 3번 사이에
	 *   	값을 끼워넣을때
	 *   arrList.get(3) : 3번 위치의 값을 읽을때
	 *   arrList.set(4,값) : 4번 위치의 값을 변경할때
	 *   arrList.remove(5) : 5번 위치의 값을 삭제
	 *   arrList.remove(값) : 숫자형이 아닌경우
	 *   	arrList중 처음 나타나는 값 항목을 삭제
	 *   arrList.clear() : 모든 값을 삭제하고 
	 *   	size를 0으로 reset
	 *   
	 *   arrList.size() : 리스트의 개수확인
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList 
					= new ArrayList();
		
		strList.add("사과");
		strList.add("배");
		strList.add("토마토");
		strList.add("망고");
		strList.add("단감");
		
		int nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}

		
		strList.add(3, "바나나");
		System.out.println("==================");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		strList.remove(2);
		System.out.println("==================");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		strList.add("대봉");
		strList.add(1,"대봉");
		strList.add(3,"대봉");
		strList.add(5,"대봉");

		System.out.println("==================");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		
		strList.remove("대봉");
		
		System.out.println("==================");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		
		nSize = strList.size();
		for(int i = 0 ; i <nSize ;i++) {
			if(strList.get(i).equals("대봉")) {
				strList.remove(i);
			}
		}
		
		for(int i = 0 ; i < nSize ; i++) {
			strList.remove("대봉");
		}
		System.out.println("==================");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}

		
	}

}
