package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayD {
/*
 * class type 의 객체(변수) 배열 만들기
 * ClassName[] object = new ClassName[10];
 * 
 * class type 의 배열은 일반 변수 배열가 달리 즉시 사용 불가.
 * 동시에 초기화 되지 않기 때문이다 
 * 따라서 별도로 배열 요소를 초기화 시티는 코드가 필요하다.
 */
	public static void main(String[] args) {
		//ScoreDto[] type 요소 10개를 갖는 배열 선언
		ScoreDto[] scores = new ScoreDto[10];
		
		// class type 의 배열 요소 전체를 객체 요소로 생성하기
		for(int i =0; i< scores.length ; i++) {
			scores[i]= new ScoreDto();
		}
		
		ScoreServiceA scoreServiceA = new ScoreServiceA();
		
		scores[0].stNum = "0001";
		scores[0].stName = "홍길동";
		scores[0].scKor = scoreServiceA.getScore();
		scores[0].scEng = scoreServiceA.getScore();
		scores[0].scMath = scoreServiceA.getScore();
		
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));

		scoreServiceA.scorePrint(scores[0]);
		
	}
	
	
}
