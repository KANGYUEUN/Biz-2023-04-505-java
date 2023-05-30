package com.callor.shop.service;

import java.util.List;
import java.util.Scanner;

import com.callor.shop.config.ShopInfo;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.ProductDto;
import com.callor.shop.service.Impl.ShopingCartServiceImplV1;
import com.callor.shop.utils.Line;

public class ShopingService {

	protected final Scanner scan;
	protected List<ProductDto> pdList;
	protected final ShopingCartService shopingCartService;
	protected List<BuyerDto> byList;

	public ShopingService() {
		shopingCartService = new ShopingCartServiceImplV1();
		scan = new Scanner(System.in);
	}

	public void printPromtMemu() {
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
		System.out.println("QUIT : 종료");
		System.out.println(Line.dLine(100));
	}

	// 상품관리 메뉴 1번 선택시
	public void printProductList() {
		ShopInfo.headerPrint();
		pdList = shopingCartService.selectAllP();
		System.out.println("상품리스트를 출력합니다.");
		System.out.println(Line.sLine(80));
		System.out.println("상품Code\t상품명\t\t품목\t매입단가\t매출단가");
		System.out.println(Line.sLine(80));
		for (ProductDto pdDto : pdList) {
			System.out.printf("%s\t", pdDto.pCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", pdDto.pItem);
			System.out.printf("%s\t\t", pdDto.pIPrice);
			System.out.printf("%s\n", pdDto.pOPrice);
		}
		System.out.println(Line.dLine(100));
	}

	// 2번 선택시
	public void updateProduct() {
		ShopInfo.headerPrint();
		System.out.println("상품정보 등록 및 수정을 시작합니다.");
		System.out.println(Line.sLine(80));
		System.out.print("상품Code(13자리) >> ");
		String strPCode = scan.nextLine();

		ProductDto pdDto = shopingCartService.findPdCode(strPCode);
		if (pdDto.pCode.equals(strPCode)) {
			System.out.println("기존의 상품을 수정합니다.");
		} else {
			System.out.println(pdDto.toString());
		}
	}

	// 3번 선택시
	public void printBuyerList() {
		byList = shopingCartService.selectAllB();
		System.out.println("고객정보를 출력합니다.");
		System.out.println(Line.sLine(80));
		System.out.println("고객ID\t고객이름\t전화번호\t\t주소");
		System.out.println(Line.sLine(80));
		for (BuyerDto byDto : byList) {
			System.out.printf("%s\t", byDto.buId);
			System.out.printf("%s\t", byDto.buName);
			System.out.printf("%s\t", byDto.buTel);
			System.out.printf("%s\n", byDto.buAddr);
		}
	}

	// 4번 선택시
	public void updateBuyer() {
		ShopInfo.headerPrint();
		BuyerDto byDto = new BuyerDto();
		System.out.println("신규 고객 정보를 추가 합니다. ");
		String rndId = "";
		
		while(true) {
			System.out.print("고객 ID를 입력하세요 >> ");
			rndId = scan.nextLine();
			try {
				int intRndId = Integer.valueOf(rndId);
				rndId = String.format("%09d", intRndId);
			} catch (Exception e) {
				System.out.println("고객 ID 는 10자리 입니다.");
			}
			for(BuyerDto dto : byList) {
				if(dto.buId.equals(rndId)) {
					byDto = dto; break;
				}
			}
			if( rndId == null) {
				System.out.printf(" 고객 ID를 입력하세요 ");
			}
		}
	}

	// 5번 선택시
	public void shoppingBasket() {

	}

	// 6번 선택시
	public void shoppingBasketBuyer() {

	}

	// 7번 선택시
	public void shoppingBasketList() {

	}
}
