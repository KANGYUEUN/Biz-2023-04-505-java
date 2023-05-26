package com.callor.memo.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;
import com.callor.memo.service.MemoService;

public class MemoServiceImpl implements MemoService {
	
	// DB에 연결할 Session 요청하기
	private final SqlSession sqlSession; 
	public MemoServiceImpl() {
		sqlSession = DBConnection.getFactory().openSession(true);
	}
	
	// DBMS 에 접속하여 tbl_memo 의 데이터 전체 select 
	// List type으로 변환하여 리턴.
	@Override
	public List<MemoDto> selectAll() {
		MemoDao mmDao = sqlSession.getMapper(MemoDao.class);
		return mmDao.selectAll();
	}

	@Override
	public MemoDto findById(String id) {
		String sql = " SELECT " 
				+ " m_seq, m_writer, m_date, m_subject, m_content " 
				+ " FROM tbl_memo " 
				+ " WHERE m_seq = ? ";
		
		
		
		
		
		
		
		
		return null;
	}

	@Override
	public int insert(MemoDto dto) {
		String sql = " INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content "
				+  " VALUES(?,?,?,?,?) ";
		
		
		
		
		return 0;
	}

	@Override
	public int update(MemoDto dto) {
		String sql = " UPDATE tbl_memo "
				+ " SET m_seq = ?, "
				+ " m_writer = ?, "
				+ " m_date = ?, "
				+ " WHERE acNum = ? ";
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
