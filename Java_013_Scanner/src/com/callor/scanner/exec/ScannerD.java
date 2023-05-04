package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("NEW GAME START");
			int rndNum = (int) (Math.random() * 10) + 1;

			while (true) {
				System.out.println("정수값 입력하여 맞추기 >>");
				System.out.print("정수 (QUIT: 종료 )>> ");
				int result = scan.nextInt(rndNum);

				try {
					result = Integer.valueOf(rndNum);
					if (rndNum == result) {
						System.out.println("잘했어요");
						break;
					} else {
						System.out.println("재도전 하세요");
					}
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");
				}

				continue;
			}
		}
	}
}
