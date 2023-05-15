package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentExecA {

	public static void main(String[] args) {

		List<StudentDto> stdList = new ArrayList<>();
		// 객체 stdDto 생성후 각 요소에 데이터 setting
		// stDto.stNum = stNum; 이런 식으로 데이터 저장 하면 명확히 할수 있다.
		// stDto = new StudentDto(stNum,stName,stDept,.....);
		StudentDto stdDto = new StudentDto();
		Scanner scan = new Scanner(System.in);
		/*
		 * 어떤 데이터를 입력할 것인가 라는 안내메시지 
		 * 각 속성(요소)를 입력할때 prompt 보이기
		 */
		System.out.println(Line.dLine(80));
		System.out.println("학생정보 입력 ");
		System.out.println(Line.sLine(80));
		
		System.out.printf("학번을 입력하세요 >> ");
		stdDto.stNum = scan.nextLine();
		
		System.out.printf("이름을 입력하세요 >> ");
		stdDto.stName = scan.nextLine();

		System.out.printf("학과를 입력하세요 >> ");
		stdDto.stDept = scan.nextLine();
		
		System.out.printf("학년(정수)를 입력하세요 >> ");
		stdDto.stGrade = Integer.valueOf(scan.nextLine());
		
		System.out.printf("전화번호를 입력하세요 >> ");
		stdDto.stTel = scan.nextLine();
		
		System.out.println(stdDto);
		
		// dto 객체 데이터를 List 에 추가하기
		stdList.add(stdDto);
		System.out.println(stdList.toString());
		
	}
}
