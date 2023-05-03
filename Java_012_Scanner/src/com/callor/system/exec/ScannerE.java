package com.callor.system.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true) {
			System.out.println("두개의 정수를 입력 하시오");
			String strNum1 = "";
			String strNum2 = "";
			
			while(true) {
				System.out.print("정수 1 ( QUIT: 종료)>>");
				strNum1 = scan.nextLine();
				if(strNum1.equals("OUIT")) {break;} 
				try {num1 = Integer.valueOf(strNum1);} 
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수 1 은 정수 값만 입력 해야 한다");
					continue; // 정수 1에 문제가 생기면 다시 정수 1을 입력하라고 함
				}	
				break;
			}
			if(strNum1.equals("QUIT")) {break;} // "QUIT" 인지 한번더 검사하는 것 
			
			while(true) {
				System.out.print("정수 2 (QUIT: 종료)>>");
				strNum2 = scan.nextLine();
				if(strNum2.equals("OUIT")) {break;}
				try {num2 = Integer.valueOf(strNum2);}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수 2 는 정수 값만 입력 해야 한다");
					continue; // 정수 2에 문제가 생기면 다시 정수 2을 입력하라고 함
				}
				break; // 제대로 정수값이 입력 되면 break
			}
			if(strNum2.equals("QUIT")) {break;} // "QUIT" 인지 한번더 검사하는 것 
			
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			System.out.printf("%d x %d = %d\n",num1,num2,num1*num2);
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		}
		System.out.println("GAME OVER");
		
	}
}
