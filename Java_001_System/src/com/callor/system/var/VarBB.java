package com.callor.system.var;

public class VarBB {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		intNum1 = 10;
		floatNum1 = intNum1 + 10;
		floatNum1 = floatNum1 + 1.2f;
		System.out.println(floatNum1); // 21.2f
		
		floatNum1 = floatNum1 + 0.5f;
		System.out.println(floatNum1); // 21.7f
		
		// java 에서 float 를 int 로 강제형 변환할때 소수점 이하는 무조건 버린다.
		intNum1 = (int)floatNum1;
		System.out.println(intNum1); // 21
		
		
		
		
		
		
		
	}
}
