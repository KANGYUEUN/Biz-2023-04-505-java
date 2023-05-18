package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;

public class AccServiceImplV1 implements AccService{
	
	protected Scanner scan;
	protected BuyerService buyerService; // 바이어 서비스 거 사용 하기ㅜ이해
	protected List<AccDto> accList;
	
	public AccServiceImplV1() {
		accList = new ArrayList<>();
		buyerService =  new BuyerServiceImplV1A();
		 
		scan = new Scanner(System.in);
	}
	/*
	 * < 신규 계좌 등록하기 >
	 * 1. 고객번호를 입력받고, 고객번호가 고객정보에 있는지 확인	
	 * 		BuyerServiceImplV1A.getBuyer() method 를 사용하여 고객 정보 찾기
	 *     	없으면 '고객정보 등록하세요 '메세지 표현 
	 * 2. 고객번호가 있으면 신규계좌를 생성한다. 
	 * 		: List<AccDto> type accList 에 추가 하기
	 */
	
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		AccDto acDto = new AccDto();
		System.out.println("신규 계좌 등록을 시작합니다 !");
		String buId = "";
		
		while(true) {
			System.out.println("고객 ID를 입력 하세요 >> ");
			buId = scan.nextLine();
			try {
				int intBuId = Integer.valueOf(buId);
				buId = String.format("%04d", intBuId);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("고객 ID 는 정수로만 입력하세요 ");
			}
			for(AccDto dto : accList ) {
				if(dto.buId.equals(buId)) {
					acDto = dto; break;
				}
			}
			// break;
			if( buId == null) {
				System.out.println("고객 ID를 입력하세요 ");
				
				
				
			}
		}
		
		
		
		
		
		
	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub
		
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
