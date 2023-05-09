package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StudentDto;

public class ExecC {

	public static void main(String[] args) {
		
		// StudentDto type 의 List 객체변수 stList 생성하기.
		// size() = 0  인 변수 (값이 없다.)
		List<StudentDto> stdList = new ArrayList<>();
		
		// 홍길동 학생정보 저장위한 stDto 생성
		StudentDto stDto = new StudentDto();
		// 학번 이름 학과 변수에 각각 저장
		stDto.stNum = "0001";
		stDto.stName = "홍길동";
		stDto.stDept = "정보통신" ;
		// 홍길동 객체를 stList 에 추가 하기
		stdList.add(stDto);
		
		
		stDto = new StudentDto();
		stDto.stNum = "0002";
		stDto.stName = "성춘향";
		stDto.stDept = "컴퓨터 공학";
		stdList.add(stDto);
		
		// List 0 번째 데이터인 stName 을 출력 해 달라
		System.out.println(stdList.get(0).stName);

		// stdList 에 index 0 번 데이터 학생 객체 데이터 를 
		// ' get(0) '  하여 (읽기) 홍길동 객체 변수에 복사하기
		StudentDto 홍길동 = stdList.get(0);
		System.out.println(홍길동.toString()); // toString() 전체 변수를 보여주라
		System.out.println(홍길동.stName); // 홍길동의 stName 변수의 값만 보여줘라
		System.out.println(stdList.get(0).stName);  // 홍길동의 stName 변수의 값만 보여줘라
		
		StudentDto 성춘향 = stdList.get(1);
		System.out.println(성춘향.toString());
		System.out.println(성춘향.stName);
		
		/*
		 * ' stdList 에서 .get(1) 실행 '
		 * stdList 에 저장된 데이터 중에서 index 1 번째 데이터가 객체로 변환 된다.
		 * stdList.get(1) = stdList 의 index 1 의 객체 데이터를 통해 stName 에 접근 할 수 있다.
		 */
		System.out.println(stdList.get(1).stName);
		
		System.out.println("=".repeat(10));
		
		for ( int i = 0; i < stdList.size(); i ++) {
			String stName = stdList.get(i).stName; // stdList 에 있는 객체들의 stName 변수의 값만 출력 하기 
			System.out.println(stName);
		}
		
		
		
		
		
	}
}
