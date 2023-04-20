package com.callor.controller;

public class ControllerG {
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
	 * 
	 * prime() method {} 내에서 선언했던 rndNum 변수를
	 * 매개변수(parameter) 로 변경하였다.
	 * 매개변수는 스스로 초기화 불가능 하며 
	 * 누군가 prime() method 를 호출하며 값을 전달해 주어야 만 
	 * 그 값으로 초기화 된다.
	 * prime(int rndNum = 0) 과 같은 코드 사용불가
	 * 
	 * main() 에서 prime(55) 같은 코드가 실행 되어야 매개변수 값이 초기화 된다.
	 */
	
	public static boolean prime(int rndNum) { // 프라임 메서드 안에 선언된 변수 rndNum = "매개변수" ( 스스로 초기화 불가)
//		int rndNum = (int)(Math.random()*50) + 51;
		int index = 0;
		for(index = 2; index < rndNum; index++ ) {
			if(rndNum % index == 0) { // 이 값은 소수가 아니다 
				// break;
				return false; // 소수가 아니면 강제로 리턴 실행 하지 않음 (좋은 코드는 아님)
			}
		}
//		if(rndNum <= index ) {
//			System.out.println(rndNum + "는 소수");
//		} else {
//			System.err.println(rndNum + "는 소수가 아님");
//		}
	
		boolean yesPrime = rndNum <= index;
		return yesPrime; // void 가 아니면 return 명령문이 메서드 코드 블럭 어딘가에 필수 (메서드가 끝날때)
		
	}
	
	public static void main(String[] args) {
		for(int i =0; i <100; i ++) {
			
			// main 에서 랜덤수 만들고
			int mainRndNum = (int)(Math.random()*50) + 51;
			
			// prime() 메서드 에게 "전달해 주기" ( = 인수)
			// prime() method 에게 mainRndNum 변수에 저장된 값(51~100난수)을 전달해 주는것 
			//  이때 mainRndNum 는 'argument' 라 한다.
			if(prime(mainRndNum)) { // prime 이 소수이면 true 아니면 false (메서드가 변수처럼 사용됨)
				System.out.println("소수");
			} else {
				System.err.println("소수 아님");
			}
		}
	}
}
