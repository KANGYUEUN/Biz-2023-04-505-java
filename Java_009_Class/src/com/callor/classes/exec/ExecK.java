package com.callor.classes.exec;

public class ExecK {
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		// i 이 변화 되는 정도
		// 시작 값이 0, 종료 값이 i < nums.length
		// i : 0~(nums.length -1), 0~49 까지 변하는 수 
		for (int i = 0; i < nums.length; i++) {
			System.out.printf(nums[i] + "\t");
			// i+1 : i 가 0부터 시작하는데 1부터 시작하는 걸로 바꾸기 위한 식.
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
