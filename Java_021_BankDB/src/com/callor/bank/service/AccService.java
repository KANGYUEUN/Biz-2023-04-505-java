package com.callor.bank.service;

import java.util.List;

import com.callor.bank.models.AccDto;

public interface AccService {
	
	// 전제 데이터를 조회하여 List<AccDto> 타입으로 리턴하기 
	public List<AccDto> selectAll();	
	
	// Id 값(보통 PK) 을 전달받아 조회를 한후 
	//  PK 로 조회를 하면 데이터는 없거나 1개이다.
	// acNum 의 type 이 String 이므로 매개변수 = String id
	public AccDto findById(String id);
	
	//고객 ID 를 전달받아 고객의 계좌정보 리스트를 return
	/*
	 * PK칼럼이 아닌 칼럼으로 SELECT를 수행 했을때
	 * 결과는 0이상이다.
	 * 만약 SELECT된 결과가 1개 뿐이라는 확신이 있더라도 
	 * 이 데이터는 ' List type ' 으로 취급한다.
	 * 
	 */
	public List<AccDto> findByBuId(String acBuId);
	
	// int형을 리턴하고 AccDto type의 매개변수를 받는 메서드
	public int insert(AccDto dto);
	public int update(AccDto dto);
	public int delete(String id);
	
	public String maxAcNum(String date);
	
}
