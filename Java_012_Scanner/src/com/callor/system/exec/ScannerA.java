package com.callor.system.exec;

import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) {
		
		// 키보드에서 데이터를 입력 받기 위해 사용하는 도구
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		// while(조건) 명령문
		// 조건의 결과가 true 인 경우 무한 반복하는 명령문
		while(true) {
			// 안내문 prompt 먼저 보여주기
			System.out.println("두개의 정수를 입력하세요");
			System.out.print("정수 1 >> ");
			num1 = scan.nextInt();
			System.out.print("정수 2 >> ");
			num2 = scan.nextInt();
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			
			
		}

	}
}
