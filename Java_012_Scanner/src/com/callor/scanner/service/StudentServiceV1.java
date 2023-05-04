package com.callor.scanner.service;

import java.util.Scanner;

import com.callor.scanner.models.StudentDto;

public class StudentServiceV1 {

	private String stGrade;

	public void inputStudent() {
		StudentDto student = new StudentDto();
		Scanner scan = new Scanner(System.in);

		System.out.print("학번 : >> ");
		student.setStNum(scan.nextLine());

		// String stNum = scan.nextLine();
		// student.setStNum(stNum);

		System.out.print("이름 : >>");
		student.setStName(scan.nextLine());

		// String stName = scan.nextLine();
		// student.setStName(stName);

		System.out.print("학과 : >>");
		student.setStDept(scan.nextLine());
		
		int intGrade = 0;
		while (true) {
			System.out.print("학년 : >>");
			student.setStGrade(scan.nextInt());
			try {
				intGrade = Integer.valueOf(stGrade);
			} catch (Exception e) {
				System.out.println("학년은 정수로만 입력하시오 ");
				continue;
			}

			if (intGrade > 1 || intGrade < 4) {
				System.out.println("학년은 1~4 범위에서 입력 하시오 ");
				continue;
			}
			break;
		}

		System.out.print("전화번호 : >>");
		student.setStTel(scan.nextLine());

		System.out.println(scan.toString());

	}
}
