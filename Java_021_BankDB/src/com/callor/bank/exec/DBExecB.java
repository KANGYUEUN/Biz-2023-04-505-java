package com.callor.bank.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.bank.config.DBContract;

public class DBExecB {
	/*
	 * < DB(DBMS Server)에 연결하는 절차 > 
	 * 1. Driver 를 활성화(실행) 
	 * 2. 접속정보를 통하여 연결 
	 * 3. SQL 전송 
	 * 4. 결과받기
	 */
	public static void main(String[] args) {

		/*
		 * java SQL 을 통해 SELECT 할때는 
		 * 반드시 칼럼을 원하는 순서대로 나열해 주자 :  "buid, buname, buTel, buaddr, bubirth, bujob "
		 * 가급적 별표(*, 모든 칼럼 니 맘대로 순서)를 사용하지 말자 
		 * 
		 * SQL 을 여러 라인의 문자열로 나누고 연결하여 사용하는 경우
		 * "" 사이에 각 단어 앞뒤로 빈칸을 한칸씩 넣어주어야 한다.
		 * 
		 */
		String sql = " SELECT "
				+ " buid, buname, buTel, buaddr, bubirth, bujob "
				+ " FROM tbl_buyer ";

		// DB 와 연결하기 위한 Input 장치
		Connection conn = null;

		// jdbc 드라이버를 로딩하여 활성화 하라.
		// 외부와 연결 이므로 try catch 사용
		try {
			Class.forName(DBContract.jdbcDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 연결정보를 설정하여 연결 준비
		try {
			// DB_URL 경로를 통하여 USER_NAME 과 PASSWORD 로 login 테스트
			// 로그인이 성공하면 연결 정보를 conn 객체에 저장해 달라 
			conn = DriverManager.getConnection(
					DBContract.DB_URL, 
					DBContract.USER_NAME, 
					DBContract.PASSWORD);
			// DBMS 에 연결하여 SQL 에 보내기
			// try catch 문 하나로 쓰기 
			
			// 문자열로 되어있는 SQL  명령문을 DBMS 에 전달하는 데이터로 변환하는 일을 수행
			// 변환이 성공하면 연결정보를 pStr 객체에 저장해 달라.
			PreparedStatement pStr = conn.prepareStatement(sql);
			
			// DBMS 에게 방금 생성한 pStr 객체에 담긴 정보를 바탕으로 
			// SQL 을 실행하고, 실행 결과 정보를 result 에 저장해 달라. 
			ResultSet result = pStr.executeQuery();
			
			// DBMS 서버로 부터 전달된 데이터를 읽어오기 
			// next() 를 실행 하여 한줄의 데이터를 가져오기
			// 이때 더이상 읽을 데이터가 없으면 next() 는 'false' return
			while(result.next()) { // 한 라인씩 데이터를 가져와라
				System.out.print(result.getString(DBContract.BUYER.BUID) + "\t");	// 1번 칼럼 
				System.out.print(result.getString(DBContract.BUYER.BUNAME) + "\t");	// 2번 칼럼
				System.out.print(result.getString(DBContract.BUYER.BUTEL) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUADDR) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUBIRTH) + "\t");
				System.out.println(result.getString(DBContract.BUYER.BUJOB));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
