package com.callor.controller;

public class ControllerA {
	public static void main(String[] args) {
		/*
		 * 큰 실수형 double 는  douNum 변수 선언
		 * Math.random()  가 만들어준 값으로 초기화 된다.
		 */
		double douNum = Math.random();
		// douNum = douNum * 50;
		douNum *= 50; //위와 같다 
		
		/*
		 * 정수형 intNum 변수를 선언하고 
		 * douNum 값을 (int) 붙여 정수형으로 변환후 
		 * 결과 값으로 intNum 변수를 초기화 하였다.
		 */
		int intNum = (int)douNum;
		intNum += 51;
		
		/* 
		 * int type(정수형) runNum 변수 를 선언
		 * 51~100 까지 임의로 생성된 랜덤수로 rndNum 변수를 초기화 하였다.
		 */
		int rndNum = (int)(Math.random() * 50) + 51;
		
		// rndNum 변수에 저장된 값을 읽어 출력
		// 이는 위의 식을 한줄로 정리하여 데이터를 정리함과 동시에 가독성을 높힌것.
		System.out.println(rndNum);
		
	}
}
