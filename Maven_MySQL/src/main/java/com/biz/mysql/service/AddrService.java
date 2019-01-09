package com.biz.mysql.service;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.biz.mysql.dao.AddrDao;
import com.biz.mysql.db.AddrDataFactory;
import com.biz.mysql.vo.AddrVO;

public class AddrService {
	
	SqlSessionFactory sqlSession ;
	
	private String otherDriver = "org.gjt.mm.mysql.Driver";
	private String mySqlDriver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
	private String user ="root";
	private String password ="!Biz1234";
	
	public AddrService() {

		// import java.util.Properties
		Properties props = new Properties();
	
		// DRIVER 라는 이름으로
		// mySqlDriver에 담긴 문자열을 vo로 만들고
		// props에 추가하라
		props.put("DRIVER",mySqlDriver);
		props.put("URL",url);
		props.put("USER",user);
		props.put("PASSWORD",password);
	
		// props에 DB 연결 profile을 담아서
		// DataSource에게 전달을 할 예정
		AddrDataFactory dataFactory = new AddrDataFactory();
		dataFactory.setProperties(props);

		// import javax.sql.DataSource
		// DB 연결만 관리할 객체
		DataSource dataSource = dataFactory.getDataSource();
		
		// 데이터를 변환(DB -> Java, Java->DB) 할 도구 설정
		// 데이터를 자신의 방법으로 모아서 보내고, 받는 일을 수행
		// import org.apache.ibatis.*
		TransactionFactory transactionFactory 
				= new JdbcTransactionFactory();
		
		// import org.apache.ibatis.*
		Environment env = new Environment("addrEnv", 
				transactionFactory, dataSource);
		
		// import org.apache.ibatis.*
		// Dao 클래와 MyBatis를 연결하는 일을 수행
		Configuration config = new Configuration(env);
		
		config.addMapper(AddrDao.class);
		
		this.sqlSession 
			= new SqlSessionFactoryBuilder().build(config);
		
	}
	
	public void addrView() {
		
		// SqlSessionFactory가 만든 SqlSession 상품을 사용하겠다.
		SqlSession session = this.sqlSession.openSession();
		AddrDao addrDao = session.getMapper(AddrDao.class);
		
		List<AddrVO> addrList = addrDao.selectAll();

		for(AddrVO vo : addrList) {
			System.out.println(vo);
		}
		
				
		
		
	}

}
