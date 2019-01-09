package com.biz.oracle.service;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.biz.oracle.dao.StdDao;
import com.biz.oracle.db.StdDataSourceFactory;
import com.biz.oracle.vo.StdVO;

public class StdService {
	
	SqlSessionFactory sessionFactory;
	
	public StdService() {
		// TODO Auto-generated constructor stub
	
		Properties props = new Properties();
		
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "mybts";
		String password = "1234" ;
		
		props.put("DRIVER",oracleDriver);
		props.put("URL",url);
		props.put("USER", user);
		props.put("PASSWORD",password);
		
		DataSourceFactory dataSourceFactory 
				= new StdDataSourceFactory();
		dataSourceFactory.setProperties(props);
		
		DataSource dataSource = dataSourceFactory.getDataSource();
				
		TransactionFactory transactionFactory 
				= new JdbcTransactionFactory();
		
		Environment environment 
			= new Environment("stdEnv",transactionFactory,dataSource);
		
		Configuration config = new Configuration(environment);
		config.addMapper(StdDao.class);
				
		this.sessionFactory 
			= new SqlSessionFactoryBuilder().build(config);
	
	}

	public void stdView() {
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		
		List<StdVO> stdList = dao.selectAll();
		
		for(StdVO vo : stdList) {
			System.out.println(vo);
		}
	}

}
