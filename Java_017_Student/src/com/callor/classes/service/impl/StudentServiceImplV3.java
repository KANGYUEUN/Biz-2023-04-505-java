package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

/*
 * StudentServiceImplV1 는 StudentService interface 를 implements 하였고
 * StudentServiceImplV3 는 StudentServiceImplV1 을 extends 하였다.
 */
public class StudentServiceImplV3 extends StudentServiceImplV1	 {
	
	public StudentServiceImplV3() {
		stdList = new ArrayList<>();
	}
	
	@Override
	public void loadStudent() {
		String studentFile = "src/com/callor/classes/datas/Student.csv";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(studentFile);
		} catch (Exception e) {
			System.out.println(studentFile + " 이 없다 확인하시오.");
			return;
		}
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			// 한줄씩 파일에서 읽어 Line에 저장
			 String line = scan.nextLine();
			 StudentDto stDto = str2Dto(line); // 상속을 받음으로 코드가 간편해짐.
			 
			 /*
			 String[] student = line.split(",");
			 StudentDto stDto = new StudentDto();
			 stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
			 stDto.stName = student[DataIndex.STUDENT.ST_NAME];
			 stDto.stDept = student[DataIndex.STUDENT.ST_DEPT];
			 stDto.stGrade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
			 stDto.stTel = student[DataIndex.STUDENT.ST_TEL];
			 stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
			 */
			 
			 stdList.add(stDto);
		}
		scan.close();
	}

	@Override
	public void printStudent() {

		StudentServiceImplV2 stService = new StudentServiceImplV2();
		stService.loadStudent();
		printHeader();
		int rows = 0;
		for (StudentDto dto : stdList) {

			System.out.printf("%s\t",dto.stNum);
			System.out.printf("%3s\t",dto.stName);
			System.out.printf("%s\t",dto.stDept);
			System.out.printf("%2d\t",dto.stGrade);
			System.out.printf("%13s\t",dto.stTel);
			System.out.printf("%5s\n",dto.stAddress);
			
			
			// 5줄 마다 구분선을 출력
			// 다만 구분선 출력 위치가 리스트의 끝보다 작을때.
			if(++rows % 5 == 0 && rows < stdList.size()) {
				System.out.println(Line.sLINE);
			}
			
		}
		System.out.println(Line.sLINE(100));
	}

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
