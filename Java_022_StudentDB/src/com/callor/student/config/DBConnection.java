package com.callor.student.config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class DBConnection {
	
	private static SqlSessionFactory sqlSessionFactory; // 코드를 대신 만들어 준다.
	static {
		
		DataSource dataSource = new PooledDataSource(
				DBContract.JDBC_DRIVER,
				DBContract.DB_URL,
				DBContract.USER_NAME,
				DBContract.PASSWORD
				);
		
		// 여러개의 table 에 대하여 CRUD 를 실행할때
		// 타이밍에 의한 데이터 sync 오류 등을 자체적으로 관리하는 도구 
		TransactionFactory transactionFactory = new JdbcTransactionFactory();

		// mybatis 을 사용하여 DBMS 에 연결 하기 위한 환경설정
		Environment environment = new Environment("dev", transactionFactory, dataSource);

		// 환경설정 등을 mybatis 의 SqlSessionFactory 에게 전달하기 위한 객체
		Configuration configuration = new Configuration(environment);
		
		// Dao 인터페이스가 저장되어 있는 페키지를 지정한다.
		// mybatis 는 Dao 인터페이스 파일을 scan(검사) 하여 
		// Annotation 으로 설정된 SQL 명령문과
		// 각 method 의 return type 을 참조하여 DBMS를 핸들링 하는 CRUD 를 실행한다.
		configuration.addMappers("com.callor.student.mapper");
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}
	
	public static SqlSessionFactory getFactory( ) {
		return sqlSessionFactory;
	}
}
