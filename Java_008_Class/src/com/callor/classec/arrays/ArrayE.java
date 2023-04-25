package com.callor.classec.arrays;

public class ArrayE {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1; // 1~10까지 나열하기
		}

//		int sum = 0;
//		for(int i =0; i <10; i ++) {
//			sum +=(i+1); // 1~10까지 더하기
//		}

		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1;
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);

			}

			for (int index = 0; index < 10; index++) {
				int index1;
				for (index1 = 2; index1 < nums[i]; index1++) {
					if (nums[i] % index1 == 0) {
						break;
					}
				}
				if (nums[i] <= index1) {
					System.out.println("소수 : " + nums[index1]);
				} else {
					System.err.println("소수가 아님 : " + nums[index1]);
				}
			}
		}

	}
}
