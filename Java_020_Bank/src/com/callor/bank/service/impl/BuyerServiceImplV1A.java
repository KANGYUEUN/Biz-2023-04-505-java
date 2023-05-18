package com.callor.bank.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Index;
import com.callor.bank.utils.Line;

public class BuyerServiceImplV1A implements BuyerService {

	protected Scanner scan;
	protected List<BuyerDto> buyerList;

	public BuyerServiceImplV1A() {
		buyerList = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	@Override
	public void loadBuyer() {
		
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(Config.BUYER_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] buyer = line.split("\t"); // BuyerExecB
			
			BuyerDto dto = new BuyerDto();
			dto.buid = buyer[Index.BUYER.BU_ID];
			dto.buName = buyer[Index.BUYER.BU_NAME];
			dto.buTel = buyer[Index.BUYER.BU_TEL];
			dto.buAddr = buyer[Index.BUYER.BU_ADDR];
			dto.buBirth = buyer[Index.BUYER.BU_BIRTH];
			dto.buJob = buyer[Index.BUYER.BU_JOB];
			buyerList.add(dto);
			
		}
		scan.close();

	}
	// 고객 Id 를 전달받아 
	@Override
	public BuyerDto getBuyer(String buId) {
		
		if(buyerList.isEmpty()) {
			loadBuyer();
		}
		for(BuyerDto dto : buyerList ) {
			if(dto.buid.equals(buId)) {
				return dto;
			}
		}
		
		return null;
	}

	/*
	 * 현재 buyerList 에 저장된 요소들을 탐색하여 
	 * 고객 ID 가 가장 큰 값을 갖는 요소들을 찾아서 고객 아이디 + 1 의 값을 리턴
	 */
	protected int getMaxId() {

		int maxId = 0;
		for (BuyerDto dto : buyerList) {
			int intId = Integer.valueOf(dto.buid);
			if (intId > maxId)
				maxId = intId; // 리스트 중에 가장 큰값을 가지게 된다
		}
		return maxId + 1; // ID 중 가장 큰값 + 1 리턴
	}

	protected BuyerDto buyerItemInput() {
		// null 값으로 임시 clear
		BuyerDto buDto = null;

		String buid = "";
		// 특정값을 반복하기 위한 while
		while (true) {
			System.out.printf("고객 ID(%04d) >> ", getMaxId());
			buid = scan.nextLine();

			// Q 처럼 단독 알파벳을 씀 좋을듯?
			// 입력하는 도중 알파벳은 실수로 눌릴 수 있기 때문에 문자로 입력
			// QUIT 는 상대적으로 실수 빈도가낮기 때문에 고집
			if (buid.equals("QUIT"))
				return null;
			if (buid.equals(""))
				buid = String.format("%04d", getMaxId());
			try {
				int intBuId = Integer.valueOf(buid);
				buid = String.format("%04d", intBuId);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("고객 ID 는 정수로만 입력하세요");

			}
			// 여기까지 buDto = null 인 상태
			for (BuyerDto dto : buyerList) {
				// 고객 ID 에 해당하는 정보가 있으면
				// 이때부터 buDto 는 null 형태가 아니고
				// 입력한 고객 ID 의 데이터 주소를 갖는 상태.
				if (dto.buid.equals(buid)) {
					buDto = dto; break;
				}
			}
			break;
		}
		
		System.out.printf("고객 이름(%s) >> ", buDto == null ? "신규" : buDto.buName);
		String buName = scan.nextLine();
		if (buName.equals("QUIT")) return null;
		if (buName.equals("")) buName = buDto.buName;

		System.out.printf("고객 전화번호(%s) >> ", buDto == null ? "신규" : buDto.buTel);
		String buTel = scan.nextLine();
		if (buTel.equals("QUIT")) return null;
		if (buTel.equals("")) buName = buDto.buTel;

		System.out.printf("고객 주소(%s) >> ", buDto == null ? "신규" : buDto.buAddr);
		String buAddr = scan.nextLine();
		if (buAddr.equals("QUIT")) return null;
		if (buAddr.equals("")) buName = buDto.buAddr;

		System.out.printf("고객 생년월일(%s) >> ", buDto == null ? "신규" : buDto.buBirth);
		String buBirth = scan.nextLine();
		if (buBirth.equals("QUIT"))	return null;
		if (buBirth.equals("")) buName = buDto.buBirth;

		System.out.printf("고객 직업(%s) >> ", buDto == null ? "신규" : buDto.buJob);
		String buJob = scan.nextLine();
		if (buJob.equals("QUIT")) return null;
		if (buJob.equals("")) buName = buDto.buJob;

		if (buDto == null)
			buDto = new BuyerDto();
		buDto.buid = buid;
		buDto.buName = buName;
		buDto.buTel = buTel;
		buDto.buAddr = buAddr;
		buDto.buBirth = buBirth;
		buDto.buJob = buJob;
		return buDto;
	}

