package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {

	private static int getNum() {
		Scanner scan = new Scanner(System.in);
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
				// continue 를 사용 하고 싶지 않을때
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

	// 매개 변수를 통해 전달반은 num 값이 프라임이 아니면 -1
	// 프라임 이면 num 변수의 값을 리턴
	public static int prime(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return -1;
			}
		}
		return num;
	}

	public static void main(String[] args) {

		while (true) {
			int num = getNum();
			if (num < 0) {
				System.out.println("GAME OVER");
				// main 에서 return 이 실행되면
				// 프로젝트 코드 전체를 중단하라
				return;

			}
			// prime() 가 전달받은 num 값이 소수이면 리턴
			// 아니면 -1 리턴
			// 리턴한 값을 다시 result 변수에 저장
			// getNum() 가 넘겨준 값 소수이면 num 저장 아니면 -1 이 저장.
			int result = prime(num);

			if (result > 0) {
				System.out.println(num + " 는 소수 ");
			} else {
				System.out.println(num + " 는 소수가 아님  ");
			}
		}
	}
}
