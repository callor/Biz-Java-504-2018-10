package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToprint_대재민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 30; i ++) {
			String strNum = "" + (i+1);
			int intKor = (int)(Math.random()* (100-50+1)) +50;
			int intEng = (int)(Math.random()* (100-50+1)) +50;
			int intMath = (int)(Math.random()* (100-50+1)) +50;
			
			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			gradeList.add(gradeVO);
			}
		/*������ ������ gradeList�� Ȱ���Ͽ�
		 *  ../gradeList.txt ������ �����Ͻÿ�
		 *  �� ������ ������
		 *  �й� : ���� ���� : �������� : ��������
		 *  �������� �����Ͻÿ�
		 *  */
		String printFile = "c:/bizwork/workspace/ExFiles/gradeList.txt";
		try {
			
			PrintWriter pw = new PrintWriter(printFile);
			for(int i=0; i<gradeList.size(); i++) {
				GradeVO gradeVO = gradeList.get(i);
				pw.println("�й� : �������� : �������� : ��������");
				pw.println(gradeVO.getStrNum()+"\t"+gradeVO.getIntKor()+"\t"+gradeVO.getIntEng()+"\t"+gradeVO.getIntMath());
				
			}
			
			pw.close();
			System.out.println("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
		
	

}
