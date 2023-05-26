package com.callor.memo.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.memo.models.MemoDto;
import com.callor.memo.service.MemoService;
import com.callor.memo.utils.Line;

public class MemoServiceImplV1 extends MemoServiceImpl {
	
	protected final Scanner scan;
	protected List<MemoDto> mmList;
	protected final MemoService memoService;
	
	public MemoServiceImplV1() {
		memoService = new MemoServiceImpl();
		scan = new Scanner(System.in);
	}
	
	public void printMemoList( ) {
		mmList = memoService.selectAll();
		System.out.println(Line.dLine(100));
		System.out.println("새로운 메모 입력을 시작합니다.");
		System.out.println(Line.dLine(100));
		
		
	}
	
	
	

}
