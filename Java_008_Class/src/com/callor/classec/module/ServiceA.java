package com.callor.classec.module;

public class ServiceA {
	public void score(int kor, int eng, int math, int history, int music, int art, int play) {
		int total = kor + eng + math + history + music + art + play;
		float avg = (float)total / 7;
		
		
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
		System.out.println("국사 :" + history);
		System.out.println("음악 :" + music);
		System.out.println("미술 :" + art);
		System.out.println("체육 :" + play);
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
	}
}
