package com.biz.oracle.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class StdDataSourceFactory implements DataSourceFactory{

	/*
	 * 클래스의 member 변수 영역
	 * 여기에 변수나 객체를 선언하는 것은
	 * ==> 이 클래스의 어떤 메서드에서나 읽고 쓰기가 가능하도록
	 * 		하겠다 라는 의미
	 */
	Properties props;
	
	@Override
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub
		this.props = props;
	}

	@Override
	public DataSource getDataSource() {
	
		// TODO Auto-generated method stub
		PooledDataSource ds = new PooledDataSource();
		ds.setDriver(props.getProperty("DRIVER"));
		ds.setUrl(props.getProperty("URL"));
		ds.setUsername(props.getProperty("USER"));
		ds.setPassword(props.getProperty("PASSWORD"));
		return ds;

	}

}
