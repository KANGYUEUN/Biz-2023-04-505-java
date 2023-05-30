package com.callor.shop.execs;

import java.util.Scanner;
import com.callor.shop.config.ShopInfo;
import com.callor.shop.service.ShopingService;
import com.callor.shop.utils.Line;

public class ExecA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShopingService shopService = new ShopingService();
		
		while(true) {
			ShopInfo.headerPrint();
			System.out.println("상품관리");
			System.out.println(Line.sLine(50));
			System.out.println("\t 1. 상품리스트");
			System.out.println("\t 2. 상품등록 및 수정 ");
			System.out.println(Line.sLine(50));
			System.out.println("고객관리");
			System.out.println(Line.sLine(50));
			System.out.println("\t 3. 고객리스트");
			System.out.println("\t 4. 고객등록 및 수정 ");
			System.out.println(Line.sLine(50));
			System.out.println("상품판매");
			System.out.println(Line.sLine(50));
			System.out.println("\t 5. 장바구니 상품 담기");
			System.out.println("\t 6. 구매자별 장바구니 리스트 보기");
			System.out.println("\t 7. 장바구니 전체 리스트 보기 ");
			System.out.println(Line.sLine(50));
			System.out.println("\t\t QUIT or 0 : 종료");
			System.out.println(Line.dLine(100));
			System.out.print("선택 >> ");
			String strSelet = scan.nextLine();
			
			int intSelet = 0;
			while (true) {
				try {
					intSelet = Integer.valueOf(strSelet);
				} catch (Exception e) {
					System.out.printf("업무 선택은 QUIT(끝내기),"
							+ "1 ~ 7정수만 입력할 수 있습니다(%s)\n",strSelet);
					continue;
				}
				if (intSelet < 1 || intSelet > 7) {
					System.out.printf("업무 선택은 1 ~ 7 중에서 선택하세요");
					continue;
				} else if (strSelet == "QUIT") {
					System.out.println("QUIT 입력, 업무를 종료 합니다.");
				}
				break;
			}
			
			if(intSelet == 0 ) break;
			else if(intSelet == 1) shopService.printProductList();
			else if(intSelet == 2) shopService.updateProduct();
			else if(intSelet == 3) shopService.printBuyerList();
			else if(intSelet == 4) shopService.updateBuyer();
			else if(intSelet == 5) shopService.shoppingBasket();
			else if(intSelet == 6) shopService.shoppingBasketBuyer();
			else if(intSelet == 7) shopService.shoppingBasketList();
		}
		System.out.println(" ShopingCartService 종료");
	}
}