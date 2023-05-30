package com.callor.shop.service;

import java.util.List;

import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.ProductDto;

public interface ShopingCartService {
	
	// < 상품관리 >
	// 상품 전체 데이터를 조회하여 List 타입으로 리턴
	public List<ProductDto> selectAllP();
	// 상품정보 등록 및 수정
	public int insert(ProductDto dto);
	public int update(ProductDto dto);
	
	// < 고객관리 >
	// 고객 전체 데이터를 조회하여 List 타입으로 리턴
	public List<BuyerDto> selectAllB();
	// 고객정보 등록 및 수정 
	public int insert(BuyerDto dto);
	public int update(BuyerDto dto);
	
	// < 거래등록 >
	// 고객ID 조회 기능 (리스트 보여주기 )
	public BuyerDto findById(String id);
	// 상품코드 조회 기능 
	public ProductDto findPdCode(String code);
	
	
	
}
