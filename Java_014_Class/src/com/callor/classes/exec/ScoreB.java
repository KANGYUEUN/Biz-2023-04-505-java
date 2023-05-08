package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.medels.ScoreDto;
import com.callor.classes.service.ScoreServiceV1;

/*
 * 일반적인 변수(primitive)는 method 의 매개변수로 전달할때
 * 변수 자체가 전달되는 것이 아니라 변수의 값(데이터) 만 전달 된다.
 * 매개변수로 전달 받은 method 에서 아무리 변수의 값을 변경해도 
 * 실제 값은 변경 되지 않는다. 
 */
public class ScoreB {

	public static void main(String[] args) {
		
		// ScoreDto 데이터 를 저장하기 위한 scoreList 작성
		List<ScoreDto> scoreList = new ArrayList<>(); // 참조형(클래스를 이용해 만든 변수 )
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		scService.makeScore(scoreList);
		// System.out.println(scoreList.toString());
		scService.printScore(scoreList);
		scService.sortScore(scoreList);
		
		
		int num1 = 100;
		int num2 = 200;
		
		// scService의 add()메서드에 변수 값 전달학
		// num1,num2 에 저장된 값이 전달 되는 것이다. ( 변수의 전달이 아니다 )
		scService.add(num1,num2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
