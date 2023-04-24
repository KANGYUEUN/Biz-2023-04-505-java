package com.callor.classes.exec.module;

public class ServiceE {
	public void score(int intKor, int intEng, int intMath) {
		int intTotal = intKor + intEng + intMath;
		float intAvg = (float) intTotal / 3;

		System.out.printf("국어: " + intKor);
		System.out.printf("영어: " + intEng);
		System.out.printf("수학: " + intMath);

		System.out.printf("총점: " + intTotal);
		System.out.printf("평균: " + intAvg);
	}
}
