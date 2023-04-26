package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;


public class HomeWork {
	
	public static int getScore() {
		int score = (int)(Math.random()*50)+51;
		return score;
	}
	
	public static void main(String[] args) {
		// ScoreServiceA 클래스에 선언된 메서드 사용하기 위해 선언
		ScoreDto scoreDto = new ScoreDto();
		
		// 3명 학생의 성적정보를 저장할 객체변수 생성
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		ScoreDto 장보고 = new ScoreDto();
		ScoreDto 임꺽정 = new ScoreDto();
		ScoreDto 김철수 = new ScoreDto();
		ScoreDto 김희경 = new ScoreDto();
		ScoreDto 이기동 = new ScoreDto();
		ScoreDto 박철수 = new ScoreDto();
		ScoreDto 한동후 = new ScoreDto();
		
		// 홍길동 학생의 학번,이름, 과목점수 세팅
		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		홍길동.scKor = getScore();
		홍길동.scEng = getScore();
		홍길동.scMath = getScore();

		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		이몽룡.scKor = getScore();
		이몽룡.scEng = getScore();
		이몽룡.scMath = getScore();

		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		성춘향.scKor = getScore();
		성춘향.scEng = getScore();
		성춘향.scMath = getScore();
		
		장보고.stName = "장보고";
		장보고.stNum = "0004";
		장보고.scKor = getScore();
		장보고.scEng = getScore();
		장보고.scMath = getScore();
		
		임꺽정.stName = "임꺽정";
		임꺽정.stNum = "0005";
		임꺽정.scKor = getScore();
		임꺽정.scEng = getScore();
		임꺽정.scMath = getScore();
		
		김철수.stName = "김철수";
		김철수.stNum = "0006";
		김철수.scKor = getScore();
		김철수.scEng = getScore();
		김철수.scMath = getScore();
		
		김희경.stName = "김희경";
		김희경.stNum = "0007";
		김희경.scKor = getScore();
		김희경.scEng = getScore();
		김희경.scMath = getScore();
		
		이기동.stName = "이기동";
		이기동.stNum = "0008";
		이기동.scKor = getScore();
		이기동.scEng = getScore();
		이기동.scMath = getScore();
		
		박철수.stName = "박철수";
		박철수.stNum = "0009";
		박철수.scKor = getScore();
		박철수.scEng = getScore();
		박철수.scMath = getScore();
		
		한동후.stName = "한동후";
		한동후.stNum = "0010";
		한동후.scKor = getScore();
		한동후.scEng = getScore();
		한동후.scMath = getScore();
	
		
		// 성적 표 제목 출력 
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));

		// 각 학생의 성적정보 출력
		scoreDto.scorePrint(홍길동);
		scoreDto.scorePrint(성춘향);
		scoreDto.scorePrint(이몽룡);
		scoreDto.scorePrint(임꺽정);
		scoreDto.scorePrint(김철수);
		scoreDto.scorePrint(김희경);
		scoreDto.scorePrint(이기동);
		scoreDto.scorePrint(박철수);
		scoreDto.scorePrint(한동후);
		
		
		System.out.println("-".repeat(60));
		System.out.print("\t\t");
		System.out.print(홍길동.scKor + 성춘향.scKor + 이몽룡.scKor + 임꺽정.scKor + 김철수.scKor+ 김희경.scKor+ 이기동.scKor + 박철수.scKor + 한동후.scKor + "\t");
		System.out.printf(홍길동.scEng + 성춘향.scEng + 이몽룡.scEng + "\t");
		System.out.printf(홍길동.scMath + 성춘향.scMath + 이몽룡.scMath + "\t");
		System.out.printf(홍길동.getTotal() + 성춘향.getTotal() + 이몽룡.getTotal() + "\n");
		System.out.println("=".repeat(60));
		

	}
}
