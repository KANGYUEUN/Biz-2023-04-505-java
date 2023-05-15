package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentDto> stdList; // 영속성 있는 데이터로 만들기
	protected Scanner scan;

	public StudentServiceImplV1() {
		stdList = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	/*
	 * ' insertStudent() ' 는 StudebtService(인터페이스)에 정의 되지 않은 메서드 이다. 이 메서드는 상속받은것이
	 * 아니고 V1 클래스에서 임의로 생성한 메서드 이다.
	 */
	public void insertStudent() {

		while (true) {

			System.out.println(Line.dLine(60));
			System.out.println("학생정보 추가 종료하려면 'QUIT' 입력");
			System.out.println(Line.sLine(60));

			System.out.printf("학번 >> ");
			String stNum = scan.nextLine();
			if (stNum.equals("QUIT")) break;
				
			System.out.printf("이름 >> ");
			String stName = scan.nextLine();
			if (stName.equals("QUIT")) break;

			System.out.printf("학과 >> ");
			String stDept = scan.nextLine();
			if (stDept.equals("QUIT")) break;
				
			int intGrade = 0;
			
			while (true) {
				System.out.printf("학년 >> ");
				String strGrade = scan.nextLine();
				if (strGrade.equals("QUIT")) break;

				try {
					intGrade = Integer.valueOf(strGrade);
				} catch (Exception e) {
					System.out.println("학년은 정수로 입력하세요");
					continue;
				}
				if (intGrade < 1 || intGrade > 4) {
					System.out.println("학년은 정수 1 ~ 4까지만 입력하세요");
					continue;
				}
				break;

			}
			if(intGrade == 0) break;
			
			System.out.printf("전화번호 >> ");
			String stTel = scan.nextLine();
			if (stTel.equals("QUIT")) break;

			StudentDto stDto = new StudentDto();
			stDto.stNum = stNum;
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = intGrade;
			stDto.stTel = stTel;

			stdList.add(stDto);
		}
		System.out.printf("학생정보 입력 종료 !");
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {

		System.out.println(Line.dLine(100));
		System.out.println("대한 고교 학생 리스트");
		System.out.println(Line.sLine(100));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호");
		System.out.println(Line.sLine(100));

		if (stdList == null || stdList.size() < 1) {
			System.out.println("표시할 데이터가 없다");
			return;
		}
		for (StudentDto dto : stdList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%d\t", dto.stGrade);
			System.out.printf("%s\n", dto.stTel);
		}
		System.out.println(Line.dLine(100));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

}