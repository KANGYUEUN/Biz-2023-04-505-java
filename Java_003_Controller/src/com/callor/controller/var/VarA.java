package com.callor.controller.var;

public class VarA {
	public static void main(String[] args) {
		
	for(int i = 0; i < 100 ; i ++) {
		int intScore = (int)(Math.random() * 50) + 51;
		
//		if(intScore < 51 || intScore > 100) {
		if(!(intScore >= 51 && intScore <= 100)) {	
			System.out.println(intScore);	
		}
		else {
			System.out.println(intScore + "E");
		}
	}
	System.out.println("Test End");
	
		// num2 의 최종 값 확인 후 왜 이유?
		// 
		int num1 = 100;
		int num2 = 100;
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
		}
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
		}
		System.out.println(num2);
		
		
	}
}
