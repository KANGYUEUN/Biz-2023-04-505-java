package com.callor.classes.exec;

import com.callor.classes.models.StdData;

public class StudentA {

	public static void main(String[] args) {
		
		System.out.println(StdData.STUDENT[0]); // 0번째 정보 한줄 표기
		
		// 문자열 변수(데이터).split("구분자");
		// 문자열 변수에 저장된 문자열을 " 구분자 " 로 분해 하여
		// 문자열 배열로 생성해주는 method 
		String[] student = StdData.STUDENT[0].split(",");  // STUDENT 배열로 만들어서 student 변수에 저장
		
		System.out.println("학번 : " + student[0]);
		System.out.println("이름 : " + student[1]);
		System.out.println("학과 : " + student[2]);
		System.out.println("학년 : " + student[3]);
		System.out.println("담임교수 : " + student[4]);
		System.out.println("전화번호 : " + student[5]);
		System.out.println("주소 : " + student[6]);
		
		
		
	}
}
