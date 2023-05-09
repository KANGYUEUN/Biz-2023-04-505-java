package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScData;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;

/*
 *  " interface(class) 를 implements 한 클래스 "
 *  interface에 선언된 모든 method 를 모두 구현 해야 함
 *  interface에 선언된 method 는 한개라도 생략 되면
 *  문법 오류가 되고 실행 불가 해진다.
 *  
 */


public class ScoreServiceImplV3 implements ScoreService {
	
	private List<ScoreDto> scList;
	public ScoreServiceImplV3() {
		scList = new ArrayList<>();
		
	}
	List<ScData> scdata = new ArrayList<>();
	
	// ScData.SCORE 배열을 loading 하여 
	// stList 데이터로 변환하기 
	@Override
	public void makeScore() {
		
		for(String str : ScData.SCORE) {
			
			String[] score = str.split(",");
			ScoreDto scDto = new ScoreDto(
					score[ScData.ST_NUM],
					Integer.valueOf(score[ScData.SC_KOR]),
					Integer.valueOf(score[ScData.SC_ENG]),
					Integer.valueOf(score[ScData.SC_MATH]),
					Integer.valueOf(score[ScData.SC_MUSIC]),
					Integer.valueOf(score[ScData.SC_ART]),
					Integer.valueOf(score[ScData.SC_SOFTWARE]),
					Integer.valueOf(score[ScData.SC_DATABASE])
					);
		
			scList.add(scDto);
		}
	}

	@Override
	public void makeScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {

		StudentServiceImplV1 stV1 = new StudentServiceImplV1();
		stV1.loadStudent();
		stV1.printStudent();
		
		System.out.println("=".repeat(100));
		System.out.println("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술");
		System.out.println("-".repeat(100));

		for(ScoreDto dto : scList ) {
			
			StudentDto namedto = stV1.getStudent(dto.getStNum());
			
			System.out.printf("%s\t",dto.getStNum());
			System.out.printf("%s\t",namedto.stName);
			System.out.printf("%s\t",namedto.stDept);
			System.out.printf("%3d\t",dto.getScKor());
			System.out.printf("%3d\t",dto.getScEng());
			System.out.printf("%3d\t",dto.getScMath());
			System.out.printf("%3d\t",dto.getScMusic());
			System.out.printf("%3d\t",dto.getScArt());
			System.out.println();
		}
		System.out.println("=".repeat(100));
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}

	
}
