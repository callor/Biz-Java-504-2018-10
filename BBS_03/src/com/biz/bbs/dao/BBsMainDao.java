package com.biz.bbs.dao;

import java.util.List;

import com.biz.bbs.vo.BBsMainVO;

/*
 * interface는 일조의 class의 설계 도면
 * 		- method의 구조만 정의 할수 있다.
 * 		- 혼자서는 아무런 일도 수행 할수 없고
 * 		- 다른 클래스에서 implement해서 사용한다.
 */
public interface BBsMainDao {
	
	/*
	 * Dao class에는 CRUD method를 선언
	 */
	
	public void insert(BBsMainVO vo); // 데이터 추가는 1개씩 추가하는 것이 원칙
	public List<BBsMainVO> selectAll(); // 조건없이 전체 데이터 조회
	public BBsMainVO findById(long id); // id를 기준으로 1개의 데이터 조회
	public void update(BBsMainVO vo); // 데이터 1개를 기준으로 Update
	public void delete(long id); // id를 기준으로 1개의 "데이터만" 삭제

}




