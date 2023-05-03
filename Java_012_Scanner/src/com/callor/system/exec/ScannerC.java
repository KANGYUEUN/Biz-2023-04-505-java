package com.callor.system.exec;

import java.util.Scanner;

public class ScannerC {

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
