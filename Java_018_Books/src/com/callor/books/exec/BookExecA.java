package com.callor.books.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BookExecA {

	// ISBN,도서명,출판사,저자,발행일,페이지,가격
	// 0,    1      2      3    4      5      6    : index
	/*
	 * 도서정보.txt 파일을 열어서 각 line 을 읽어 들여
	 *  index 0 ~ 8 까지 데이터를 console 에 출력 해 보기
	 */

	public static void main(String[] args) {

		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11) .txt";
		InputStream is = null;
		Scanner fileScan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(bookFile + " 파일이 없다.");
			return;
		}
		
		/*
		 *  " InputStream " 도구를 사용하여 직접 파일 내용을 읽을수 있다.
		 *  하지만 절차가 많은 코딩이 필요 
		 *  좀더 쉽게 text 파일을 ㅇ릭어 메모리로 가져오기 위해
		 *  ' Scanner ' 도구를 사용해서 연결 하는 것이다.
		 */
		
		fileScan = new Scanner(is);
		
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] book = line.split(",");
			
			for(String str : book) {
				System.out.println(str + ",");
			}
				System.out.println();	
		}
		fileScan.close();
	}
}
