package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayB {
	
	public static int getScore() {
		int score = (int)(Math.random()*50)+51;
		return score;
	}
	
	public static void main(String[] args) {
		// ScoreServiceA 클래스에 선언된 메서드 사용하기 위해 선언
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// 3명 학생의 성적정보를 저장할 객체변수 생성
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();

		// 홍길동 학생의 학번,이름, 과목점수 세팅
		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		홍길동.scKor =  scoreService.getScore();
		홍길동.scEng =  scoreService.getScore();
		홍길동.scMath =  scoreService.getScore();

		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		이몽룡.scKor = getScore();
		이몽룡.scEng = getScore();
		이몽룡.scMath = getScore();

		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		성춘향.scKor = getScore();
		성춘향.scEng = getScore();
		성춘향.scMath = getScore();
		
		// 성적 표 제목 출력 
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));

		// 각 학생의 성적정보 출력
		scoreService.scorePrint(홍길동);
		scoreService.scorePrint(성춘향);
		scoreService.scorePrint(이몽룡);
		
	}
}
