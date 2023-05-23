package com.callor.bank.service;

import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.inpl.BuyerServiceImplV1;

public class BankService {
	
	protected final Scanner scan;

	protected List<BuyerDto> buyerList;
	protected final BuyerService buyerService;
	
	public BankService() {
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
		
		for(BuyerDto buyerDto : buyerList ) {
			
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
		if(buyerDto == null ) {
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
		if(buyerDto == null) {
			System.out.printf("%s 고객 ID 는 없는 정보 입니다", strBuId);
		} else {
			System.out.println(buyerDto.toString());
			System.out.println("고객 정보를 정말 삭제 하시 겠습니까? (YES / NO )");
			String yesNo = scan.nextLine();
			if(yesNo.equals("YES")) {
				int result = buyerService.delete(strBuId);
				if(result > 0) {
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
		
		while(true) {
			System.out.println("수정할 고객 ID 를 입력 하시오 ");
			String strBuId = scan.nextLine();
			BuyerDto buyerDto = buyerService.findById(strBuId);
			if(buyerDto == null ) {
				System.out.printf("%, 고객 정보가 없습니다",strBuId);
				continue;
			}
			System.out.println(buyerDto.toString());
			System.out.printf("고객 ID : %s ", buyerDto.buId);
			
			System.out.printf("고객 이름(%s)",  buyerDto.buName);
			String strBuName = scan.nextLine();
			if(!strBuName.equals("")) buyerDto.buName = strBuName;
			
			System.out.printf("전화번호(%s)",  buyerDto.buTel);
			String strBuTel = scan.nextLine();
			if(!strBuTel.equals("")) buyerDto.buTel = strBuTel;
			
			int result = buyerService.update(buyerDto);
			if(result > 0) System.out.println("변경 성공");
			else System.out.println("변경 실패 ");
			break;
		}
	}
}


