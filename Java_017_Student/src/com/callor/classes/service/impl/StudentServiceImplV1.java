package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	// 클래스 영역에 필드 변수로 객체 선언
	// 선언이여서 new 필요 없음.
	protected List<StudentDto> stdList;

	// stdList 객체는 Service 생성자에서 초기화 한다.
	public StudentServiceImplV1() {

		// 기본 생성자에서 객체를 초기화 (사용할수 있도록 생성)
		// 선언과 생성을 분리.
		stdList = new ArrayList<>();
	}

	protected StudentDto str2Dto(String str) {

		// 문자열 변수에 저장된 문자열을 ',' 로 다시 분해
		// student 배열에 분해한것을 저장하기
		String[] student = str.split(",");

		// StudentDto class type 의 StdDto 객체를 생성
		// ( = StudentDto type 의 객체를 생성 )
		StudentDto stdDto = new StudentDto();

		// student 배열의 각 요소를 StudentDto type 객체 요소에 저장하기
		// (public 이기 때문에 getter setter 없이 그냥 사용가능)
		stdDto.stNum = student[DataIndex.STUDENT.ST_NUM];
		stdDto.stName = student[DataIndex.STUDENT.ST_NAME];
		stdDto.stDept = student[DataIndex.STUDENT.ST_DEPT];
		stdDto.stGrade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
		stdDto.stTel = student[DataIndex.STUDENT.ST_TEL];
		stdDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];

		return stdDto;

	}

	@Override
	public void loadStudent() {
		// STUDENT 문자열 배열 데이터를 for() 통해 펼쳐 분해하여 str에 담기
		for (String str : DataSource.STUDENT) {

			// List<StudentDto> type 의 리스트에 추가 하기
			// StudentDto dto = str2Dto(str);

			StudentDto dto = str2Dto(str);
			stdList.add(str2Dto(str));
		}
	}

	protected void printStudent(StudentDto dto) {

		System.out.printf("%s\t", dto.stNum);
		System.out.printf("%3s\t", dto.stName);
		System.out.printf("%s\t", dto.stDept);
		System.out.printf("%2d\t", dto.stGrade);
		System.out.printf("%13s\t", dto.stTel);
		System.out.printf("%5s\n", dto.stAddress);
	}

	protected void printHeader() {
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println(Line.sLINE(100));
	}
	
	
	@Override
	public void printStudent() {
		printHeader();
		for (StudentDto dto : stdList) {
			printStudent(dto);
		}
		System.out.println(Line.dLINE(100));
	}

	/*
	 * stdList 에서 stNum 학번의 학생 데이터를 찾아서 학생데이터 return 하는 method
	 */

	@Override
	public StudentDto getStudent(String stNum) {

		for (StudentDto dto : stdList) {
			if (dto.stNum.equals(stNum)) {
				return dto; // 데이터가 있으면 리턴
			}
		}
		return null;

	}
}
