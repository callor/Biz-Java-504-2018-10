package com.biz.grade.service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.dao.StudentDao;
import com.biz.grade.dao.StudentDaoImp;
import com.biz.grade.vo.StudentVO;

public class StudentService {
	
	List<StudentVO> stdList ;
	String fileName = "";
	Scanner scan;
	StudentDao stdDao;
	
	public StudentService(String fileName) {
		// TODO Auto-generated constructor stub
		stdList = new ArrayList();
		this.fileName = fileName; 
		scan = new Scanner(System.in);
		stdDao = new StudentDaoImp();
			
	}
	
	public void readStdInfo() {
		
		FileReader fr ;
		BufferedReader buffer ;
		
		try {
			fr = new FileReader(fileName);
			buffer = new BufferedReader(fr);
			
			// while(true)
			// String reader = buffer.readLine()
			// if(reader == null ) break;
			
			String reader = new String() ;
			while((reader = buffer.readLine()) != null) {
				// break 가 생략 된 것과 같다.
				
				String[] st = reader.split(":");
				
				// 001 >> 0001
				String st_num = st[0];
				
				st_num = "00000" + st_num ; // 00000001
				int sEnd = st_num.length();
				int sStart = sEnd - 5;
				st_num = st_num.substring(sStart, sEnd);
				
				String st_name = st[1];
				String st_tel = st[2];
				String st_addr = st[3];
				
				StudentVO vo = new StudentVO(
						st_num,
						st_name,
						st_tel,
						st_addr
						);
				
				stdList.add(vo);
			}
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void stdMenu() {
		while(true) {
			System.out.println("====================================");
			System.out.println("학생정보 관리");
			System.out.println("------------------------------------");
			System.out.println("1.추가 2.수정 3.삭제 4.리스트 0.종료");
			System.out.println("5.파일로 부터 읽기 6.Bulk DB Update");
			System.out.println("------------------------------------");
			System.out.print("선택 >> ");
			
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 0) return;
			
			if(intM == 1) this.insertStudent();
			if(intM == 2) this.updateStudent();
			if(intM == 3) this.deleteStudent();
			// 파일에서 읽어 stdList 만들기
			if(intM == 5) this.readStdInfo();
			if(intM == 6) this.insertBulkData();
						
		}
				
	}

	private void insertBulkData() {
		// TODO stdList에 담겨있는 많은(bulk)데이터를 DB에 insert 하기
		
		/*
		 * Dao 인터페이스에서 정의하지 않은 메서드를 사용해서
		 * Dao의 어떤 기능을 수행하려고 한다.
		 * 이 메서드는 표준 method(CRUD)에 해당하는 메서드가 아니어서
		 * 굳이 인터페이스에 정의하지 않아도 된다.
		 * 이럴때는 아래와 같은 cast 코드로 작성을 한다.
		 */
	
		// 1번 사용법
		// StudentDaoImp impDao = (StudentDaoImp) stdDao;
		// impDao.insertBulk(stdList);
		
		// 2번 사용법
		((StudentDaoImp)stdDao).insertBulk(stdList);
		
	}

	private void deleteStudent() {
		// TODO 학생정보 삭제
		/*
		 * 학번을 입력받고
		 * 학생정보를 보여주고
		 * 삭제할 것인지 확인하고
		 * stdDao.delete() 메서드 호출해서 삭제 실행
		 */
		System.out.println("=====================");
		System.out.println("학생정보 삭제");
		System.out.println("---------------------");
		System.out.print("삭제할 학번 >> ");
		String strNum = scan.nextLine();
		
		StudentVO stVO = stdDao.findByNum(strNum);
		if(stVO != null) {
			
			this.viewStudent(stVO);

			System.out.println("===================");
			System.out.print("정말 삭제 할까요 (YES) ");
			String strYes = scan.nextLine();
			
			if(strYes.equals("YES")) {
				if(stdDao.delete(strNum) > 0) {
					System.out.println("삭제 성공!!");
				} else {
					System.out.println("삭제 실패!!");
				}
			}
			
		} else {
			System.out.println("찾는 학번이 없습니다");
		}
		
	}

	private void updateStudent() {
		// TODO 학생정보 수정
		System.out.print("검색조건 1.번호 2.이름");
		String strM = scan.nextLine();
		StudentVO vo = null;
		if(Integer.valueOf(strM) == 1) {
			System.out.print("학번>> ");
			String st_num = scan.nextLine();
			vo = stdDao.findByNum(st_num);
			viewStudent(vo);
			
		} else if (Integer.valueOf(strM) == 2) {
			System.out.print("이름 >> ");
			String st_name = scan.nextLine();
			List<StudentVO> stdList 
				= stdDao.findByName(st_name);
			viewStudent(stdList);
			
		}
	}
	private void viewStudent(List<StudentVO> stdList) {
		System.out.println("==================================");
		System.out.println("학번\t이름\t전화번호\t주소");
		System.out.println("----------------------------------");
		for(StudentVO vo : stdList) {
			System.out.print(vo.getSt_num() + "\t");
			System.out.print(vo.getSt_name() + "\t");
			System.out.print(vo.getSt_tel() + "\t");
			System.out.print(vo.getSt_addr() + "\n");
		}
		System.out.println("==================================");
		
	}

	private void viewStudent(StudentVO vo) {
		if(vo != null ) {
			System.out.println("===========================");
			System.out.println("학번:" + vo.getSt_num());
			System.out.println("이름:" + vo.getSt_name());
			System.out.println("전화번호:" + vo.getSt_tel());
			System.out.println("주소:" + vo.getSt_addr());
			System.out.println("============================");
		
		} else {
			System.out.println("학생정보를 찾을 수 없음");
		}

	}

	private void insertStudent() {
		// TODO 학생정보 추가
		while(true) {
			System.out.println("==================");
			System.out.println("학생정보추가");
			System.out.println("==================");
			System.out.print("학번 >> ");
			String strNum = scan.nextLine();
			int intNum ;
			
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("학번은 숫자로만 입력하세요");
				continue;
			}
			
			if(intNum == 0) {
				System.out.println("학생정보 추가 업무 종료!!");
				return ;
			}
			
			StudentVO stVO 
			= stdDao.findByNum(strNum);
			if(stVO != null) {
				System.out.println("이미 등록된 학번");
				continue;
			}
			
			
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			
			System.out.print("전화번호 >> ");
			String strTel = scan.nextLine();
			
			System.out.print("주소 >> ");
			String strAddr = scan.nextLine();
			
			StudentVO vo = new StudentVO(
						strNum,
						strName,
						strTel,
						strAddr
					);
			
			stdDao.insert(vo);
		}
		
		
		
		
	}
	
	

}
