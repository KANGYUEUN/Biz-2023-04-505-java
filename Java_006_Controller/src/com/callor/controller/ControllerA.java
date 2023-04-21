package com.callor.controller;

public class ControllerA {
	/*
	 * java.exe 도구가 ControllerA. class 파일을 읽어서
	 * 메모리에 load 하고 제일 먼저 호출하는 method()
	 * 시작점 메서드, 진입점 메서드 라고 한다.
	 */
	public static void main(String[] args) {
		
		// void return type 이여서 단독 사용가능
		prime();
		
		// prime() 는 리턴타입이 void 이여서 다른 명령문에 포함되거나 변수의 값을 생성할수 없다.
		// = 불가능 if(prime()) {} 
		// 			boolean yesPrime;
		// 			yesPrime = prime();
		
	} // end main
	
	/*
	 * 매개변수도 없고, return type 이 void(없다) 
	 * 인 prime() method 선언
	 */
	public static void prime() {
		int rndNum = (int)(Math.random()*50) +51;
		int index = 0;
		for(index =2; index < rndNum ; index++) {
			if(rndNum % index == 0) {
				break;
			}
		}
		if(index >=rndNum ) {
			System.out.println(rndNum + "는 소수");
		} else {
			System.out.println(rndNum + "는 소수가 아님");
		}
		
	}
	
}
