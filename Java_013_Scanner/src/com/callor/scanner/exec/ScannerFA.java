package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerFA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 정수형 배열 6개를 만들기
		// 정수형 요소 6개를 갖는 nums 배열 생성
		int[] nums = new int[6];
		int numsSaveIndex = 0; // nums 의 어느 위치를 알려줄 변수

		// nums 배열요소에 한번도 저장되지 않은 rndNum 값 찾기(만들기)
		while (true) {
			int rndNum = (int) (Math.random() * 45) + 1;
			
			for(int i = 0; i < nums.length ; i ++) {
				if(nums[i]== rndNum) {
					rndNum = (int) (Math.random() * 45) + 1;
					i = -1; // for 문을 다시 시작하게 하는것 
				}
			}

			while (true) {
				
				System.out.println(PublicConfig.dLine(100));
				System.out.println("정수 입력(QUIT : 종료) >> ");
				String strNum = scan.nextLine();
				if (strNum.equals("OUIT")) {
					System.out.println("게임중단");
					return;
				}
				int intNum = 0;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("입력값오류");

					continue;
				}
				System.out.println(PublicConfig.sLine(100));
				if (intNum < 0 || intNum > 45) {
					System.out.println("1 ~ 45까지 범위의 정수만 입력하세요");
				} else if (rndNum == intNum) {
					System.out.println("참 잘했어요");
					nums[numsSaveIndex++] = rndNum;
					break;
				} else if (rndNum > intNum) {
					System.err.printf("입력값이 너무 작아요", intNum);
				} else if (rndNum < intNum) {
					System.err.printf("입력값이 너무 커요", intNum);
				}
				// 참 잘했어요 를 만났을때 진행할 곳
				if (numsSaveIndex >= nums.length) {
					break;
				}
			} // 1st while () 문
			System.out.println("게임종료");
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%d\t",nums[i]);
			}
			System.out.println();
		}
	}

}