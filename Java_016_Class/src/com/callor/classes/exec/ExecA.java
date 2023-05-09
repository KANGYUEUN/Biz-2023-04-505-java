package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.service.ScoreServiceV1;

public class ExecA {

	public static void main(String[] args) {
		
		// ScoreServiceV1 클래스에 정의된 method를 사용하기 위하여 클래스를 ' 객체로 생성 ' 하는 절차
		// method 사용하기 : 정의된 메서드에게 어떤 일을 시키는 것.
		// " method  호출하기 "
		ScoreServiceV1 scService = new ScoreServiceV1();
		scService.makeScore();
		scService.printScore();
		
		
		// Integer List type 의 scoreList 객체변수 생성
		List<Integer> scoreList = new ArrayList<>();
		// scoreList 데이터가 담긴 객체변수의 기억 장치 주소를 makeScore() 에게 전달 하면서 뭔가 요청하기.
		scService.makeScore(scoreList);
		
		// scService.makeScore(); 호출 하기
		// method 호출 하면서 scoreList 라는 데이터가 담긴 객체 변수의 " 기억 장치 주소 " 를 전달하고 
		// return 된 결과를 result 변수에 저장.
		int result	= scService.makeScore(scoreList);
		
		
	}
}
