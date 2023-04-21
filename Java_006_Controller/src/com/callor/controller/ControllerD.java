package com.callor.controller;

public class ControllerD {
	public static int prime() {
		int rndNum = (int)(Math.random()*50) +51;
		for(int i = 2 ; i <rndNum; i ++) {
			if(rndNum % i ==0) {
				return 0;
			}
		}
		return rndNum;
	}
	
	public static void main(String[] args) {
		int sumPrime = 0;
		int numPrime = 0;
		for(int i = 0; i < 100; i ++) {
			int resultNum = prime();
			if(resultNum > 0) {
				numPrime ++;
				sumPrime += numPrime;
			} 
		} // end for
		System.out.printf("소수의 개수 : %d,  소수의 합 : %d",numPrime, sumPrime);
//		System.out.println(numPrime + "  = 소수의 개수\n");
//		System.out.println(sumPrime + "  = 소수의 합");		
	}	
	
}
