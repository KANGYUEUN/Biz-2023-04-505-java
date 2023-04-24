package com.callor.classes.exec.module;

public class ServiceF {
	public void score(int kor, int eng, int math, int history, int music, int draw, int athletic) {
		int total = kor + eng + math + history + music + draw + athletic;
		float avg = (float) total / 7;

		System.out.printf("총점 :" + total);
		System.out.printf("평균 :" + avg);
	}
}
