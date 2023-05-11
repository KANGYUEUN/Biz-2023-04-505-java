package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.models.BookDto;
import com.callor.books.service.BookService;

public class BookServiceImplV1 implements BookService {

	protected List<BookDto> bkList;

	public BookServiceImplV1() {
		bkList = new ArrayList<>();
	}
	@Override
	public void loadBook() {

		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11) .txt";
		InputStream is = null;
		Scanner fileScan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + " 파일이 없다.");
			return;
		}
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
		}
		fileScan.close();

		
		//for(String str : ) {
			
			BookDto bkDto = new BookDto();
			
			
			
			
			
			bkList.add(bkDto);
		
	}

	@Override
	public void printBookList() {

		System.out.println("=".repeat(100));
		System.out.println("ISBN\t도서명\t출판사\t저자\t발생일\t페이지\t가격");
		System.out.println("-".repeat(100));
		
		for(BookDto bkDto : bkList) {
			
			System.out.printf("%s\t",bkDto.getbIsbn());
			System.out.printf("%s\t",bkDto.getbTitle());
			System.out.printf("%s\t",bkDto.getbPublisher());
			System.out.printf("%s\t",bkDto.getbAuthor());
			System.out.printf("%s\t",bkDto.getbPublishData());
			System.out.printf("%d\t",bkDto.getbPages());
			System.out.printf("%d\n",bkDto.getbPrice());
			
		}
		System.out.println("=".repeat(100));
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
