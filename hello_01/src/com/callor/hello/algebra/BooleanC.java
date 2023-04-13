package com.callor.hello.algebra;

public class BooleanC {
	
	public static void main(String[] args) {
		System.out.println( 33 % 2 == 0);
		
		// 삼항연산자
		// ?의 왼쪽 연산의 결과가 
		// true 이면 "응" 출력
		// false 면 "아니" 를 출력한다.
		System.out.println( 33 % 2 == 0 ? "응" : "아니" );
		System.out.println( 33 % 2 == 0 ? 33 / 2 : 33 * 2);
		
		System.out.println( 33 % 2 == 0 ? "짝수" : "홀수");
		
		
	
	
	}
}
