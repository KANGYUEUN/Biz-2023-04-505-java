package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {
		/*
		 * 1~100 까지 숫자를 가로로 나열
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 */
		int last = 100;
		
		for(int i = 0 ; i < last ; i ++) {
			 // i + 1(1~100까지 ) 숫자를 일렬로 나열
			System.out.print((i+1) + "\t");
			
			// 나열하다 출력숫자가 5의 배수이면 줄바꿈 하라.
			if((i+1) % 5 == 0) {
				System.out.println();	

			}
		}
	}
}
