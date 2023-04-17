package com.callor.var;

public class VarC {

	public static void main(String[] args) {
		// 선언 되지 않는 변수는 사용 불가능
		// 값을 저장하려며 변수는 최소한 선언 되어야 한다.
		int num1;
		int num2;
		num1 = 30;
		num1 = 40;
		
		// 선언만 되어있는 변수는 절대 읽을수 없기 때문에
		// 반드시 변수 값을 읽으려면 초기화 (값할당) 필요하다. // = 0;
		// 변수 할당값이 정해지지 않았으면 0 이라도 할당.
		int sum1 = 0;
		System.out.println(sum1);
	}
}
