package com.callor.memo.exec;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class DBExecA {

	public static void main(String[] args) {

		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
		
		MemoDao stDao = sqlSession.getMapper(MemoDao.class);

		List<MemoDto> stdList = stDao.selectAll();
		System.out.println(stdList.toString());
	}
}
