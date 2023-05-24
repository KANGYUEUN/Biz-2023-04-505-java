package com.callor.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.config.BankInfo;
import com.callor.bank.config.DBContract;
import com.callor.bank.models.AccDto;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.inpl.AccServiceImplV1;
import com.callor.bank.service.inpl.BuyerServiceImplV1;
import com.callor.bank.utils.Line;

public class BankService {

	protected final Scanner scan;

	protected List<BuyerDto> buyerList;
	protected final BuyerService buyerService;
	protected final AccService accService;

	public BankService() {
		accService = new AccServiceImplV1();
		buyerService = new BuyerServiceImplV1();
		scan = new Scanner(System.in);
	}

	public void printBuyerList() {

		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("대한은행 고객 리스트");
		System.out.println("=".repeat(100));
		System.out.println("ID\t이름\t전화번호\t주소\t생년월일\t\t직업");
		System.out.println("-".repeat(100));

		for (BuyerDto buyerDto : buyerList) {
			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", buyerDto.buAddr);
			System.out.printf("%s\t", buyerDto.buBirth);
			System.out.printf("%s\n", buyerDto.buJob);
		}
		System.out.println("=".repeat(100));
	}

	public void findByBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("조회 하고자 하는 고객 ID 입력");
		System.out.print("ID >> ");
		String strId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strId);
		if (buyerDto == null) {
			System.out.println("조회한 고객 ID 는 없는 데이터 이다 ");
		} else {
			System.out.println(buyerDto.toString());
		}

	}
	public void insertBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("고객정보 등록");
		System.out.println("=".repeat(100));

		System.out.print("고객 ID >> ");
		String strBuId = scan.nextLine();

		System.out.print("고객 이름 >> ");
		String strBuName = scan.nextLine();

		System.out.print("전화번호 >> ");
		String strBuTel = scan.nextLine();

		BuyerDto buyerDto = new BuyerDto();
		buyerDto.buId = strBuId;
		buyerDto.buName = strBuName;
		buyerDto.buTel = strBuTel;

		buyerService.insert(buyerDto);
	}

	public void delete() {
		System.out.println("=".repeat(100));
		System.out.println("삭제할 고객 ID 입력하시오");
		System.out.println("삭제할 고객 ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);
		if (buyerDto == null) {
			System.out.printf("%s 고객 ID 는 없는 정보 입니다", strBuId);
		} else {
			System.out.println(buyerDto.toString());
			System.out.println("고객 정보를 정말 삭제 하시 겠습니까? (YES / NO )");
			String yesNo = scan.nextLine();
			if (yesNo.equals("YES")) {
				int result = buyerService.delete(strBuId);
				if (result > 0) {
					System.out.println("고객 정보 삭제 완료");
				} else {
					System.out.println("고객 정보 삭제 실패");
				}
			} else {
				System.out.println("삭제 취소 ");
			}
		}
	}

	public void update() {
		while (true) {
			System.out.println("수정할 고객 ID 를 입력 하시오 ");
			String strBuId = scan.nextLine();
			BuyerDto buyerDto = buyerService.findById(strBuId);
			if (buyerDto == null) {
				System.out.printf("%, 고객 정보가 없습니다", strBuId);
				continue;
			}
			System.out.println(buyerDto.toString());
			System.out.printf("고객 ID : %s ", buyerDto.buId);
			System.out.printf("고객 이름(%s)", buyerDto.buName);
			String strBuName = scan.nextLine();
			if (!strBuName.equals(""))buyerDto.buName = strBuName;

			System.out.printf("전화번호(%s)", buyerDto.buTel);
			String strBuTel = scan.nextLine();
			if (!strBuTel.equals(""))buyerDto.buTel = strBuTel;

			int result = buyerService.update(buyerDto);
			if (result > 0)	System.out.println("변경 성공");
			else System.out.println("변경 실패");
			break;
		}
	}

	public void findUserInfo() {
		this.printBuyerList(); // 전체 리스트 출력
		System.out.println(Line.dLine(100));
		System.out.println("조회할 고객 ID 입력하시오");
		System.out.print("조회할 고객 ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId); // 고객정보 리스트 출력

		if (buyerDto == null) { // 만약 고객정보가 없다면
			System.out.println("고객 ID 정보가 없습니다.");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.printf("고객 ID : %s\n", buyerDto.buId);
			System.out.printf("이름 : %s\n", buyerDto.buName);
			System.out.printf("고객 전화번호 : %s\n", buyerDto.buTel);
			System.out.printf("고객 주소 : %s\n", buyerDto.buAddr);
			System.out.println(Line.sLine(100));
		}

		List<AccDto> accList = accService.findByBuId(strBuId); // 계좌정보 조회
		if (accList.isEmpty()) {
			System.out.println("고객의 계좌정보가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호\t구분\t잔액");
			System.out.println(Line.sLine(100));
			for (AccDto accDto : accList) {
				System.out.printf("%s\t", accDto.acNum);

				int intDiv = 0;
				try { // 문자열 통해서 계좌정보가 무엇인지 표시
					intDiv = Integer.valueOf(accDto.acDiv);
					System.out.printf("%s\t", DBContract.ACC_DIV[intDiv - 1]);
				} catch (Exception e) {
					System.out.printf("%s\t", "종류불명");
				}
				System.out.printf("%s\n", accDto.acBalance);
			}
			System.out.println(Line.sLine(100));
		}
	}

	// 키보드를 통해 고객 ID 조회
	// 고객 ID 가 있으면 계좌 개설 시작
	// 계좌구분 : 1.입출금계좌 2.적금계좌 3.대출계좌(1~3)
	// 잔액 10000원
	// 생성된 계좌정보는 insert() method 를 구현해서 저장
	public void makeAcount() {
		/*
		 * 계좌번호 만들기 : 날짜 + 일련번호
		 * 1. 오늘날짜의 문자열을 만들어야 함
		 * 2. 계좌 리스트에 오늘 날짜에 해당하는 값이 있는지 검사하기
		 * 		있으면 일련번호를 추출하여 + 1;
		 * 		없으면 1로 설정하기 
		 */
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYYMMdd");
		
		// 오늘 날짜의 문자열을 만들기 (20230524)
		String todayString = today.format(date);
		
//		List<AccDto> accList = accService.selectAll();
//		int maxNum = 0;
//		for(AccDto accDto : accList) {
//			String tempDate = accDto.acNum.substring(0,todayString.length());
//			
//			// 오늘 날짜와 같은 데이터가 있으면 일련번호 추출 
//			if(tempDate.equals(todayString)) { 
//				String strNum = accDto.acNum.substring(todayString.length());
//				int intNum = Integer.valueOf(strNum) +1;
//				if(intNum > maxNum) maxNum = intNum;
//			}
//		}
//		// 0 이거나 최대값을 가진다
//		maxNum++;
		// 한줄의 코드로 정리하기 
		int maxNum = Integer.valueOf(accService.maxAcNum(todayString)) + 1;
		// 새로운 계좌번호 생성하기 
		String acNum = String.format("%s%02d", todayString, maxNum);
		System.out.println("계좌번호 : " + acNum);
		
		System.out.println("고객 ID 를 입력 하세요");
		System.out.print("고객 ID >> ");
		String strBuId = scan.nextLine();
		
		BuyerDto buyerDto = buyerService.findById(strBuId);
		if (buyerDto == null) {
			System.out.println("고객 정보가 없습니다");
			return;
		} else if(buyerDto.buId == strBuId) {
			System.out.println("개설할 계좌유형을 선택 하세요");
			System.out.print("1. 입출금 계좌");
			System.out.print("2. 적금 계좌");
			System.out.print("3. 대출 계좌");
			String strAcc = scan.nextLine();
			
			
		}
		
		
		
		
		
		
	}
}