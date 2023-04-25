package com.callor.classec;

public class ExecD {
	public static void main(String[] args) {
//		StudentDto 학생A = new StudentDto();
//		StudentDto 학생B = new StudentDto();
//		StudentDto 학생C = new StudentDto();
//		StudentDto 학생D = new StudentDto();
//		StudentDto 학생E = new StudentDto();
		
		int stKorScoreA = 100;
		int stKorScoreB = 90;
		int stKorScoreC = 80;
		int stKorScoreD = 70;
		int stKorScoreE = 60;
		
		int stKorTotal =  stKorScoreA + stKorScoreB +  stKorScoreC +  stKorScoreD +  stKorScoreE;
		float stKorFloat = (float)stKorTotal/ 5;
		
		System.out.println("5명의 국어점수 합계 : " + stKorTotal);
		System.out.println("5명의 국어점수 평균 : " + stKorFloat);
		
		
		
	}
}
