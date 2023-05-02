package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceV1;

public class ScoreExecV1 {

	public static void main(String[] args) {

		// 10 명 학생의 점수를 저장할 객체 배열 선언하기
		ScoreDto[] scoreList = new ScoreDto[10];

		// 객체배열 각 요소 초기화 하기
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i] = new ScoreDto();
		}
		
		// ScoreService 에 있는 method 를 사용 하기 위한 준비하기
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		// ScoreService 클래스의 scoreList 객체 배열 변수에 
		// 생성된(선언과 초기화가 완료) scoreList 객체 배열값을 세팅 한다.
		scService.setScoreList(scoreList);
		
		// 점수 생성하기
		scService.scoreRndMake();
		
		/*
		 * scoreService 의 scoreList 객체 배열을 
		 * public 으로 하지 않고 private 로 선언한다 (정보의 은닉)
		 * 코드 어디선가 개발자가 예기치 않게 scoreList 데이터가 변경 되는것을 방지하는 목적.
		 * 
		 */
		//scService.scoreList = new ScoreDto[100]; 
		
		// 점수 리스트 출력하기
		scService.scoreListPrint();
		scService.scoreTotalPrint();
		scService.scoreAvgPrint();
		
		
	}
}
