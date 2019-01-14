package com.biz.oracle.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.biz.oracle.dao.ScoreDao;
import com.biz.oracle.dao.ScoreSumDao;
import com.biz.oracle.dao.StdDao;

public class OracleSqlFactory {
	
	SqlSessionFactory sessionFactory;
	
	public SqlSessionFactory getSessionFactory() {
		return this.sessionFactory ;
	}
	
	public OracleSqlFactory() {
		// TODO Auto-generated constructor stub
		Properties props = new Properties();

		props.put("DRIVER",DBContract.ORACLE_PRO.Driver);
		props.put("URL",DBContract.ORACLE_PRO.url);
		props.put("USER", DBContract.ORACLE_PRO.user);
		props.put("PASSWORD",DBContract.ORACLE_PRO.password);
		
		// DataSourceFacotry 만드는
		DataSourceFactory dataSourceFactory 
				= new StdDataSourceFactory();
		
		dataSourceFactory.setProperties(props);
		
		// DataSourceFactory로 부터 DataSource를 요청
		DataSource dataSource = dataSourceFactory.getDataSource();
				
		// TransactionFactory : 데이터를 대신 받아줄 중간 창고(공장)
		TransactionFactory transactionFactory 
				= new JdbcTransactionFactory();
		
		Environment environment 
			= new Environment("GradeENV",transactionFactory,dataSource);
		
		Configuration config = new Configuration(environment);
		
		config.addMapper(StdDao.class);
		config.addMapper(ScoreDao.class);
		config.addMapper(ScoreSumDao.class);
				
		this.sessionFactory 
			= new SqlSessionFactoryBuilder().build(config);
	
	}

}
