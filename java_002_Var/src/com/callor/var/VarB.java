package com.callor.var;

public class VarB {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		num1 = 30;
		num2 = 40;
		
		// 변수에 어떤 값을 저장, 할당, 대입 하려면 
		// 반드시 먼저 선언 되어야 한다.
		
		// sum1 선언 하고 두 변수의 덧셈 결과 저장.
		int sum1 = 0;
		sum1 = num1 + num2;
		
		// sum2 선언과 동시에 두변수의 덧셈결과 저장.
		int sum2 = num1 + num2;
		System.out.println(sum1);
		
		/*
		 * num1 + num2 연산의 결과를 변수에 저장하려고 할때
		 * 이때 num1,2 변수의 type 은 int type 이다.
		 * 이 말은 1,2 변수에 저장된 데이터는 int 타입 이라는 것을 보증함.
		 * 결과적으로 int 타입끼리의 연산이 되고 결과도 int type 이된다.
		 * 따라서 결과가 저장된 sum1 변수 타입도 int type 이다.
		 * 
		 * long형 or 실수 형 변수에도 저장 가능하나 
		 * 여기에서는 메모리 낭비가 있을수 있다.
		 */
		
	}
}
