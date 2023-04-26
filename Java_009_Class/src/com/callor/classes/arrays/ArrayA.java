package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;

public class ArrayA {

	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();

		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		홍길동.scKor = 89;
		홍길동.scEng = 70;
		홍길동.scMath = 90;

		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		이몽룡.scKor = 88;
		이몽룡.scEng = 87;
		이몽룡.scMath = 77;

		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		성춘향.scKor = 99;
		성춘향.scEng = 79;
		성춘향.scMath = 69;

		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));

		System.out.println(홍길동.stNum + "\t");
		System.out.println(홍길동.stName + "\t");
		/*
		 * %3d : 3자리의 자릿수를 확보 오른쪽으로 정렬
		 */
		System.out.printf("%3d\t", 홍길동.scKor);
		System.out.printf("%s  %s  %d  %d  %d  %d  %f", 홍길동.stNum, 홍길동.stName, 홍길동.scKor, 홍길동.scEng, 홍길동.scMath,
				홍길동.getTotal(), 홍길동.getAvg());

	}
}
