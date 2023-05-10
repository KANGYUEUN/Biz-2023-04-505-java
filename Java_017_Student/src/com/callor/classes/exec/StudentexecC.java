package com.callor.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentexecC {

	public static void main(String[] args) {

		String studentFile = "src/com/callor/classes/datas/Student.csv";
		String saveFile = "src/com/callor/classes/datas/Student-sav.csv";

		// 객체를 선언만 할때 null 값을 저장하여 초기화 하면
		// 객체 때문에 발생하는 메모리 관련 문제를 줄일수 있다.
		Scanner fileScan = null;

		// InputStream is = new FileInputStream(studentFile); 이 코드를 두개로 나눈것
		/*
		 * ' InputStream ' 도구 컴퓨터 외부(네트워크,파일)로 부터 데이터를 메모리로 load 하는 데 사용하는 도구 총칭.
		 */
		InputStream is = null; // 선언 외부 파일이여서 오류가 난다. try/catch 필요.
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 생성

		fileScan = new Scanner(is); // System in
		
		while(fileScan.hasNext()) {
			System.out.println(fileScan.nextLine());
		}
		fileScan.close();
	}
}
