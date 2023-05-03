package com.callor.classes;

import java.util.Scanner;

public class ClassH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		while (true) {
			System.out.println("두개의 정수를 입력하세요");
			System.out.println("임의의 값 입력시 종료");
			System.out.print("정수 1  >> ");
			num1 = scan.nextInt();

			System.out.print("정수 2 >> ");
			num2 = scan.nextInt();

			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d / %d = %f\n", num1, num2, (float) num1 / (float) num2);
			System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);

			int rndNum = (int) (Math.random() * 50) + 51;
			if (num1 == rndNum) {
				break;
			}
		}
		// System.out.println("GAME OVER");
		scan.close();
	}
}
