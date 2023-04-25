package com.callor.classec.arrays;

/*
 * 정수형 배열 10 개를 nums 이름으로 선언하고 
 * 각 요소에 50~100까지 랜덤수 저장 하고 
 * 배열 요소에 저장된 값들을 덧셈하여 출력
 */
public class ArrayD {
	public static void main(String[] args) {
		int[] nums = new int[10];
		nums[0] = (int) (Math.random() * 50) + 51;
		
		// for 반복문을 사용하여
		// nums 배열의 각 요소 값을 랜덤수로 채워넣기
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf(nums[i] + "\t");
		}
		
		// 각 요소에 저장된 정수를 모두 더해 결과 표시
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
}
