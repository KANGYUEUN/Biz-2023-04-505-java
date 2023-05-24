package com.callor.bank.service.inpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.bank.config.DBConnection;
import com.callor.bank.config.DBContract;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService{

	protected final Connection dbConn;
	
	public BuyerServiceImplV1() {
		// DB 연결을 위한 초기화된 객체를 가져오기.(get)
		dbConn = DBConnection.getDBConn();
	}
	
	protected BuyerDto result2Dto(ResultSet result) {
		BuyerDto buyerDto = new BuyerDto();
		try {
			buyerDto.buId = result.getNString(DBContract.BUYER.BUID);
			buyerDto.buName = result.getNString(DBContract.BUYER.BUNAME);
			buyerDto.buTel = result.getNString(DBContract.BUYER.BUTEL);
			buyerDto.buAddr = result.getNString(DBContract.BUYER.BUADDR);
			buyerDto.buBirth = result.getNString(DBContract.BUYER.BUBIRTH);
			buyerDto.buJob = result.getNString(DBContract.BUYER.BUJOB);
			return buyerDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<BuyerDto> selectAll() {
		List<BuyerDto> buyerList = new ArrayList<>(); // List 가 쌓이는것을 방지 
		String sql = " SELECT "
				+ " buid, buname, butel, buaddr, bubirth, bujob "
				+ " FROM tbl_buyer "
				+ " ORDER BY buid ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				BuyerDto buyerDto = result2Dto(result); // 코드 줄이기 
				buyerList.add(buyerDto);
			}
			return buyerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/*
	 * < SQL 명령문 작성시 주의 >
	 * WHERE 절 명령문을 작성할때 
	 * 절대 변수와 전달값을 + 연산으로 묶어서 처리하면 안됌 
	 * 
	 * 다음과 같은 코드 사용경우
	 * 만약 id 변수에 "0001 OR 1 = 1" 과 같은 문자열이 담겨서 전달될 경우 
	 * WHERE 이 무력화 된다.
	 * SQL  문이 DELETE 와 같은 명령이라면 TABLE 의 모든 데이터가 삭제되는 명령이 실행됨
	 *    + " WHERE buid = " + id; 쓰면안됨
	 *    
	 *    => ' SQL Injection 공격 ' 이라고 한다.
	 */
	

	@Override
	public BuyerDto findById(String id) {
		String sql = " SELECT buid, buname, butel, buaddr, bubirth, bujob "
				+ " FROM tbl_buyer "
				+ " WHERE buid = ? ";
				
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, id);
			ResultSet result = pStr.executeQuery();
			
			if(result.next()) // 조회된 데이터가 있으면
				{ 
				return result2Dto(result);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int insert(BuyerDto dto) {

		String sql = " INSERT INTO tbl_buyer(buid, buname, butel) "
				+ " VALUES(?,?,?) "; // 1,2,3 번째 인서트 표현
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1,dto.buId);
			pStr.setString(2,dto.buName);
			pStr.setString(3,dto.buTel);
			
			// sql 로 전달하는 명령대로 DB를 변경 하라는 의미
			int result =  pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(BuyerDto dto) {
		String sql = " UPDATE tbl_buyer "
				+ " SET buname = ?,"
				+ " butel = ?,"
				+ " buaddr = ?,"
				+ " bubirth = ?,"
				+ " bujob = ?"
				+ " WHERE buid = ?";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buBirth);
			pStr.setString(5, dto.buJob);
			pStr.setString(6, dto.buId);
			return pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String id) {
		
		String sql = " DELETE FROM tbl_buyer "
				+ "WHERE buId = ?";
		
		try {
			PreparedStatement pst = dbConn.prepareStatement(sql);
			pst.setString(1, id);
			int result = pst.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
