package com.callor.controller;

public class ControllerE {
	
	/*
	 * 2개의 정수형 인수를 전달받아 덧셈을 수행한후
	 * 		method 를 선언 할때 정수형 매개변수 2개가 필요
	 * 덧셈을 수행한후 
	 * 		결과는 int 형이다.
	 * 결과를 return 하는 method
	 * 		method 의 return type 이 int
	 */
	
	public static int add(int num1, int num2) {
		// 결과값 변수에 저장후 return
		// add() 입자에서 num1 num2 에는 어떤 정수값이 저장되어 있을것 이라는 믿음.
		int sum = num1 + num2;
		return sum; 
		
		// 연산과 동시에 결과를 리턴 하는데 "두변수에 저장된 값을 덧셈후 그 결과를 리턴"
		// return num1 + num2;
	}
	// add 것을 main에 호출
	public static void main(String[] args) {
		// add () 호출
		// 2개의 매개변수를 가지므로 정수 2개를  add 에 전달
		// add() method 를 실행 한후 결과값을 리턴 함
		// add 가 리턴할 값을 다른 변수에 저장한다.
		// 이것을 add() 를 실행한 결과를 다른 변수에 저장 하려면  
		// 그 변수의 type 이 add() 리턴 type 과 같아야 한다.
		// 이 변수를 int result 에 선언.
		// result 변수에는 add() 의 실행 결과가 담긴다.
	 int result =add(30,40);
	 System.out.println(result);
		
	}
}

	

