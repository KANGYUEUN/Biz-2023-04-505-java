package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.models.BookDto;
import com.callor.books.service.BookService;

public class BookServiceImplV2 implements BookService {

	protected List<BookDto> bkList; // 생성

	public BookServiceImplV2() {
		bkList = new ArrayList<>(); // 초기화
	}

	// 도서정보.txt 파일을 읽어와서
	// List<BookDto> type 리스트로 변환하기
	@Override
	public void loadBook() {

		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11) .txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");

			BookDto bkDto = new BookDto();
			bkDto.setbIsbn(book[DataIndex.BOOK.ISBN]);
			bkDto.setbTitle(book[DataIndex.BOOK.TITLE]);
			bkDto.setbPublisher(book[DataIndex.BOOK.PUBLISHER]);
			bkDto.setbAuthor(book[DataIndex.BOOK.AUTHOR]);
			bkDto.setbPublishData(book[DataIndex.BOOK.PUBLISHER]);
			bkDto.setbPages(Integer.valueOf(book[DataIndex.BOOK.PAGES]));

			// 문서에 빈칸(스페이스바)이 있어서 문제가 발생했음
			// " 1000 " : Integer.valueOf(" 1000 ");
			// 이러한 입셉션 상황에서 문자열 앞뒤 빈칸 제거 : 문자열변수.trim();
			String strPrice = book[DataIndex.BOOK.PRICE].trim();

			bkDto.setbPrice(Integer.valueOf(strPrice));
			bkList.add(bkDto);

		}
		scan.close();
	}

	@Override
	public void printBookList() {

		String[] printTitle = "ISBN,도서명,출판사,저자,출판일,페이지,가격".split(",");
		
		System.out.println(Utils.dLine(100));

		System.out.printf("%-13s\t",printTitle[DataIndex.BOOK.ISBN]); // - : 왼쪽 정렬
		System.out.printf("%-20s\t\t",printTitle[DataIndex.BOOK.TITLE]);
		System.out.printf("%s\t",printTitle[DataIndex.BOOK.PUBLISHER]);
		System.out.printf("%s\t",printTitle[DataIndex.BOOK.AUTHOR]);
		System.out.printf("%s\t",printTitle[DataIndex.BOOK.PDATE]);
		System.out.printf("%s\t\t",printTitle[DataIndex.BOOK.PAGES]);
		System.out.printf("%s\n",printTitle[DataIndex.BOOK.PRICE]);
		
		System.out.println(Utils.sLine(100));

		for (BookDto book : bkList) {

			System.out.printf("%s\t", book.getbIsbn());
			String bTitle = book.getbTitle();

			if (bTitle.length() > 10) {
				System.out.printf("%-20s\t", bTitle.substring(0, 10));
			} else {
				System.out.printf("%-20s\t", bTitle);
			}

			System.out.printf("%s\t", book.getbPublisher());
			System.out.printf("%s\t", book.getbAuthor());
			System.out.printf("%s\t", book.getbPublishData());
			System.out.printf("%d\t", book.getbPages());
			System.out.printf("%d\n", book.getbPrice());
		}
		System.out.println(Utils.sLine(100));
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
