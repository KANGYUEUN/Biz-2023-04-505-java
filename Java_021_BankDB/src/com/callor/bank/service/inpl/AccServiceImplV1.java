package com.callor.bank.service.inpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.bank.config.DBConnection;
import com.callor.bank.config.DBContract;
import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService {

	// DB 에 연결 할때 사용하는 것
	protected final Connection dbConn;

	// DB에 연결하기 위해
	// dbConn 도구를 DBConnection.getDBConn()로 초기화
	public AccServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}

	// < throws SQLException >
	// try.. catch.. 문으로 묶지 않아도 throws... 사용 가능.
	// 입샙션이 발생하더라도 나는 처리하지 않고
	// 나를 호출한 메서드가 처리할 것이다.
	// AccDto acDto = result2Dto(result);
	protected AccDto result2Dto(ResultSet result) throws SQLException {
		AccDto acDto = new AccDto();
		acDto.acNum = result.getString(DBContract.ACC.ACC_NAME);
		acDto.acDiv = result.getString(DBContract.ACC.ACC_DIV);
		acDto.acBuId = result.getString(DBContract.ACC.ACC_BUID);
		// acDto.acBalance =
		// Integer.valueOf(result.getString(DBContract.ACC.ACC_BALANCE));
		// 데이터 타입이 확실히 int 인 경우
		// ' getInt() ' 사용 하여 직접 정수형으로 변환 후 받을수 있다.
		acDto.acBalance = result.getInt(DBContract.ACC.ACC_BALANCE);
		return acDto;
	}

	public List<AccDto> db2List(PreparedStatement pStr) throws SQLException {

		// DBMS 에 요청하기 PreparedStatement
		ResultSet result = pStr.executeQuery();
		List<AccDto> accList = new ArrayList<>();
		while (result.next()) { // 한줄의 데이터가 true 이면 실행
			AccDto acDto = result2Dto(result);
			accList.add(acDto);
		}
		pStr.close();
		result.close();
		return accList;
	}

	// DBMS 에 접속하여 tbl_acc 테이블의 데이터 전체를 select
	// List<AccDto> type 으로 변환하여 리턴
	@Override
	public List<AccDto> selectAll() {
		// List<AccDto> accList = new ArrayList<>();
		// 서버에게 질의할 sql을 사용
		String sql = " SELECT " + " acNum, acDiv, acbuid, acbalance " 
					+ " FROM tbl_acc " 
					+ " ORDER BY acNum ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<AccDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccDto findById(String acNum) {
		String sql = " SELECT " 
					+ " acNum, acDiv, acbuid, acbalance " 
					+ " FROM tbl_acc "
					+ " WHERE acNum = ? ";
		
		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acNum);
			ResultSet result = pStr.executeQuery();
			if (result.next()) {
				return result2Dto(result);
			}
			result.close();
			pStr.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<AccDto> findByBuId(String acBuId) {
		// SELECT 면 ResultSet 으로 데이터를 받는다 
		// 그외 는 실행성공여부를 int형으로 받는다.
		String sql = " SELECT " 
					+ " acNum, acDiv, acbuid, acbalance " 
					+ " FROM tbl_acc " 
					+  " WHERE acBuId = ? "
					+ " ORDER BY acNum ";
		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acBuId); // ? 갯수만큼 setting
			List<AccDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String maxAcNum(String date) {
		String sql = " SELECT substr(max(acNum),9) "
				+ " FROM tbl_acc "
				+ " WHERE substr(acNum,0,8) = ? ";
		
		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, date);
			ResultSet result = pStr.executeQuery();
			if(result.next()) return result.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "0";
	}

	@Override
	public int insert(AccDto dto) {
		String sql = " INSERT INTO tbl_acc(acNum, acDiv, acBuId, acBalance "
				+  " VALUES(?,?,?,?) ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.acNum);
			pStr.setString(2, dto.acDiv);
			pStr.setString(3, dto.acBuId);
			pStr.setInt(4, dto.acBalance);
			
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(AccDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
