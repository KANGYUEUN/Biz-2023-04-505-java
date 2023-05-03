package com.callor.scanner.service;

import java.util.Scanner;

import com.callor.scanner.models.StudentDto;

public class StudentServiceV2 {

	private StudentDto[] stList;
	
	public void inputStudents() {
		Scanner scan = new Scanner(System.in);
		stList  = new StudentDto[5];		
	
		for(int i = 0; i < stList.length; i ++ ) {
			
			System.out.println("학생정보를 입력하세요");
			System.out.print("학번(1~5) >> ");
			String stNum = scan.nextLine();
			
			int intNum = 0;
			try {
				intNum = Integer.valueOf(stNum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("학번은 정수로만 입력하시오 ");
			}
			if(intNum < 1 || intNum > stList.length + 1) {
				System.out.println("학번은 1~5 범위에서 입력 하시오 ");
			}
			System.out.print("이름 >> ");
			String stName = scan.nextLine();
			
			
			StudentDto student = new StudentDto();
			student.setStNum(String.format("%04d",intNum));
			student.setStName(stName);
			
			stList[intNum - 1] = new StudentDto();
			stList[intNum - 1] = student;
			
			
			

			System.out.print("학과 >> ");
			String stDept = scan.nextLine();

			int intGrade = 0;
			while (true) {
				System.out.print("학년 >>");
				student.setStGrade(scan.nextInt());
				try {
					intGrade = Integer.valueOf(intGrade);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("학년은 정수로만 입력하시오 ");
					continue;
				}
				if (intGrade < 1 || intGrade > 4) {
					System.out.println("학년은 1~4 범위에서 입력 하시오 ");
					continue;
				}
				break;
			}
			
			System.out.print("전화번호 >> ");
			String stTel = scan.nextLine();
			
			student.setStNum(stNum);
			student.setStName(stName);
			student.setStDept(stDept);
			student.setStGrade(intGrade);
			student.setStTel(stTel);

			System.out.println(student.toString());
			
		}
		
	}

	public void printStudents() {
	
		System.out.println("=".repeat(70));
		System.out.printf("학번\t이름\t학과\t학년\t전화번호");
		System.out.println("-".repeat(70));
		
		for(int i = 0; i < stList.length; i ++ ) {
			
		}
		System.out.printf("");
		System.out.println("=".repeat(70));
	}
		



}




	
	