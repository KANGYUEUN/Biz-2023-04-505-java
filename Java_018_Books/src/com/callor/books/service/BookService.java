package com.callor.books.service;

import java.util.List;

import com.callor.books.models.BookDto;

/*
 *  " 인터페이스 : interface 클래스 작성하기 "
 *  업무의 추상화 
 *  BookDto 데이터 클래스를 작성한후 도서정보 서비스를 구현하기 위해
 *  어떤 업무(Business logic)가 필요한가를 결정하는것.
 *  
 *  1.도서정보.txt 파일을 열어서 도서정보 List 데이터 만들기 : 데이터 생성하기 Create
 *  	loadBooks() method 로 구현
 *  2.도서정보 List를 화면에 출력해 보기 : 데이터 조회 Read
 *  	printBookList()
 *  3.도서 ISBN 으로 개별 도서의 정보 조회 하기 : 개별정보 조회 R
 *  	getBook(String isbn)
 *  4.도서 정보를 수정하기 ( 한 도서의 각 속성 변수에 저장된 값을 변경하는 것 : 데이터 변경 수정 Update
 *  	updateBook() 
 *  5.도서 정보 삭제하기 ( 한 도서의 데이터를 통째로 제거하는 것 ) : 데이터 삭제 Delete
 *  	deleteBook()
 */
public interface BookService {

	public void loadBook();
	public void printBookList();
	
	public BookDto getBook(String isbn);
	public List<BookDto> getBookList();
	
	public void updateBook(BookDto bookDto);
	public void deleteBook(String isbn);
	public static void main(String[] args) {

	}
	
}
