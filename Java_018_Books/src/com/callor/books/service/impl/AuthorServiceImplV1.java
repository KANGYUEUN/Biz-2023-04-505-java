package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.models.AuthorDto;
import com.callor.books.service.AuthorService;

public class AuthorServiceImplV1 implements AuthorService {

	List<AuthorDto> atList;

	public AuthorServiceImplV1() {
		atList = new ArrayList<>();
	}

	@Override
	public void loadAuthor() {

		String atFile = "src/com/callor/books/data/저자정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(atFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] author = line.split(",");

			AuthorDto atDto = new AuthorDto();
			atDto.setAuCode(author[DataIndex.AUTHOR.COED]);
			atDto.setAuName(author[DataIndex.AUTHOR.NAME]);
			atDto.setAuTel(author[DataIndex.AUTHOR.TEL]);
			atDto.setAuAddress(author[DataIndex.AUTHOR.ADDRESS]);

			atList.add(atDto);
		}
		scan.close();
	}

	@Override
	public void printAuthorList() {
		// 저자코드,저자명,전화번호,주소
		String[] printTitle = "저자코드,저자명,전화번호,주소".split(",");

		System.out.println(Utils.dLine(100));

		System.out.printf("%-5s\t", printTitle[DataIndex.AUTHOR.COED]);
		System.out.printf("%-3s\t", printTitle[DataIndex.AUTHOR.NAME]);
		System.out.printf("%-13s\t", printTitle[DataIndex.AUTHOR.TEL]);
		System.out.printf("%s\n", printTitle[DataIndex.AUTHOR.ADDRESS]);

		System.out.println(Utils.sLine(100));

		for (AuthorDto author : atList) {

			System.out.printf("%s\t", author.getAuCode());
			System.out.printf("%s\t", author.getAuName());
			System.out.printf("%s\t", author.getAuTel());
			System.out.printf("%s\n", author.getAuAddress());
		}
		System.out.println(Utils.sLine(100));
	}

	@Override
	public AuthorDto getAuthor(String author) {

		for(AuthorDto dto : atList) {
			if(dto.getAuCode().equals(author)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		// TODO Auto-generated method stub
		return atList;
	}

}
