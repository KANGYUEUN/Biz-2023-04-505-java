package com.callor.controller;

class ControllerA {
	public static void main(String[] args) {
		for(int i = 0; i < 100 ; i++) {
			int rndNum = (int)(Math.random() * 50 ) + 51;
			System.out.print(rndNum);
			
			if(rndNum < 51 || rndNum > 100) {
				System.out.println("Over");
			} else {
				System.out.println("OK");
			}
		}
	}
}
