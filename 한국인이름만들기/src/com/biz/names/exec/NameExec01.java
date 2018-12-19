package com.biz.names.exec;

import com.biz.names.service.NameService;

public class NameExec01 {

	/*
	 * ================================
	 * 1.화면출력   2.파일저장   0.종료
	 * ================================
	 * 업무선택 >>
	 * 
	 * 1을 선택하면 화면에 보여주고
	 * 2를 선택하면 파일에 저장
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fstFile = "src/com/biz/names/한국성씨.txt";
		String sndFile = "src/com/biz/names/이름리스트.txt";
		String saveFile = "src/com/biz/names/fullNameList.txt";
		
		NameService ns = new NameService(fstFile,sndFile);
		
		ns.readSndFile();
		ns.readFirstFile();
		ns.makeFullName(10);
		
		ns.viewFullName();
		ns.writeFullName(saveFile);
		
	}

}




