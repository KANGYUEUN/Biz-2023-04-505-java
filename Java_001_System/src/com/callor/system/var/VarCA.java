package com.callor.system.var;

public class VarCA {
	 public static void main(String[] args) {
		boolean bYes = true;
		int intNum1 = 30;
		int intYes1 = 0;
		
		/*
		 *  = 오른쪽의 연산식 결과에 따라서 
		 *  왼쪽의 변수를 맞는 타입으로 지정해야 한다.
		 *  왼쪽의 변수 타입은 미리 지정되어 있고 
		 *  지정된 타입에 맞는 결과를 저장해야 한다.
		 *  
		 *  intNum1 % 2 의 연산 최종 결과가 정수 0 or 1 이므로 
		 *  그 결과는 정수형으로 미리 선언된 intYes1 에만 저장 할수 있다.
		 *  
		 *  ~~~ == 0 의 연산 최종 결과는 불린 타입의 참 거짓이므로 
		 *  그 결과는 미리 선언된 bYes 에만 저장 할 수 있다.
		 */
		
		intYes1 = intNum1 % 2; // 0 or 1 로 결과값이 도출 ( 이 결과는 int에 보관됨)
		bYes = intNum1 % 2 == 0; // 이 결과의 값이 0으로 정확한가 == 0  
		
		
	}
}
