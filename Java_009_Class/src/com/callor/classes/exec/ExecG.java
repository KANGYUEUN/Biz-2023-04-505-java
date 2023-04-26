package com.callor.classes.exec;

public class ExecG {
	// 매개변수 num 로 전달 받은 값이
	// prime 이면 num 아니면 0 return 하는 method 선언.
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*50)+51;
		}
		for(int i =0; i < nums.length; i ++) {
			// prime(nums[i]) :nums 배열의 i 번째 값을 보내니 그것이 소수인지 알려줘라
			// 만약 nums[i] 값이 소수이면 출력
			//  소수 값이 아니면 0 출력
			if(prime(nums[i]) > 0) {
				System.out.println(nums[i] + " 는  소수");
			} else {
				System.err.println(nums[i] + " 는  소수가 아님");
			}
		}
	}
}

