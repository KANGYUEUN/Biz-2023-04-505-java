package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV2 {

	public void makeScore(List<ScoreDto> scList) {
		for(int i = 0; i < 10; i++ ) {

			ScoreDto scDto = new ScoreDto(); // for 문 안에 어디든 상관 없음 
			
			// 0001~0010 까지 학번 만들기
			String stNum = String.format("%04d", i + 1);
			
			int intkor = (int)(Math.random()*50) +51;
			int intEng = (int)(Math.random()*50) +51;
			int intMath = (int)(Math.random()*50) +51;
			
			scDto.setStNum(stNum);
			scDto.setScKor(intkor);
			scDto.setScEng(intEng);
			scDto.setScMath(intMath);
			
			// scDto 객체 변수를 scList 에 추가 하기 
			scList.add(scDto);
		}
	}
	
	
	// scList 변수를 ScoreServiceV2 클래스의 다른 메서드에서도 사용 하기ㅜ 위해
	// 클래스 영역으로 스코프를 이동 한다.
	// 클래스 영역 으로 스코프가 이동된 객체 변수는 선언만 수행한다.
	// 선언만 수행된 객체 변수는 사용 하려고 하면 NullpointException 발생 할수 있다.
	// makeScore() 가 시작 되는 곳에서 scList 를 초기화 생성 해줘야 한다.
	private List<ScoreDto> scList;  // 객체 변수 선언
	
	public void makeScore() {
		
		// scList 변수의 스코프가 makeScore() method {} 블럭이다
		// 만약 다른 method 에서 scList 변수 값을 사용 하려면 
		// 스코프 영역을 변경 해 줘야 한다.
		
		scList = new ArrayList<>(); // 객체 변수 초기화 
		this.makeScore(scList); // 이 코드를 쓰면 중복해서 사용 안하고 사용 가능.
		
//		for(int i = 0; i < 10; i++ ) {
//
//			ScoreDto scDto = new ScoreDto();
//			
//			// 0001~0010 까지 학번 만들기
//			String stNum = String.format("%04d", i + 1);
//			
//			int intkor = (int)(Math.random()*50) +51;
//			int intEng = (int)(Math.random()*50) +51;
//			int intMath = (int)(Math.random()*50) +51;
//			
//			scDto.setStNum(stNum);
//			scDto.setStKor(intkor);
//			scDto.setStEng(intEng);
//			scDto.setStMath(intMath);
//			
//			// scDto 객체 변수를 scList 에 추가 하기 
//			scList.add(scDto);
//		}
		
		System.out.println(scList.toString());
	}
	
	
}
