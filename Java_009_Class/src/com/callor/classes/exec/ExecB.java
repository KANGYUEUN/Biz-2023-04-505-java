package com.callor.classes.exec;

public class ExecB {

	public static void main(String[] args) {
		// 정수형 배열 nums 를 선언하고, 그 저장 공간 10개 생성하기 
		int[] nums = new int[10];
		
		// nums 배열의 0~9 요소 까지 순서대로 1~10 값 저장.
		for(int index = 0; index<10; index ++) {
			// nums[index] 위치에 index + 1 의 값을 저장.
			nums[index] = index + 1; 
		}
		
		//  nums 배열에 0~9번 요소 까지 51~100 랜덤수 값 저장.
		for(int index = 0; index<10; index ++) {
			// nums[index] 배열에 랜덤수 51~100 저장.
			nums[index] = (int)(Math.random()*50) +51;
			
		}
	}
}
