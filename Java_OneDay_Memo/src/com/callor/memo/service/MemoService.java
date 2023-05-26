package com.callor.memo.service;

import java.util.List;

import com.callor.memo.models.MemoDto;

public interface MemoService {

	public List<MemoDto> selectAll();
	public MemoDto findById(String id);
	//public List<MemoDto> findByBuId(String )
	
	public int insert(MemoDto dto);
	public int update(MemoDto dto);
	public int delete(String id);
	
	//public String maxAcNum(String date);
	
}
