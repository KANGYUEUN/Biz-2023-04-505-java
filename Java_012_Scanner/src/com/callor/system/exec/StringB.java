package com.callor.system.exec;

public class StringB {
	
	/*
	 * 문자열 변수는 생성하는 방법 2가지가 있다.
	 * 일반적인 방법 : String str1 = "Korea";
	 * 클래스 객체 타입으로 생성하는 방법 : String str3 = new String("Korea");
	 * 
	 * 문자열 변수는 생성하는 방법에 따라 같은값 비교 ( ==) 의 결과가 다르게 나타 나기때문에 
	 * 따라서 문자열 변수는 절대 == 로 비교로 하면 안된다.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = "Korea";
		String str3 = new String("Korea");
		String str4 = new String("Korea");
		
		
		String str5 = "KOREA";
		
		System.out.printf("%s,%s,%s,%s,%s\n", str1,str2,str3,str4,str5);
		// 문자열 비교에는 == 두개를 사용하면 안된다.
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4); // false
		System.out.println(str1==str4);
		
		
	}
}
