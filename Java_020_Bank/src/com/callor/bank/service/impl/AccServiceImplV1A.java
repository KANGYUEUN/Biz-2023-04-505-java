package com.callor.bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.AnsiConsol;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Line;

public class AccServiceImplV1A implements AccService {

	protected Scanner scan;
	protected BuyerService buyerService;
	protected List<AccDto> accList;

	public AccServiceImplV1A() {
		accList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	// 새로운 계좌번호를 자동으로 생성하기 
	/*
	 * < 계좌번호 format >
	 * 1000-2023-05-18-0001
	 * 
	 * "1000" : 은행코드
	 * "2023-05-15" : 계좌를 신설한 날짜 
	 * "0001" : 일련번호 
	 */
	protected String getNewAccNum() {
		
		// 컴퓨터의 현재 시각을 get 하는 클래스 
		// 'System.currentTimeMillis() method'
		// 		1970.1.1 00:00.00.000 부터 시작하여
		// 		현재 시점까지 카운트 된 밀리세턴드 값
		// 이값을 Date 클래스의 생성자에 전달하면
		// 현재날짜, 시각 정보를 알수 있는 객체로 생성해준다.
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);
		
		int maxNum = 0;
		String numBank = "1000";
		for(AccDto accDto : accList ) {
			// 1000-2023-05-18-0001
			// 1000-2023-05-18-0002
			// 1000-2023-05-18-0003
			// 1000-2023-05-18-0004
			// 1000-2023-05-18-0005
			
			String accNum = accDto.acNum;
			
			// 처음의 4글자를 잘라서 코드 추출하기
			numBank = accNum.substring(0,4);
			
			// 날짜 부분 추출 하기 
			String numDate = accNum.substring(5,todayString.length());
			
			if(numDate.equals(todayString)) {
				// 일련번호 부분만 추출하기
				String lastNum = accNum.substring(numBank.length() + todayString.length());
				int intNum = Integer.valueOf(lastNum);
				if(intNum > maxNum) maxNum = intNum;
				
			}
		}// end for
		
		// maxNum 은 0 or 5
		String newNum = String.format("%s-%s-%04d", numBank,todayString, maxNum + 1);
		
		return newNum;
	}
	/*
	 * < 신규 계좌 등록하기 > 
	 * 1. 고객번호를 입력받고, 고객번호가 고객정보에 있는지 확인
	 * 		BuyerServiceImplV1A.getBuyer() method 를 사용하여 
	 * 		고객 정보 찾기 없으면 '고객정보 등록하세요 '메세지 표현
	 * 2. 고객번호가 있으면 신규계좌를 생성한다. : List<AccDto> type accList 에 추가 하기
	 */
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		Config.bankTitle("계좌생성");

		while (true) {
			String accNum = getNewAccNum();
			System.out.println(Line.sLine(100));
			System.out.println("생성된 계좌번호 : " + accNum);
			System.out.println(Line.sLine(100));
			
			String strBuId = "";
			while (true) {
				System.out.println("고객 ID를 입력 하세요  ");
				System.out.println("고객 ID >> ");
				strBuId = scan.nextLine();

				if (strBuId.equals("QUIT")) break;
				try {
					int intBuId = Integer.valueOf(strBuId);
					strBuId = String.format("%04d", intBuId);

					BuyerDto buyerDto = buyerService.getBuyer(strBuId);
					if (buyerDto == null) {
						System.out.println(AnsiConsol.RED("고객 정보가 없습니다"));
						System.out.println("고객 정보를 먼저 등록해 주세요");

					} else {
						System.out.println(Line.sLine(100));
						System.out.println(buyerDto.toString());
						System.out.println(Line.sLine(100));
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("고객 ID 는 정수로만 입력하세요 ");
				}

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
