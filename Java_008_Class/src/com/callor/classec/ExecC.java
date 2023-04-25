package com.callor.classec;

import com.callor.classec.model.ScoreDto;

public class ExecC {
	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.name = "홍길동";
		홍길동.kor = 100;
		
		이몽룡.name = "이몽룡";
		이몽룡.kor = 88;
		
		성춘향.name = "이몽룡";
		성춘향.kor = 99;
		성춘향.eng = 79;
		성춘향.math = 69;
		성춘향.history = 59;
		성춘향.music = 49;
		성춘향.art = 39;
		성춘향.play = 29;
		
		
		System.out.println("성춘향 국어 점수 : " + 성춘향.kor); //객체 지향
		System.out.println("성춘향 총점 : " + 성춘향.getTotal()); //객체 지향
		System.out.println("성춘향 평균 : " + 성춘향.getAvg()); //객체 지향
		
		
	}
}
