package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;

public class ExecB {

	public static void main(String[] args) {

		// StudentDto 클래스를 사용하여 stDto 객체변수 만들기
		StudentDto stDto = new StudentDto();

		
		// stDto 객체에 '.' 연산자를 사용하여 stNum 변수에 접근
		// "0001" 문자열을 저장하기
		stDto.stNum = "0001"; // 객체.변수
		
		
		// stDto 객체에 '.' 연산자 통해 변수에 접근 하여 
		// " 값을 읽고 stNum 변수에 값을 복사하기 "
		String stNum = stDto.stNum;
		
		
		// stDto 의 값을 . 연산자 통해  stNum 변수에 접근 하여 값을 읽고 출력.
		System.out.println(stDto.stNum);
		
		
		// StudentDto 클래스를 사용하여 생성한 홍길동, 이몽룡 , 성춘향 객체 변수는
		// 서로 간에 데이터 간섭이 없는 독립된 변수들이다.
		StudentDto 홍길동 = new StudentDto();
		홍길동.stName = "홍길동"; // 홍길동 객체 의 stName 이란 변수에 " 홍길동 " 문자열을 저장.
		
		StudentDto 이몽룡 = new StudentDto();
		StudentDto 성춘향 = new StudentDto();
		
		
		
	}
}
