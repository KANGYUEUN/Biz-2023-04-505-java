package com.callor.classes.exec;

public class ExecJ {
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
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		int firstPrime = 0;
		int lastPrime = 0;

		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				firstPrime = nums[i];
				System.out.println(i + "는 최초의 소수의 위치");
				break;
			}
		}
		System.out.println(firstPrime + "는 최초의 소수");
		

		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				lastPrime = nums[i];
				System.out.println(i + "는 마지막 소수의 위치");
			}
		}
		
		System.out.println(lastPrime + "는 마지막 소수");
		
		int lastIndex =0;
		int firstIndex = -1;
		lastIndex = -1;
		
		for(int i  = 0; i < nums.length; i ++) {
			if(firstIndex < 0 && prime(nums[i]) >0) {
				firstIndex = i;
			}
			if(prime(nums[i])>0) {
				lastIndex = i;
			}
		}
		if(lastIndex > 0) {
			System.out.println("최초 소수의 index : " + firstIndex);
			System.out.println("최초 소수 : " + nums[firstIndex]);
			
			System.out.println("최초 소수의 index : " + lastIndex);
			System.out.println("마지막 소수 : " + nums[lastIndex]);
		}

	}
}
