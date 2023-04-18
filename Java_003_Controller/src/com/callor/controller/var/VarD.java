package com.callor.controller.var;

public class VarD {
	public static void main(String[] args) {
		
		/*
		 * String 은 일반적인 변수를 생성하는 키워드가 아닌
		 * 클래스 이다.
		 * Class 를 사용하여 만든 변수를 인스턴스 or 오브젝트 라고 한다.
		 */
		
		String str1 = "Republic";
		String str2 = "of";
		String str3 = "Korea";
		
		int num1 = 30;
		
		System.out.printf("%s %s %s\n",str1,str2,str3);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
	}
}
