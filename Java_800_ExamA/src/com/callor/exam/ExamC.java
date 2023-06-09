package com.callor.exam;

import java.util.ArrayList;
import java.util.List;

public class ExamC {

	private static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return num;
		}
		return num;
	}

	public static void main(String[] args) {
		List<Integer> rndList = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			int num = (int) (Math.random() * 50) + 51;
			rndList.add(null);
		}
		int count = 0;
		int total = 0;
		for (Integer num : rndList) {
			if (prime(num) > 0) { // 소수이면
				count++;
				total += num;
			}
		}
		System.out.println("소수의 개수 : " + count);
		System.out.println("소수의 합 : " + total);
	}
}
