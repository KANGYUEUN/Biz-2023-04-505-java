package com.callor.classes.exec;

public class ClassA {
	
	public static void main(String[] args) {
		
		// 정수형 배열 10개 생성하기
		int[] nums = new int[10];
		
		// 개별요소 (0~9) 에 값 저장하기
		// nums[0~9] = (int)(Math.random()*51) + 50;
		
		// 정수형 배열 10개의 요소에 51~100까지 랜덤수 저장하기 
		for(int i = 0 ; i < nums.length; i ++) {
			nums[i] = (int)(Math.random()*51) + 50;
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0 ) {
				System.out.printf("index %d, 값 : %d\n ", i, nums[i]);
				break;
			}
		}
	}
		
}
