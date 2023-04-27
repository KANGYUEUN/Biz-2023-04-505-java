package com.callor.score;

import com.callor.score.ScoreDto;

public class ScoreService {
	
	// 각 학생별로 각 과목의 성적 
	// 성적 랜덤수 정의하고 생성
	public int getScore() {
		int score = (int)(Math.random()*50)+51;
		return score;
	}
	
	// 출력될 각 성적 정보들을 ScorDto 에서 받기
	// 점수 출력
	public void scorePrint(ScoreDto score) {
		System.out.printf( score.stNum + "\t");
		System.out.printf("%3d\t",score.scKor);
		System.out.printf("%3d\t",score.scEng);
		System.out.printf("%3d\t",score.scMath);
		System.out.printf("%3d\t",score.scMusic);
		System.out.printf("%3d\t",score.scArt);
		
		System.out.printf("%3d\t",score.getTotal());
		System.out.printf("%5.2f\n",score.getAvg());
		
	}

	public void scoreTotalPrint(int scKor, int scEng, int scMath, int scMusic, int scArt) {
		System.out.printf( "총점" + "\t");
		System.out.printf("%3d\t",scKor);
		System.out.printf("%3d\t",scEng);
		System.out.printf("%3d\t",scMath);
		System.out.printf("%3d\t",scMusic);
		System.out.printf("%3d\t",scArt);
		
		System.out.printf("%3d\n",scKor + scEng + scMath + scMusic + scArt);
		// System.out.printf("%5.2f\n",(float)/ scKor + scEng + scMath + scMusic + scArt);
	}
	
	public void scoreTotalAvg(int scKor, int scEng, int scMath, int scMusic, int scArt, int totalAvg ) {
		
		System.out.printf("평균"+"\t");
		System.out.printf("%5.2f\t",(float)scKor/10);
		System.out.printf("%5.2f\t",(float)scEng/10);
		System.out.printf("%5.2f\t",(float)scMath/10);
		System.out.printf("%5.2f\t",(float)scMusic/10);
		System.out.printf("%5.2f\t",(float)scArt/10);
		System.out.printf("\t");
		
		System.out.printf("%5.2f\t",(float)totalAvg / 5);
		System.out.println();
		
	}
}
