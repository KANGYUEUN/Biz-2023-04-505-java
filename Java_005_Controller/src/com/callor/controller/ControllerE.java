package com.callor.controller;

public class ControllerE {
	
	/*
	 * method 의 선언
	 * 마치 java의 명령문을 새로 만드는 것과 같다.
	 * 규칙에 따라 이름 () {} 를 만들고 
	 * {}내에 원하는 코드를 작성한다.
	 */
	
	public static void prime() {
		int rndNum = (int)(Math.random()*50) + 51;
		int index = 0;
		for(index = 2; index < rndNum; index++ ) {
			if(rndNum % index == 0) {
				break;
			}
		}
		if(rndNum <= index ) {
			System.out.println(rndNum + "는 소수");
		} 	
		//return; 리턴 명령문은 옵션이 없는 경우 생략가능
	}
	
	public static void main(String[] args) {
		for(int i =0; i <100; i ++) {
			// 프라임()메서드의 {} 내의 코드를 실행해 달라는 것
			//  prime() method 를 호출 한다.
			prime();
		}
	}
}
