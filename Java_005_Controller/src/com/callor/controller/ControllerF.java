package com.callor.controller;

public class ControllerF {
	/*
	 * prime() method의 코드를 수정하여
	 * 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경하시오.
	 * 
	 * void type의 prime() method 를
	 * boolean type 프라임 메서드로 변경
	 * 
	 * 메서드 선언시 void type 이외의 type 으로 선언하면
	 * 메서드 {} 내에서 반드시 '리턴' 명령문 필요.
	 * 
	 */
	public static boolean prime() {
		int rndNum = (int)(Math.random()*50) + 51;
		int index = 0;
		for(index = 2; index < rndNum; index++ ) {
			if(rndNum % index == 0) {
				break;
			}
		}
//		if(rndNum <= index ) {
//			System.out.println(rndNum + "는 소수");
//		} else {
//			System.err.println(rndNum + "는 소수가 아님");
//		}
	
		boolean yesPrime = rndNum <= index;
		return yesPrime; // void 가 아니면 return 명령문이 메서드 코드 블럭 어딘가에 필수
		
	}
	
	public static void main(String[] args) {
		for(int i =0; i <100; i ++) {
			if(prime()) { // prime 이 소수이면 true 아니면 false 메서드가 변수처럼 사용됨
				System.out.println("소수");
			} else {
				System.err.println("소수 아님");
			}
		}
	}
}
