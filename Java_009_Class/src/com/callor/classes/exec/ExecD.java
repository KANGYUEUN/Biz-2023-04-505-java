package com.callor.classes.exec;

public class ExecD {
	public static void main(String[] args) {
		int[] nums = new int[100];
		
		// 데이터 준비와 수집
		for (int i = 0; i < 100; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		// 데이터 처리 5의 배수 찾기
		for (int i = 0; i < 100; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println(nums[i] + "는 5의 배수");
			}
		}
	}
}
