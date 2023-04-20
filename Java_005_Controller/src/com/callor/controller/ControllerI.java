package com.callor.controller;

public class ControllerI {
	
	public static boolean prime(int rndNum) {
		int index = 0;
		for(index = 2; index < rndNum; index++ ) {
			if(rndNum % index == 0) { 
				 break;
			}
		}
	
		boolean yesPrime = rndNum <= index;
		return yesPrime; 
	}
	
	/*
	 * Java 에서는 method 의 이름을 매개변수의 type 으로 본다.
	 * prime(int rndNum) 는 prime(int) 이름으로 선언
	 * prime()는 prime() 로 선언.
	 * 따라서 prime(int) 와 prime() 는 전혀 다른 method 로 인식 되며 이는 자바의 특징인 "중복선언" 이다.
	 * 
	 * 호출하는 곳에서
	 * prime(30) 이 호출되면 prime(int)가 실행되고 
	 * prime() 이 호출되면 prime() 가 실행된다.
	 */
	public static boolean prime() {
		int rndNum =(int)(Math.random()*50) +51;
		return prime(rndNum);
		
	}
	
	public static void main(String[] args) {
		for(int i =0; i <100; i ++) {
			int mainRndNum = (int)(Math.random()*50) + 51;
			if(prime(mainRndNum)) { 
				System.out.println(mainRndNum + "소수");
			} 
			if(prime()) {
				System.out.println("소수");				
			}
		}
	}
}
