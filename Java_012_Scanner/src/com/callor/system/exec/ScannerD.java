package com.callor.system.exec;

import java.util.Scanner;

public class ScannerD {

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
			 * strNum1 에 저장된 문자열이 QUIT 가 아니고 
			 * 문자열형 정수 값이 아닌 경우 
			 * 1. 그냥 엔터를 누른 경우 : ""
			 * 2. 정수가 아닌 실수 값을 누른경우 : 30.0
			 * 3. 스페이스 빈칸을 입력 한 경우 : "30 " , " 30", "30.."
			 * 4. 그외 많음 
			 */
			
			try {
				num1 = Integer.valueOf(strNum1);	
			} catch (Exception e) {
				/*
				 * try-catch 블럭에서 exception 이 발생한 경우
				 * Integer.valeOf(strNum1) 명령이 실행시 정상적으로 작동 하지 않을 때
				 * catch{} 내의 코드가 실행 된다.
				 * try-catch 블럭에서 exception 이 발생하여도 코드가 중단되는 것을 '일단' 방지한다.
				 */
				
				// TODO: handle exception
				System.out.println("정수 1 은 정수 값만 입력 해야 한다");
				continue; // 반복문을 다시 실행
			}
			System.out.println("입력한 값 : " + strNum1);
			System.out.print("정수 2 (QUIT: 종료)>>");
			String strNum2 = scan.nextLine();

			if(strNum2.equals("OUIT")) {
				break;
			}
			try {
				num2 = Integer.valueOf(strNum2);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			System.out.printf("%d x %d = %d\n",num1,num2,num1*num2);
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			
			System.out.println(strNum1 + strNum2); // 3040
			
		}
		
		System.out.println("GAME OVER");
		
		
		
		
		
	}
}
