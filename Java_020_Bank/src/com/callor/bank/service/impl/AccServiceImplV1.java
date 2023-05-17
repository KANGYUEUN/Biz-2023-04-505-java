package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;
import com.callor.bank.utils.Line;

public class AccServiceImplV1 implements AccService{

	protected Scanner scan;
	protected List<AccDto> accList;
	public AccServiceImplV1() {
		accList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inout() {
		
		AccDto acDto = new AccDto();
		while (true) {
			System.out.println(Line.dLine(100));
			System.out.println("입출금 등록을 실행 합니다");
			System.out.println(Line.sLine(100));
			
			String buId = "";
			while(true) {
				
			}
			
			
			System.out.println("계좌번호를 입력 하세요 >> ");
			String accNum = scan.nextLine();
			System.out.println("1. 입금 ");
			System.out.println("2. 출금 ");
			
			
		}
		
		
		
		
		
		
		
		
	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
