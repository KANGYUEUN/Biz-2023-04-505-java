package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.models.PublisherDto;
import com.callor.books.service.PublisherService;

public class PublisherServiceImplV1 implements PublisherService {

	List<PublisherDto> pubList;

	public PublisherServiceImplV1() {
		pubList = new ArrayList<>();
	}

	@Override
	public void loadPublisher() {

		String pubFile = "src/com/callor/books/data/출판사정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(pubFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] publisher = line.split(",");
			PublisherDto pubDto = new PublisherDto();
			pubDto.setPubCode(publisher[DataIndex.PUBLISER.COED]);
			pubDto.setPubName(publisher[DataIndex.PUBLISER.NAME]);
			pubDto.setPubCeo(publisher[DataIndex.PUBLISER.CEO]);
			pubDto.setPubTel(publisher[DataIndex.PUBLISER.TEL]);
			pubDto.setPubAddress(publisher[DataIndex.PUBLISER.ADDRESS]);

			pubList.add(pubDto);
		}
		scan.close();
	}

	@Override
	public void printPublisher() {

		String[] printTitle = "출판사코드,출판사명,대표,전화번호,주소".split(",");

		System.out.println(Utils.dLine(100));

		System.out.printf("%-5s\t", printTitle[DataIndex.PUBLISER.COED]); // - : 왼쪽 정렬
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISER.NAME]);
		System.out.printf("%-5s\t", printTitle[DataIndex.PUBLISER.CEO]);
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISER.TEL]);
		System.out.printf("%s\n", printTitle[DataIndex.PUBLISER.ADDRESS]);

		System.out.println(Utils.sLine(100));

		for (PublisherDto publisher : pubList) {

			// System.out.printf("%s\t",publisher.getPubCode());
			String bTitle = publisher.getPubCode();

			System.out.printf("%s\t\t", publisher.getPubCode());
			System.out.printf("%-11s\t", publisher.getPubName());
			System.out.printf("%s\t", publisher.getPubCeo());
			System.out.printf("%s\t", publisher.getPubTel());
			System.out.printf("%s\n", publisher.getPubAddress());
		}
		System.out.println(Utils.sLine(100));
		System.out.println(Utils.dLine(100));
	}

	@Override
	public PublisherDto getPublisher(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PublisherDto> getPublisherList() {
		if (pubList.isEmpty()) {
			this.loadPublisher();
		}
		return pubList;
	}

	@Override
	public List<PublisherDto> getPublisherListByName(String name) {

		List<PublisherDto> findList = new ArrayList<>();

		for (PublisherDto pubDto : pubList) {
			String pubName = pubDto.getPubName();
			for (int i = 0; i < pubName.length(); i++) {
				if (pubName.substring(i, i + name.length()).equals(name)) {
					findList.add(pubDto);
				}
			}
		}
		return findList;
	}
}
