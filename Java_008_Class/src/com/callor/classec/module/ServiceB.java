package com.callor.classec.module;

import com.callor.classec.model.ScoreDto;

public class ServiceB {
	public void score(ScoreDto score) {
		System.out.println("학번 :" + score.num);
		System.out.println("이름 :" + score.name);

		System.out.println("국어 :" + score.kor);
		System.out.println("영어 :" + score.eng);
		System.out.println("수학 :" + score.math);
		System.out.println("국사 :" + score.history);
		System.out.println("음악 :" + score.music);
		System.out.println("미술 :" + score.art);
		System.out.println("체육 :" + score.play);

//		int total = score.kor;
//		total = score.eng;
//		total = score.math;
//		total = score.history;
//		total = score.music;
//		total = score.art;
//		total = score.play;

		int total = score.getTotal(); // 위의 9가지 나열이 필요없어짐

		// float avg = (float) total / 7;
		float avg = score.getAvg();

		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);

	}
}
