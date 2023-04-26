package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWorkk {
	public static void main(String[] args) {
		// ScoreDto[] type 요소 10개를 갖는 배열 선언
		ScoreDto[] scores = new ScoreDto[10];

		// class type 의 배열 요소 전체를 객체 요소로 생성하기
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		ScoreServiceA scoreServiceA = new ScoreServiceA();
		// 학번입력부분
		scores[0].stNum = "0001";
		scores[1].stNum = "0002";
		scores[2].stNum = "0003";
		scores[3].stNum = "0004";
		scores[4].stNum = "0005";
		scores[5].stNum = "0006";
		scores[6].stNum = "0007";
		scores[7].stNum = "0008";
		scores[8].stNum = "0009";
		scores[9].stNum = "0010";

		// 이름입력부분
		scores[0].stName = "홍길동";
		scores[1].stName = "이몽룡";
		scores[2].stName = "성춘향";
		scores[3].stName = "장보고";
		scores[4].stName = "임꺽정";
		scores[5].stName = "김철수";
		scores[6].stName = "김희경";
		scores[7].stName = "이기동";
		scores[8].stName = "박철수";
		scores[9].stName = "한동후";

		// 국어,영어,수학 점수 입력 부분
		for (int i = 0; i < scores.length; i++) {
			scores[i].scKor = scoreServiceA.getScore();
			scores[i].scEng = scoreServiceA.getScore();
			scores[i].scMath = scoreServiceA.getScore();
		}

		// 라벨 출력부분
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));

		// 리스트 출력부분
		for (int i = 0; i < scores.length; i++) {
			scoreServiceA.scorePrint(scores[i]);
		}
		
		// 각 과목별 총점 합산 
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		for(int i = 0; i < scores.length; i++) {
			totalKor += scores[i].scKor;
			totalEng += scores[i].scEng;
			totalMath += scores[i].scMath;
		}
		
		// 각 과목별 총점 출력 & 전체 총점 출력
		System.out.println("-".repeat(60));
		scoreServiceA.scorTotalPrint(totalKor, totalEng, totalMath);
		System.out.println("=".repeat(60));
	}
}
