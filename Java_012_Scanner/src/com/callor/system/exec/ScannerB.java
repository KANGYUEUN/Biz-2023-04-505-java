package com.callor.system.exec;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true) {
			System.out.println("두개의 정수를 입력 하시오");
			System.out.print("정수 1 ( QUIT: 종료)>>");
			String strNum1 = scan.nextLine();
			
			if(strNum1.equals("OUIT")) {
				break;
			}
			/*
			 * 키보드로 30 이라는 값을 입력하고 엔터 하면 strNum1 변수에는 문자열형 ' 30 '문자열이 저장된다.
			 * strNum2 에도 문자열형 숫자가 저장된다.
			 * 이 두 변수를 덧셈 연산 하면 문자열 연결 연산이 된다.
			 * 나머지 4칙 연산는 오류가 난다.
			 * 
			 * 원하는 연산는 숫자값의 4칙 연산이므로 
			 * 입력된 문자열 형 숫자를 실제 숫자 형 데이터로 변화를 시켜 줘야 한다.
			 * 문자열 형 숫자를 "정수형 숫자 데이터"로 변환 시켜야 함
			 */
			
			// 문자열 형 숫자를 정수형 숫자 데이터로 변환 하기
			num1 = Integer.valueOf(strNum1);
			
			System.out.println("입력한 값 : " + strNum1);
			System.out.print("정수 2 (QUIT: 종료)>>");
			String strNum2 = scan.nextLine();

			if(strNum2.equals("OUIT")) {
				break;
			}
			
			num2 = Integer.valueOf(strNum2);
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			System.out.printf("%d x %d = %d\n",num1,num2,num1*num2);
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			
			System.out.println(strNum1 + strNum2); // 3040
			
		}
		
		System.out.println("GAME OVER");
		
		
		
		
		
	}
}
