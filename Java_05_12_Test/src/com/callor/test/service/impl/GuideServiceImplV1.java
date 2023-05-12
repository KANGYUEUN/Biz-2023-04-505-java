package com.callor.test.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.test.config.DataIndex;
import com.callor.test.config.Utils;
import com.callor.test.models.GuideDto;
import com.callor.test.service.GuideService;

public class GuideServiceImplV1 implements GuideService {

	List<GuideDto> guideList;

	GuideServiceImplV1() {
		guideList = new ArrayList<>();
	}

	@Override
	public void loadGuide() {

		String guideFile = "src/com/callor/test/data/guide정보.txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(guideFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");

			GuideDto gdDto = new GuideDto();
			gdDto.setGdId(guide[DataIndex.GUIDE.ID]);
			gdDto.setGdList(guide[DataIndex.GUIDE.LIST]);
			gdDto.setGdSeq(guide[DataIndex.GUIDE.SEQ]);
			gdDto.setGdGuid(guide[DataIndex.GUIDE.GUIDE]);

			guideList.add(gdDto);
		}
		scan.close();
	}

	@Override
	public void printGuide() {
		// id,종목명,순번,가이드
		String[] printTitle = "id,종목명,순번,가이드".split(",");

		System.out.println(Utils.dLine(100));

		System.out.printf("%-5s\t", printTitle[DataIndex.GUIDE.ID]);
		System.out.printf("%-15s\t", printTitle[DataIndex.GUIDE.LIST]);
		System.out.printf("%-5s\t", printTitle[DataIndex.GUIDE.SEQ]);
		System.out.printf("%s\n", printTitle[DataIndex.GUIDE.GUIDE]);

		System.out.println(Utils.sLine(100));

		for (GuideDto guide : guideList) {

			System.out.printf("%s\t", guide.getGdId());
			System.out.printf("%s\t", guide.getGdList());
			System.out.printf("%s\t", guide.getGdSeq());
			System.out.printf("%s\n", guide.getGdGuid());
		}
		System.out.println(Utils.dLine(100));
	}

	@Override
	public GuideDto getGuide(String guide) {
		if (guideList.isEmpty()) {
			this.loadGuide();
		}
		for (GuideDto dto : guideList) {
			if (dto.getGdId().equals(guide)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<GuideDto> getGdList() {
		if(guideList.isEmpty()) {
			this.loadGuide();
		}
		return guideList;
	}
}
