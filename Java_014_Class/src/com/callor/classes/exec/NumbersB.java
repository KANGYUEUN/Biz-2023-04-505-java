package com.callor.classes.exec;

public class NumbersB {

	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		
		System.out.println(strNum1 + strNum2);
		
		// 문자열형 숫자를 4칙연산이 가능한 정수형 숫자로 변환 시키는 방법
		int intNum1 = Integer.parseInt(strNum1);
		Integer intNum2 = Integer.valueOf(strNum2);
		int intNum3 = Integer.valueOf(intNum1);
		
		/*
		 * " 문자열형 숫자를 숫자형으로 바꾸기 "
		 * 두가지 방법 method 가 있다.
		 * Integer.parseInt(), Float.parseFliot() : 문자열형 숫자를 primitive type 숫자로 변환
		 * Integer.valueOf(), Float.valueOf() : 문자열형 숫자를 참조형 숫자로 변환
		 * 		만약 변수의 타입이 primitive 인 경우
		 * 		이 method 는 데이터를 언박싱 하는 절차가 추가 된다
		 * 		일부에서는 성능상 이슈가 있다고 하나 크게 문제 안된다.
		 * 
		 * 문자열형 숫자를 실제 숫자로 바꿀 때에는 Type.valueOf() 를 사용핻 큰 문제가 없다.
		 * 
		 */
		float floatNum1 = Float.parseFloat("30.0");
		Float floatNum2 = Float.valueOf("30.0");
		
		System.out.println(intNum1 + intNum2);
				
		}
}
