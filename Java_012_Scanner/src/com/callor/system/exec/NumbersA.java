package com.callor.system.exec;

public class NumbersA {

	public static void main(String[] args) {
		
		// 문자열 형 숫자 (데이터 타입이 String)
		// 덧셈(연결) 연산만 가능 기타 4칙 연산 불가.
		// 숫자로보이나 실제 데이터는 문자열임 
		String strNum1 = "30";
		String strNum2 = "30.0";
		String strNum3 = "30+40";
		
		
		// 문자열형 숫자를 4칙 연산이 가능한 숫자로 변환하기
		int num1 = Integer.valueOf(strNum1);
		float num2 = Float.valueOf(strNum2);
		
		/*
		 * 문자열형 숫자를 4칙 연산이 가능한 숫자로 변환하기 위해서는
		 * 숫자형 문자열 외에 어떠한 문자열도 포함 불가 하다. (주석 처리한 부분)
		 */
		System.out.println(Integer.valueOf("30"));
	//	System.out.println(Integer.valueOf(" 30"));
	//	System.out.println(Integer.valueOf("30 "));
	//	System.out.println(Integer.valueOf("A30"));
	//	System.out.println(Integer.valueOf("30A"));
		//int num3 = Integer.valueOf(strNum3);
		
		System.out.println(num1 + num2);
		//System.out.println(num1 + num3);
	}
}
