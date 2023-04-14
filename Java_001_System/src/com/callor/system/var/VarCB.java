package com.callor.system.var;

public class VarCB {
	public static void main(String[] args) {
		
		int intNum1 = 30;
		float floatNum1 = 25.0f;
		
		// intNum1 변수에 정수 20을 더하여 다른 변수에 보관하고자 함 
		// 이때 결과를 보관할 변수 intResult 를 선언하고 결과를 보관함.
		
		int intResult = 0;
		intResult = intNum1 + 20;
		
		/*
		 * 이 경우 floatNum1 변수를 선언 하였는데 사용할 일이 없다.
		 * 그래서 결과를 floatNum1 에 저장한다.
		 * folatNum1 에 결과가 저장 되더라도 
		 * 원래 결과와 저장된 변수의 type 이 달라서 
		 * 코드가 실행되는 과정에서 문제 발생 할 수 있다.
		 * 때문에 결과에 정확히 일치한 type 의 변수에 결과를 보관하는 것이 좋다.
		 */
		
		floatNum1 = intNum1 + 20;
		
		/* 
		 * intNum1 % 2 의 결과는 정수형이다
		 * 값은 중요하지않음 
		 * 반드시 결과를 저장할 변수의 타입은 정수형 이어야 한다.
		 */
		int intYes1 = intNum1 % 2;
		
		/* 
		 * intNum1 % 2 == 0 연산의 최종 결과는
		 * 불린 타입이며 값은 중요 하지 않다. ( t or f)
		 * 결과값을 저장하려면 반드시 boolean type 변수에 저장해야한다.
		 */
		boolean bYes = intNum1 % 2 == 0; //  type 이 같아야 명령이 수행 
		

		// 숫자 <-> 불린 간에는 변환 불가능 
		// intYes1 = intNum1 % 2 == 0;
		// bYes = intNum1 % 2;
		
		
	}
}
