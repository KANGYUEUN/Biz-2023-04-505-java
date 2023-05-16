package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;
import com.callor.student.utils.Index;
import com.callor.student.utils.Line;

/*
 * insertStudent, printStudent, loadStudent 모두 상속받는다.
 */
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	protected StudentDto inputStudent() {
		StudentDto stDto = new StudentDto();

		System.out.println(Line.dLine(60));
		System.out.println("학생정보 입력, 종료하려면 QUIT 입력");
		System.out.println(Line.sLine(60));

		String stNum = "";

		while (true) {
			System.out.printf("학번(정수) >> ");
			stNum = scan.nextLine();
			if (stNum.equals("QUIT"))
				break;
			try {
				int intNum = Integer.valueOf(stNum);
				stNum = String.format("%04d", intNum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("학번은 정수로 입력 하세요");
				continue;
			}
			break;
		}

		if (stNum.equals("QUIT"))
			return null;
		for (StudentDto dto : stdList) {
			if (dto.stNum.equals(stNum)) {
				System.out.println(Line.sLine(100));
				System.err.println("동일학번 학생데이터 수정 필요");
				System.out.println(dto.stNum.toString());
				System.out.println(Line.sLine(100));

				// dto 의 어떤 데이터가 dtDto 에 저장 될까? (주소에 대한 이해 )
				// stdList 안의 어떠한 dto 를 변경하는 것과 같다.
				stDto = dto;
			}
		}

		System.out.printf("이름(%s) >> ", stDto.stName == null ? "신규" : stDto.stName);
		String stName = scan.nextLine();
		if (stName.equals("")) { // 이름을 입력 하지 않은 경우 신규 이면 이름을 입력 해라
			stName = stDto.stName;
		}
		if (stName.equals("QUIT"))
			return null;

		System.out.printf("학과(%s) >> ", stDto.stDept == null ? "신규" : stDto.stDept);
		String stDept = scan.nextLine();
		if (stDept.equals("QUIT"))
			return null;
		if (stDept.equals("")) {
			stDept = stDto.stDept;
		}

		int intGrade = 0;
		while (true) {
			System.out.printf("학년(%d) >> ", stDto.stGrade == 0 ? 0 : stDto.stGrade);
			String strGrade = scan.nextLine();
			if (strGrade.equals("QUIT"))
				break;

			try {
				if (stDto.stGrade != 0 && strGrade.equals("")) {
					intGrade = stDto.stGrade;
				} else {
					intGrade = Integer.valueOf(strGrade);
				}
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
		if (intGrade == 0)
			return null;

		System.out.printf("전화번호(%s) >> ", stDto.stTel == null ? "신규" : stDto.stTel);
		String stTel = scan.nextLine();
		if (stTel.equals("QUIT"))
			return null;
		if (stTel.equals("")) {
			stTel = stDto.stTel;
		}
		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = intGrade;
		stDto.stTel = stTel;
		// stdList.add(stDto);
		return stDto;
	}

	public void insertStudent() {

		// V2에서 상속받은 V1의 inserStudent() 를 먼저 실행하라
		// super.insertStudent();
		while (true) {
			StudentDto stDto = this.inputStudent();
			if (stDto == null)
				break;
			int index = 0;
			for (index = 0; index < stdList.size(); index++) {
				// inputStudent 가 return 한 dto 와
				// stdList 의 요소중에서 참조한 dto 의 주소가 일치한가?
				// 그러면 strList 에 있는 요소 이다
				if (stdList.get(index) == stDto) {
					break;
				}
			}
			if (index >= stdList.size()) {
				stdList.add(stDto);
			}
		}

		// 나머지 처리
		System.out.println("여기는 V2");
		OutputStream os = null;
		PrintWriter out = null;

		try {
			os = new FileOutputStream(Config.STUTENT_FILE);
			out = new PrintWriter(os);

			for (StudentDto dto : stdList) {
				out.printf("%s,", dto.stNum);
				out.printf("%s,", dto.stName);
				out.printf("%s,", dto.stDept);
				out.printf("%d,", dto.stGrade);
				out.printf("%s\n,", dto.stTel);
			}
			out.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void loadStudent() {
		InputStream is = null;
		Scanner fileScan = null;
		try {
			is = new FileInputStream(Config.STUTENT_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		int rows = 0;
		while (fileScan.hasNext()) {
			String line = scan.nextLine();
			String[] student = line.split(",");
			rows++;
			try {
				StudentDto stDto = new StudentDto();
				stDto.stNum = student[Index.STUDENT.ST_NUM];
				stDto.stName = student[Index.STUDENT.ST_NAME];
				stDto.stDept = student[Index.STUDENT.ST_DEPT];
				stDto.stGrade = Integer.valueOf(student[Index.STUDENT.ST_GREADE]);
				stDto.stTel = student[Index.STUDENT.ST_TEL];
				stdList.add(stDto);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(rows + " 라인에서 Exception 발생");
			}
		}
		fileScan.close();
		System.out.println("Load 한 데이터 개수 : " + stdList.size());
	}

	public void deleteStudent() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Line.dLine(60));
		System.out.println("학생정보 삭제, 삭제할 학번 입력");
		System.out.println(Line.sLine(60));
		System.out.println("학번(Enter : 종료) >> ");
		String stNum = scan.nextLine();
		if(stNum.equals("")) {
			return;
		}
		StudentDto dtDto = null;
		int index = 0;
		for (index = 0; index < stdList.size(); index ++ ) {
			if(stdList.get(index).stNum.equals(stNum)) {

				System.out.println(Line.dLine(60));
				System.out.println(stdList.get(index));
				System.out.println(Line.sLine(60));
				break;
			}
		}
		if(index < stdList.size()) {

			System.out.println("학생정보를 삭제 할까요? ( Y / N )");
			String yesNo = scan.nextLine();
			if(yesNo.equals("Y")) {
				stdList.remove(index);
			}
		}
		return;
	}
}
