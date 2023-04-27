package com.callor.score;

import com.callor.score.ScoreDto;

public class OneDayW {

	public static void main(String[] args) {

		// 학생수 10명 배열 선언
		ScoreDto[] nums = new ScoreDto[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new ScoreDto();
		}

		ScoreDto[] scores = new ScoreDto[nums.length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		ScoreService scoreService = new ScoreService();

		for (int index = 0; index < scores.length; index++) {
			scores[index].stNum = String.format("23%03d", (index + 1));

			scores[index].scKor = scoreService.getScore();
			scores[index].scEng = scoreService.getScore();
			scores[index].scMath = scoreService.getScore();
			scores[index].scMusic = scoreService.getScore();
			scores[index].scArt = scoreService.getScore();
		}

		// 라벨 출력부분
		System.out.println("=".repeat(65));
		System.out.println("\t\t   " + "*" + "한울 고교 성적 리스트" + "*");
		System.out.println("=".repeat(65));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(65));

		// 리스트 출력부분
		for (int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}

		// 각 과목별 총점 합산
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		int totalMusic = 0;
		int totalArt = 0;
		for (int i = 0; i < scores.length; i++) {
			totalKor += scores[i].scKor;
			totalEng += scores[i].scEng;
			totalMath += scores[i].scMath;
			totalMusic += scores[i].scMusic;
			totalArt += scores[i].scArt;
		}
		// 각 과목별 평균 합산
		int avgKor = 0;
		int avgEng = 0;
		int avgMath = 0;
		int avgMusic = 0;
		int avgArt = 0;
		for (int i = 0; i < scores.length; i++) {
			avgKor += scores[i].scKor;
			avgEng += scores[i].scEng;
			avgMath += scores[i].scMath;
			avgMusic += scores[i].scMusic;
			avgArt += scores[i].scArt;
		}
		
		int totalAvg = 0;
		totalAvg = avgKor + avgEng + avgMath + avgMusic + avgArt;

		
		// 각 과목별 총점,전체 총점 출력 & 각 과목의 평균, 평균의 평균 출력.
		System.out.println("-".repeat(65));
		scoreService.scoreTotalPrint(totalKor, totalEng, totalMath, totalMusic, totalArt);
		scoreService.scoreTotalAvg(avgKor, avgEng, avgMath, avgMusic, avgArt, totalAvg);
		System.out.println("=".repeat(65));

	}

}
