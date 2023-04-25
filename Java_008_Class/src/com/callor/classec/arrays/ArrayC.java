package com.callor.classec.arrays;

public class ArrayC {
	public static void main(String[] args) {
		int[] nums = new int[10];

		nums[0] = 33;
		nums[1] = 35;
		nums[3] = 39;
		nums[4] = 38;
		nums[5] = 33;
		nums[6] = 30;
		nums[7] = 32;
		nums[8] = 31;
		nums[9] = 22;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);

		for (int index = 0; index < 10; index++) {
			System.out.println(nums[index]); 
		}
	}
}
