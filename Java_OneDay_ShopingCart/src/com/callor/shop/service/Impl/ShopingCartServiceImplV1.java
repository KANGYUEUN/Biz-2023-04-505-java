package com.callor.shop.service.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.ProductDto;
import com.callor.shop.service.ShopingCartService;

public class ShopingCartServiceImplV1 implements ShopingCartService {

	protected final Connection dbConn;

	public ShopingCartServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}

	protected ProductDto result2Dto(ResultSet result) throws SQLException {
		ProductDto pdDto = new ProductDto();
		pdDto.pCode = result.getString(DBContract.PRODUCT.PRODUCT_CODE);
		pdDto.pName = result.getString(DBContract.PRODUCT.PRODUCT_NAME);
		pdDto.pItem = result.getString(DBContract.PRODUCT.PRODUCT_ITEM);
		pdDto.pIPrice = result.getInt(DBContract.PRODUCT.PRODUCT_IPRICE);
		pdDto.pOPrice = result.getInt(DBContract.PRODUCT.PRODUCT_OPRICE);
		return pdDto;
	}

	public List<ProductDto> db2List(PreparedStatement pStr) throws SQLException {

		ResultSet result = pStr.executeQuery();
		List<ProductDto> pdList = new ArrayList<>();
		while (result.next()) {
			ProductDto pdDto = result2Dto(result);
			pdList.add(pdDto);
		}
		pStr.close();
		result.close();
		return pdList;
	}

	@Override
	public List<ProductDto> selectAllP() {
		String sql = " SELECT " 
				+ " pCode, pName, pItem, pIPrice, pOPrice " 
				+ " FROM tbl_product " 
				+ " ORDER BY pCode ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<ProductDto> pdList = db2List(pStr);
			return pdList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	// 상품등록 메뉴
	public int insert(ProductDto dto) {
		String sql = " INSERT INTO " 
				+ " tbl_product(pCode, pName, pItem, pIPrice, pOPrice) " 
				+ "	VALUES(?,?,?,?,?) ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pCode);
			pStr.setString(2, dto.pName);
			pStr.setString(3, dto.pItem);
			pStr.setInt(4, dto.pIPrice);
			pStr.setInt(5, dto.pOPrice);
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	// 상품수정 (코드입력시 수정으로 변환 )
	public int update(ProductDto dto) {
		String sql = " UPDATE tbl_product " 
				+ " SET pName = ?, " 
				+ " pItem = ?, " 
				+ " pIPrice = ?, " 
				+ " pOPrice = ?, "
				+ " WHERE pCode = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pName);
			pStr.setString(2, dto.pItem);
			pStr.setInt(3, dto.pIPrice);
			pStr.setInt(4, dto.pOPrice);
			pStr.setString(5, dto.pCode);
			return pStr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	protected BuyerDto result3Dto(ResultSet result) throws SQLException {
		BuyerDto byDto = new BuyerDto();
		byDto.buId = result.getString(DBContract.BUYER.BUID);
		byDto.buName = result.getString(DBContract.BUYER.BUNAME);
		byDto.buTel = result.getString(DBContract.BUYER.BUTEL);
		byDto.buAddr = result.getString(DBContract.BUYER.BUADDR);
		return byDto;
	}

	public List<BuyerDto> db3List(PreparedStatement pStr) throws SQLException {

		ResultSet result = pStr.executeQuery();
		List<BuyerDto> byList = new ArrayList<>();
		while (result.next()) {
			BuyerDto byDto = result3Dto(result);
			byList.add(byDto);
		}
		pStr.close();
		result.close();
		return byList;
	}

	@Override
	public List<BuyerDto> selectAllB() {
		String sql = " SELECT " 
					+ " buId, buName, buTel, buAddr " 
					+ " FROM tbl_buyer " 
					+ " ORDER BY buName ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<BuyerDto> byList = db3List(pStr);
			return byList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 고객정보
	@Override
	public int insert(BuyerDto dto) {
		String sql = " INSERT INTO " 
					+ " tbl_buyer(buId, buName, buTel, buAddr) " 
					+ " VALUES(?,?,?,?) ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buId);
			pStr.setString(2, dto.buName);
			pStr.setString(3, dto.buTel);
			pStr.setString(4, dto.buAddr);
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// 고객정보 등록 및 수정
	@Override
	public int update(BuyerDto dto) {
		String sql = " UPDATE tbl_buyer " 
					+ " SET buId = ?, " 
					+ " buTel = ?, " 
					+ " buAddr = ?, " 
					+ "WHERE buName = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buId);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buName);
			return pStr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 고객 Id를 찾을 메서드
	@Override
	public BuyerDto findById(String id) {
		String sql = " SELECT buId, buName, buTel, buAddr " 
					+ " FROM tbl_buyer " 
					+ " ORDER BY buName ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, id);
			ResultSet result = pStr.executeQuery();
			if (result.next()) return result3Dto(result);
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 상품 코드를 찾을 메서드
	@Override
	public ProductDto findPdCode(String code) {
		String sql = " SELECT pCode, pName, pItem, pIPrice, pOPrice " 
					+ " FROM tbl_product " 
					+ " ORDER BY pCode ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, code);
			ResultSet result = pStr.executeQuery();
			if (result.next()) return result2Dto(result);
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
