package com.callor.bank.service;

import java.util.List;

import com.callor.bank.models.BuyerDto;

public interface BuyerService {

	// 전체 List 를 조회하는 메서드 
	public List<BuyerDto> selectAll();
	
	// PK 를 기준으로 1개 데이터를 조회하는 메서드 
	public BuyerDto findById(String id);
	
	// 1개의 데이터를 DB에 추가하는 메서드 
	public int insert(BuyerDto dto);
	
	// 데이터를 수정(update)하는 메서드
	public int update(BuyerDto dto);
	
	// PK 를 전달 받아 1개의 데이터를 삭제(delete)하는 메서드 
	public int delete(String id);
	
	
}
