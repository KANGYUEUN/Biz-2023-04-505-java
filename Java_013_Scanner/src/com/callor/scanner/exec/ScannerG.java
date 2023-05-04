package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerG {

	public static void main(String[] args) {
		int[] nums = new int [6];
		int rndNum = (int)(Math.random()*45)+1;
		
		for(int i = 0 ; i < nums.length; i ++) {
			nums[i] = rndNum;
		}
		
		Scanner scan = new Scanner(System.in);
		
	}
}
