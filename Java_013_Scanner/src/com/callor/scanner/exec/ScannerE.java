package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("NEW GAME START");
			int rndNum = (int) (Math.random() * 10) + 1;

			while (true) {
				System.out.println("정수값 입력하여 랜덤수 맞추기 ");
				System.out.print("정수 (QUIT: 종료 )>> ");
				String strNum = scan.nextLine();
				
				if(strNum.equals("QUIT")) {
					System.out.println("GAME OVER");
					return;
				}
				try {
					int intNum = Integer.valueOf(rndNum);
					if (rndNum == intNum) {
						System.out.println("참 잘했어요");
						break;
					} else if (rndNum > intNum){
						System.out.println("입력값이 작습니다");
					} else if (rndNum < intNum) {
						System.out.println("입력값이 큽니다");
					}
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");
				}

			}
		}
	}

}
