package com.callor.controller.var;

public class VarE {
	public static void main(String[] args) {
		String str = "Republic of Korea";
		String nation = "";
		// str 에 저장된 문자열 을 12번째 에서 잘라 nation 변수에 저장
		nation = str.substring(12); 
		System.out.println(nation); // Korea 출력
		
		// str 에 저장된 문자열을 9에서 자르고 11번째에서 잘라 그사이 출력
		System.out.println(str.substring(9,11)); // of 출력
		
	}
}