	@Override
	public void inputBuyer() {

		BuyerDto byDto = new BuyerDto();
		// 전체적인 입력 반복을 위한 반복문
		while (true) {
			System.out.println(Line.dLine(100));
			System.out.println("고객정보 관리");
			System.out.println(Line.sLine(100));

			BuyerDto buDto = buyerItemInput();
			if (buDto == null)
				break;
			/*
			 * buyerLsit 데이터를 추가 또는 수정 
			 * buyerList 데이터에 buDto 요소가 없으면 add() 추가 있으면 무시.
			 * 
			 * " 주소에 대한 개념으로 이해해 보기 "
			 * 
			 * < List type 객체의 contains method > 
			 * List type 객체의 요소중에 buDto 변수에 담긴 주소를 가진 요소가
			 * 있냐 없으면 더해라
			 * 
			 */
			if (!buyerList.contains(byDto))
				buyerList.add(buDto);
		}
		System.out.println("고객정보 입력 종료 !");

		OutputStream os = null;
		PrintWriter out = null;

		try {
			os = new FileOutputStream(Config.BUYER_FILE);
			out = new PrintWriter(os);

			printBuyerList(out);
			out.close();

			for (BuyerDto dto : buyerList) {
				out.printf("%s,", dto.buid);
				out.printf("%s,", dto.buName);
				out.printf("%s,", dto.buTel);
				out.printf("%s,", dto.buAddr);
				out.printf("%s,", dto.buBirth);
				out.printf("%s,", dto.buJob);

			}
			out.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 화면출력을 위하여 리스트 머릿글 부분을 System.out.println() 으로 출력하고
	 * System.out 이 연결된 printWiter 를 화면용으로 생성하여
	 * printBuyerList(PrintWriter) method 에 전달하여 본문 출력
	 */
	public void printBuyerList() {
		OutputStream os = System.out;
		PrintWriter out = new PrintWriter(os);
		System.out.println(Line.dLine(100));
		System.out.println("고객정보 리스트");
		System.out.println(Line.sLine(100));
		System.out.println("고객ID\t고객명\t전화번호\t주소\t생년월일\t직업");

		printBuyerList(out);
		out.close();
		System.out.println(Line.dLine(100));
	}
	/*
	 * 매개변수로 전달 받는 'printWriter' 객체의 구분에 따라 
	 * 화면에 출력하거나 파일로 출력하기
	 */
	@Override
	public void printBuyerList(PrintWriter out) {

		for (BuyerDto dto : buyerList) {
			out.printf("%s\t", dto.buid);
			out.printf("%s\t", dto.buName);
			out.printf("%s\t", dto.buTel);
			out.printf("%s\t", dto.buAddr);
			out.printf("%s\t", dto.buBirth);
			out.printf("%s\n", dto.buJob);
		}
		System.out.println(Line.dLine(100));

	}
}
