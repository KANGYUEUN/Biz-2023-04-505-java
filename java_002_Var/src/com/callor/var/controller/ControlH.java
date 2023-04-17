package com.callor.var.controller;

public class ControlH {
	public static void main(String[] args) {
		
		int num = 1;
		for( ; num < 10 ; ) {
			System.out.println("안녕하세요" + (num++) );
		}
		
		int index = 1;
		// index < 10 조건이 true 인 동안만 {} 내부 코드 실행.
		for( ; index < 10; ) {
			System.out.printf("%d x %d = %d\n",5,index,5*index++);
			
			
		}

	}
}
