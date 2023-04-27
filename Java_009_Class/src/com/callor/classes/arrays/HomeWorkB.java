package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWorkB {
	public static void main(String[] args) {
		
		// 문자열 타입의 배열 10개 선언
		String[] names1 = new String[10];
		
		// 각 문자열 배열의 요소에 이름을 저장하기
		// DB 로부터 가져온 데이터, 키보드 증으로 프로젝트가 
		// 실행되는 중에 생성된 데이터를 배열에 저장하는 방법.
		
//		names1[0] = "홍길동";
//		names1[1] = "이몽룡";
//		names1[2] = "성춘향";
//		names1[3] = "장보고";
//		names1[4] = "임꺽정";
//		names1[5] = "김철수";
//		names1[6] = "김희경";
//		names1[7] = "이기동";
//		names1[8] = "박철수";
//		names1[9] = "한동후";
		
		// = {}; 에 표시된 요소 들을 기본 값으로 하여 
		// nams 배열 생성하기
		// 배열에 저장될 요소 값이 미리 확정된 경우에 사용.
		String[] names = {
				"홍길동","이몽룡","장보고",
				"성춘향","임꺽정","김철수","김희경",
				"이기동","박철수","한동후"
		};
	
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index] + "\t");
		}
		
		System.out.println();
		
		// 학생이름 배열의 요소 개수 만큼 scores 배열을 생성하고자 함.
		ScoreDto[] scores = new ScoreDto[names.length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		ScoreServiceA scoreServiceA = new ScoreServiceA();
		
//		scores[0].stNum = "0001";
//		scores[1].stNum = "0002";
//		scores[2].stNum = "0003";
//		scores[3].stNum = "0004";
//		scores[4].stNum = "0005";
//		scores[5].stNum = "0006";
//		scores[6].stNum = "0007";
//		scores[7].stNum = "0008";
//		scores[8].stNum = "0009";
//		scores[9].stNum = "0010";
//
//		scores[0].stName = "홍길동";
//		scores[1].stName = "이몽룡";
//		scores[2].stName = "성춘향";
//		scores[3].stName = "장보고";
//		scores[4].stName = "임꺽정";
//		scores[5].stName = "김철수";
//		scores[6].stName = "김희경";
//		scores[7].stName = "이기동";
//		scores[8].stName = "박철수";
//		scores[9].stName = "한동후";

		for (int index = 0; index < scores.length; index++) {
			
			// names 배열에 저장된 학생이름을 순서대로
			// cores 배여 요소의 stName 속성에 복사하기
			scores[index].stName = names[index];
			
			// scores[index].stNum = (index +1) + "";
			scores[index].stNum = String.format("S%04d",(index +1));
			
			// 각 과목의 과목 성적을 랜덤수 샘플 데이터로 세팅하기
			scores[index].scKor = scoreServiceA.getScore();
			scores[index].scEng = scoreServiceA.getScore();
			scores[index].scMath = scoreServiceA.getScore();
		}
		
		for (int i = 0; i < scores.length; i++) {
			scoreServiceA.scorePrint(scores[i]);
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
