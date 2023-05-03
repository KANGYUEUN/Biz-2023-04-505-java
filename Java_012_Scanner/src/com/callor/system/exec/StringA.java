package com.callor.system.exec;

public class StringA {

	public static void main(String[] args) {
		
		// 문자열 변수 
		/*
		 * 일반적인 변수(primitive variable) : int float double boolean char
		 * 이 변수들은 변수를 선언하는 키어드가 모두 소문자 
		 * 이 키워드는 단지 데이터를 저장하는 공간인 변수를 선언하는 용도 이다.
		 * 변수의 형(type) 를 강제 변환 하는 용도로 만 사용된다. = (int)변수
		 * 
		 * 문자열 변수 는 일반적인 변수가 아니라 
		 * "클래스 타입" 이다.
		 * class type 으로 생성된 변수는 여러가지 기능(method) 을 많이 포함 하고 있다.
		 * 
		 */
		String str1 = "Korea";
		System.out.println(str1.substring(3));
		
		//String class type 의 변수 생성하기
		String str2 = "Korea"; // 일반적인 방법
		String str3 = new String("Korea"); // 개체방식 방법
		
		System.out.println("STR2:"+str2);
		System.out.println("STR3:"+str3);
		
		boolean bYes = str2 ==str3;
		System.out.println(bYes);
	}
}
