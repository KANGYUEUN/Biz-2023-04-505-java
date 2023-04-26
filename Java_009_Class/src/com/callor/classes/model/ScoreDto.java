package com.callor.classes.model;
/*
 * "모델링"
 * DB, 다량의 데이터를 정보처리에서 활용하기 위한 방법  
 * 필요한 데이터의 필수 속성을 추출하는 '추상화'실시하고 
 * 추상화된 데이터를 실제 정보처리에서 사용하기 위해
 * 클래스를 디자인 한다.
 * 
 * 클래스중 데이터와 밀접한 연관이 있는 클래스를  Java 에서는 model Class
 * data Class 라고 한다.
 * 이러한 클래스는 ~.model package 를 생성하고 클래스를 저장한다.
 * 
 * 성적 처리 위해 model Class 생성
 * 학번,이름, 국어,영어,수학 점수를 저장할 변수 선언
 * 총점, 평균을 계산 하여 return 하는 method 를 선언
 */
public class ScoreDto {

	public String stNum;
	public String stName;
	
	public int scKor;
	public int scEng;
	public int scMath;
	
	
	/*
	 *  ' this ' 변수
	 *  현재 클래스에 선언된 변수
	 *  
	 *  this : 클래스를 객채 변수로 선언하면 객체변수 자체를 가리키는 키워드
	 */
	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		
		return total;
	}
	
	public float getAvg() {
		float avg =(float)this.getTotal()/3;
		return avg;
	}
	
	public void scorePrint( ScoreDto score) {
		System.out.printf( score.stNum + "\t");
		System.out.printf( score.stName + "\t");
		System.out.printf("%3d\t",score.scKor);
		System.out.printf("%3d\t",score.scEng);
		System.out.printf("%3d\t",score.scMath);
		
		System.out.printf("%3d\t",score.getTotal());
		System.out.printf("%5.2f\n",score.getAvg());
	}
}
