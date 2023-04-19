package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++) {
			int rndNum = (int)(Math.random() * 50) + 51;
//			if(rndNum % 2 == 0 ) {
//				System.out.println(rndNum + "짝수");
//			} else  {
			// System.err.println(rndNum + "짝수아님");
			
			if(rndNum % 2 == 0 ) {
				System.out.println(rndNum + "짝수");
			} else if(rndNum % 2 == 1 ) {
				System.err.println(rndNum + "홀수");
			
			}
		}
	}
}
