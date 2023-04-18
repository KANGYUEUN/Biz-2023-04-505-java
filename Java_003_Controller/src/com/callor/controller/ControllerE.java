package com.callor.controller;

public class ControllerE {
	public static void main(String[] args) {
		int intKor = 100;
		int intEng = 98;
		int intMath = 88;
		
		int intTotal = intKor; 
		intTotal += intEng;
		intTotal += intMath;
		
		//소수점 이하 평균 오차를 찾기 위해 정수를 실수로 강제형변환.
		float floatAvg =(float)intTotal / 3f;
		
		System.out.println("===================");
		System.out.printf("국어 : %3d\n" , intKor );
		System.out.printf("영어 : %3d\n" , intEng );
		System.out.printf("수학 : %3d\n" , intMath );
		System.out.println("-------------------");
		System.out.printf("총점 : %d, 평균 : %5.2f\n" , intTotal, floatAvg);
		
	}
}
