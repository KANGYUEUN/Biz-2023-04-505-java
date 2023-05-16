package com.callor.student.exec;

import java.util.Scanner;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;
import com.callor.student.utils.Line;

public class StudentExecG {

	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV2();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Line.dLine(100));
		System.out.println("대한고교 학사관리 2023");
		System.out.println(Line.dLine(100));

		while(true) {
			System.out.println("실행할 업무를 선택하세요");
			System.out.println(Line.sLine(100));
			System.out.println("1. 학생 리스트 확인");
			System.out.println("2. 학생정보 추가/수정");
			System.out.println("3. 학생정보 삭제");
			System.out.println("9. 업무 종료");
			System.out.println(Line.sLine(100));
			System.out.print("업무선택 >> ");
			String strSelect = scan.nextLine();
			int intSelect =0;
			try {
				intSelect = Integer.valueOf(strSelect);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.printf("업무선택을 확인 하세요(%s)", strSelect);
				continue;
			}
			if(intSelect == 1) {
				stService.printStudent();
			} else if (intSelect == 2) {
				stService.insertStudent();
			} else if (intSelect == 3) {
				/*
				 * deleteStudent() 는 Service interface 에 없는 메서드 이다.
				 * 따라서 method 를 포함 하고 있는 클래스 타입으로 
				 * 객체 형 변환을 해 주어야 사용 가능하다.
				 */
				((StudentServiceImplV2)stService).deleteStudent();
			} else if (intSelect == 9 ) {
				break;
			} else {
				System.out.printf("업무 선택이 잘목 되었습니다 (%d)\n", intSelect);
			}
		}
		System.out.println("업무 종료 !");
	}
}
