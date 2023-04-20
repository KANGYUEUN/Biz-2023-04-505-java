package com.callor.controller;

public class ControllerC {
	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*50) +51;
		int index;
		for(index = 2 ; index < rndNum; index++) {
			if(rndNum % index == 0) {
				//System.out.println(rndNum + "는 소수아님");
				break;
			}
		}
		System.out.printf("rnd %d , index %d\n" ,rndNum, index);
		
		/*
		 * for() 반복문에서 최대값(rndNum)과 index의 관계
		 * 최대값표현 index < 최대값 or index <= 최대값으로 표현
		 * 이는 for() 반복문이 몇번 반복될 것인가 결정짓는 연산식
		 * 
		 * for() 반복문 반복실행 중단 : 'break'
		 * 모든 조건대로 반복문이 실행 될수 있다.
		 * 
		 * for() 반복문이 실행 완료 되면 
		 * rndNum <= index 조건이 true 가 된다.
		 * 이 조건을 검사하려면 index 변수를 for() 이전에 선언한다.;
		 */
		
		// >의 반대 <=
		if(rndNum <= index) {
			System.out.println(rndNum + "는 소수");
		} else {
			System.out.println(rndNum + "는 소수 아님");
		}
	}
}
