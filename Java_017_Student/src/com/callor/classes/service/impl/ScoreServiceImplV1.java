package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;
import com.callor.classes.service.StudentService;

public class ScoreServiceImplV1 implements ScoreService {
	
	protected List<ScoreDto> scList; // 점수 리스트를 저장할 객체 변수를 선언.
	// 이 코드는 지양 private List<ScoreDto> scList = new ArrayList<>();
	
	// " 변수의 초기화 " ,  객체의 초기화 , 변수의 생성, 변수의 초기화 
	//scList 를 초기화 하여 사용가능 하도록 생성한다.
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}
	// 성적정보 문자열 1개를 ',' 로 분해하고
	// ScoreDto 객체로 변환하여 return 하는 method 
	protected ScoreDto str2Dto(String str) {
		String[] score = str.split(",");
		ScoreDto scDto = new ScoreDto(
				score[DataIndex.SCORE.ST_NUM],
				Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
				Integer.valueOf(score[DataIndex.SCORE.SC_ENG]),
				Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
				Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]),
				Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
				Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
				Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
				);
		return scDto;
	}
	
	@Override
	public void loadScore() {
		for(String str : DataSource.SCORE) {
			
//			String[] score = str.split(",");
//			ScoreDto scDto = new ScoreDto(
//					score[DataIndex.SCORE.ST_NUM],
//					Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_ENG]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
//					);
//		
			ScoreDto scDto = str2Dto(str);
			scList.add(scDto);
			
		}
	}

	@Override
	public void printScore() {
		
		StudentServiceImplV1 stService = new StudentServiceImplV1();
		stService.loadStudent(); // 학생 정보(이름 학과) 로드 
		
		
		System.out.println(Line.dLINE(70));
		System.out.println("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술");
		System.out.println(Line.sLINE(70));

		for(ScoreDto dto : scList ) {
			
			// 학번을 StudentServiceImplV1.getStudent() 에 전달하고 
			// 해당하는 데이터를 전달 받아서 StudentDto 타입의 객체에 저장 
			StudentDto stDto = stService.getStudent(dto.getStNum());
			
			System.out.print(dto.getStNum() + "\t");
			
			if( stDto != null ) {
				System.out.print(stDto.stName + "\t");
				System.out.print(stDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t\t");
			}
			
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			System.out.println();
			
		}
		
		System.out.println(Line.dLINE(70));
	}
}
