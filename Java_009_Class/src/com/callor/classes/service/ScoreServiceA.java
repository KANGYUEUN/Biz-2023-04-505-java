package com.callor.classes.service;

import com.callor.classes.model.ScoreDto;

public class ScoreServiceA {
	
	// 51~100까지 범위의 랜덤수를 만들어서 리턴하는 메서드
	public int getScore() {
		int score = (int)(Math.random()*50)+51;
		return score;
	}
	// ScoreDto type 매개변수를 통해 성적 정보 데이터 받아 출력.
	public void scorePrint( ScoreDto score) {
		System.out.printf( score.stNum + "\t");
		System.out.printf( score.stName + "\t");
		System.out.printf("%3d\t",score.scKor);
		System.out.printf("%3d\t",score.scEng);
		System.out.printf("%3d\t",score.scMath);
		
		System.out.printf("%3d\t",score.getTotal());
		System.out.printf("%5.2f\n",score.getAvg());
	}
	
	public void scorTotalPrint(int kor, int eng, int math) {
		System.out.printf(  "\t");
		System.out.printf(  "\t");
		System.out.printf("%3d\t",kor);
		System.out.printf("%3d\t",eng);
		System.out.printf("%3d\t",math);
		
		System.out.printf("%3d\n",kor + eng + math);
	//	System.out.printf("%5.2f\n",(float)/ kor + eng + math);
	}
}
