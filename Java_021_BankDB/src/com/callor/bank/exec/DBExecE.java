package com.callor.bank.exec;

import java.util.Scanner;

import com.callor.bank.config.BankInfo;
import com.callor.bank.service.BankService;
import com.callor.bank.utils.Line;

public class DBExecE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService bankService = new BankService();
		while(true) {
			BankInfo.headerPrint();
			System.out.println("수행할 업무를 선택하세요");
			System.out.println("  1. 고객 추가 ");
			System.out.println("  2. 고객 정보 수정 ");
			System.out.println("  3. 고객 정보 삭제 ");
			System.out.println("  4. 고객 리스트 ");
			System.out.println("  5. 고객 정보(계좌) 조회 ");
			System.out.println("  6. 고객 계좌 개설 ");
			System.out.println("  9. 업무 종료");
			System.out.println(Line.sLine(100));
			System.out.print("업무 선택 >> ");
			String strSelet = scan.nextLine();
			
			int intSelet = 0;
			try {
				intSelet = Integer.valueOf(strSelet);
			} catch (Exception e) {
				System.out.printf("업무 선택을 잘못 하였습니다(%s)\n",strSelet);
				continue;
			}
			if(intSelet == 9 ) break;
			else if(intSelet == 1) bankService.insertBuyer();
			else if(intSelet == 2) bankService.update();
			else if(intSelet == 3) bankService.delete();
			else if(intSelet == 4) bankService.printBuyerList();
			else if(intSelet == 5) bankService.findUserInfo();
			else if(intSelet == 6) bankService.makeAcount();
		}
		System.out.println("업무 종료");
	}
}
