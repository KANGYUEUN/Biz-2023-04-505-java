package com.callor.system.var;

public class VarBA {
	public static void main(String[] args) {

		int intNum1 = 0; // 작은 정수
		long longNum1 = 0; // 큰 정수

		float floatNum1 = 0.0f; // 단정도 실수
		double douNum1 = 0.0; // 배정도 실수 
		
		
		//데이터의 형변환(type cast, convert)
		
		// int형 데이터를 long 형 변수에 저장
		longNum1 = intNum1; // 자동형 변환
		// long형 데이터를 int 형 변수에 저장
		intNum1 = (int)longNum1; // 강제형 변환
		
		// double형 데이터를 float 형 변수에 저장
		floatNum1 = (float)douNum1; //강제형 변환
		// float형 데이터를 double 형 변수에 저장
		douNum1 = floatNum1; // 자동형 변환
		
		
		
		
		
		
		
	}
}
