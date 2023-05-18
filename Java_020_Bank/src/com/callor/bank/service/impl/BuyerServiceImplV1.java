package com.callor.bank.service.impl;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService {

	protected Scanner scan;
	protected List<BuyerDto> buyerList;

	public BuyerServiceImplV1() {
		buyerList = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	@Override
	public void loadBuyer() {

	}

	@Override
	public void printBuyerList() {
		// TODO Auto-generated method stub

	}

	@Override
	public BuyerDto getBuyer(String buId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inputBuyer() {

		BuyerDto byDto = new BuyerDto();
				
		// 전체적인 입력 반복을 위한 반복문
		while (true) {
			System.out.println("=".repeat(80));
			System.out.println("고객 정보를 입력 하세요");
			System.out.println("-".repeat(80));

			String buid = "";
			// 값에 대한 검증을 하기 위한 반복문
			while (true) {
				System.out.println("고객 ID >> ");
				buid = scan.nextLine();
				try {
					int intid = Integer.valueOf(buid);
					buid = String.format("%04d", intid);
				} catch (Exception e) {
					System.out.println("고객 ID는 정수로 입력 하세요 ");
					continue;
				}
				break;
			}

			for (BuyerDto dto : buyerList) {
				if (dto.buid.equals(buid)) {
					System.out.println("-".repeat(80));
					System.out.println("동일한 고객 ID 입니다 수정 하세요");
					System.out.println(dto.buid.toString());
					System.out.println("-".repeat(80));
					byDto = dto;
				}
			}

			System.out.println("고객 이름 >> ");
			String buName = scan.nextLine();
			System.out.println("고객 전화번호 >> ");
			String buTel = scan.nextLine();
			System.out.println("고객 주소 >> ");
			String buAddr = scan.nextLine();
			System.out.println("고객 생년월일 >> ");
			String buBirth = scan.nextLine();
			System.out.println("고객 직업 >> ");
			String buJob = scan.nextLine();

			byDto.buid = buid;
			byDto.buName = buName;
			byDto.buTel = buTel;
			byDto.buAddr = buAddr;
			byDto.buBirth = buBirth;
			byDto.buJob = buJob;
		}

	}

	

	@Override
	public void printBuyerList(PrintWriter out) {
		// TODO Auto-generated method stub
		
	}
}
