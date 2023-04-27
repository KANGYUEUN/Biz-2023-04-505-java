package com.callor.classes.arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[45];

		// 배열에 1~45 까지 숫자를 순서대로 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < 1000; i++) {
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			int _tmp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _tmp;

		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
		 

		// nums 배열의 0~5번 요소를 lottos 배열에 생성해서 복사
		// lottos 배열의 값을 오름차순 하여 출력.
		int[] lottos = new int[6];
		for ( int out = 0; out < lottos.length; out++) {
			for ( int in = out +1; in < lottos.length; in++) {
				if(nums[out] > nums[in]) {
					int _tmp = nums[in];
					nums [in] = nums [out];
					nums [out] = _tmp;
				}
			}
		}
		
		for ( int i=0; i < lottos.length; i ++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
		
	}
}
