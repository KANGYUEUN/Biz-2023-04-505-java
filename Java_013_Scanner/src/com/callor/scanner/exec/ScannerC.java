package com.callor.scanner.exec;

import com.callor.scanner.service.PrimeServiceV1;

public class ScannerC {

	public static void main(String[] args) {
		PrimeServiceV1 primeServiceV1 = new PrimeServiceV1();

		while (true) {
			int num = primeServiceV1.getNum(); // 객체 통해서 호출
			if (num < 0) {
				System.out.println("GAME OVER");
				break;
			}
			int result = primeServiceV1.primeYesNo(num);
			if (result > 0) {
				System.out.println(num + " 는 소수 ");
			} else {
				System.out.println(num + " 는 소수가 아님  ");
			}
		}
	}
}
