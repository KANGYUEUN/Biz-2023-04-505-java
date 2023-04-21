package com.callor.controller;

public class ControllerB {
	public static boolean prime() {
		int rndNum = (int)(Math.random()*50) +51;
		int index = 0;
		for(index = 2; index < rndNum; index++) {
			if(rndNum % index == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int i =0; i <100 ; i ++) {
			/*
			 * prime() method 를 실행하여 
			 * return 값을 yesPrime 변수에 저장
			 * 이때 서로의 return type 은 동일해야함.
			 */
			boolean yesPrime = prime();
			if(yesPrime) {
				System.out.println("소수");
			} else {
				System.err.println("소수가 아님");
			}
		}
		
		
	}
}
