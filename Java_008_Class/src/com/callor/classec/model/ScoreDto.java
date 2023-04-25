package com.callor.classec.model;

/*
 * 성적처리를 할때
 * 학생이름, 각 과목의 점수를 속성으로 표함하는 데이터 객체를 모델링(Dto class) 하는것.
 * :"Dto 클래스" : 데이터 객체를 모델링한 java class
 * 
 * < 모델링 단계 >
 * 1. 추상화 단계
 * 성적처리(정보기기를 사용하여 성적 처리를 하기)
 * 성적처리를 수행하기 위하여 "꼭 필요한 데이터 요소"가 무엇이 있을까?
 * 
 * 2. 클래스 모델링(= Dto 클래스 모델링)
 * 추상화된 각 요소를 클래스로 만드는 과정
 * 즉, 클래스에 변수를 선언하는 것.
 * 
 * 7 개 과목의 성적 처리 
 * 학번 학생 이름 포함 되어야 함.
 */
public class ScoreDto {

	// 성적처리에 학생 정보 요소 필요 (클래스 레벨 변수)
	public String num; //학번
	public String name; //이름
	
	// 성적처리에 필요한 7개 과목 요소 선언 (변수로 선언)
	public int kor;
	public int eng;
	public int math;
	public int history;
	public int music;
	public int art;
	public int play;
	
	public int getTotal( ) {
		int total = this.kor;
		total += this.eng;
		total += this.math;
		total += this.history;
		total += this.music;
		total += this.art;
		total += this.play;
		return total; // 점수들의 총합
		
	}
	
	public float getAvg() {
		int total = this.getTotal();
		float avg = (float)total/7;
		return avg; 
		
	}
	
	
	
	
}
