package com.callor.system.exec;

public class StringC {

	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = new String("Korea");
		String str3 = "KOREA";
		
		// str1 문자열 변수와 str2 문자열 변수 ( 객체변수 ) 와 같은지 비교
		
		boolean bYes = str1==str2;
		// 비교하여 결과를 bYes 에 저장
		// 문자열 값의 비교는 equals() method 를 사용해야 함
		bYes = str1.equals(str2);
		bYes = str2.equals(str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1)); // true
		
		// equals() method 는 저장된 영문자의 대소문자를 
		// 서로 다른 문자열로 본다.
		bYes = str1.equals(str3);
		System.out.println(str1.equals(str3)); // false
		
		// 영문자 비교시 대소문자 구문 없이 비교 하고 싶을때
		// korea == KOREA
		// Korea == korea, kOREA == KOrea
		
		bYes = str1.equalsIgnoreCase(str3);
		System.out.println(bYes); // true
		
		str1 = "Republic of KOrea";
		str2 = "Republic of Korea";
		str3 = "Republic of       Korea";
		
		/*
		 * equalsIgnoreCase();
		 * 변수에 저장된 문자열의 배열은 일치하고 대소문자가 섞일땐 같은 값으로 보나
		 * 스페이스 바는 다르게 봄
		 */
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3)); // false
		System.out.println(str2.equalsIgnoreCase(str3)); // false
		
	}
}
