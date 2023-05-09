package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	// 클래스 영역에 필드 변수로 객체 선언
	private List<StudentDto> stdList;
	public StudentServiceImplV1() {
		
		// 기본 생성자에서 객체를 초기화(사용할수 있도록 생성)
		stdList  = new ArrayList<>();
	}
	
	@Override
	public void loadStudent() {
		// STUDENT 문자열 배열 데이터를 for 통해 펼쳐 분해하여 담기
		for (int index = 0; index < StdData.STUDENT.length; index++) {
			
			// 문자열 변수에 저장된 문자열을 ',' 로 다시 분해 
			// student 배열에 분해한것을 저장하기 
			String[] student = StdData.STUDENT[index].split(",");
			// StudentDto class type 의 StdDto 객체를 생성
			// StudentDto  type 의 객체를 생성
			StudentDto stdDto = new StudentDto();
			// student 배열의 각 요소를 StudentDto type 객체 요소에 저장하기
			stdDto.stNum = student[StdData.ST_NUM];
			stdDto.stName = student[StdData.ST_NAME];
			stdDto.stDept = student[StdData.ST_DEPT];
			stdDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			stdDto.stTel = student[StdData.ST_TEL];
			stdDto.stAddress = student[StdData.ST_ADDRESS];
			// List<StudentDto> type 의 리스트에 추가 하기 
			stdList.add(stdDto);
		}
	}

	@Override
	public void printStudent() {

		System.out.println("=".repeat(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println("-".repeat(100));

		for (StudentDto dto : stdList) {
			
			System.out.printf("%s\t",dto.stNum);
			System.out.printf("%3s\t",dto.stName);
			System.out.printf("%s\t",dto.stDept);
			System.out.printf("%2d\t",dto.stGrade);
			System.out.printf("%13s\t",dto.stTel);
			System.out.printf("%5s\n",dto.stAddress);
			
		}
		System.out.println("=".repeat(100));
	}
	
	/*
	 * stdList 에서 stNum 학번으 학생 데이터를 찾아서 
	 * 학생데이터 return 하는 method
	 */
	@Override
	public StudentDto getStudent(String stNum) {

		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				return dto;
			}
		}
		return null;
	}
}
