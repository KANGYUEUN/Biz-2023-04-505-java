package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV2 extends StudentServiceImplV1 {

	private List<StudentDto> stdList;

	public StudentServiceImplV2() {
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {

		String studentFile = "src/com/callor/classes/datas/Student.csv";
		String saveFile = "src/com/callor/classes/datas/Student-sav.csv";

		Scanner fileScan = null;
		InputStream is = null; 
		
		try {is = new FileInputStream(studentFile);} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		fileScan = new Scanner(is); 
		
		while(fileScan.hasNext()) {System.out.println(fileScan.nextLine());}
		fileScan.close();
			
		for(String str : DataSource.STUDENT) {
			
			String[] student = str.split(",");
			StudentDto stDto = new StudentDto();
					
				stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
				stDto.stName = student[DataIndex.STUDENT.ST_NAME];
				stDto.stDept = student[DataIndex.STUDENT.ST_DEPT];
				stDto.stGrade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
				stDto.stTel = student[DataIndex.STUDENT.ST_TEL];
				stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
					
			stdList.add(stDto);
		}
	}

	@Override
	public void printStudent() {

		StudentServiceImplV2 stService = new StudentServiceImplV2();
		stService.loadStudent();
		
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호\t주소");
		System.out.println(Line.sLINE(100));

		for (StudentDto dto : stdList) {

			System.out.printf("%s\t",dto.stNum);
			System.out.printf("%3s\t",dto.stName);
			System.out.printf("%s\t",dto.stDept);
			System.out.printf("%2d\t",dto.stGrade);
			System.out.printf("%13s\t",dto.stTel);
			System.out.printf("%5s\n",dto.stAddress);
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
