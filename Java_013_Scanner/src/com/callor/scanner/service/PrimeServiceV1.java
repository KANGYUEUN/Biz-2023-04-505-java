package com.callor.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {
	
	private Scanner scan = new Scanner(System.in);
	public int getNum() {
		int num = 0;
		while (true) {
			System.out.println("3 이상 양의 정수를 입력하시오");
			System.out.print("정수 (QUIT: 종료 )>> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(strNum);
				if (num >= 3) {
					break;
				}
				break;
			} catch (Exception e) {
				System.out.println("정수만 정확히 입력하라");
			}
		}
		return num;
	}

	public int primeYesNo(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return -1;
			}
		}
		return num;
	}
}
