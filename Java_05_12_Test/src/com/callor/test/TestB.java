package com.callor.test;

import java.util.ArrayList;
import java.util.List;

public class TestB {

	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			numList.add((int) (Math.random() * 50) + 51);

			int pCount = 0;
			int pSum = 0;

			for (int index = 2; index < numList.size(); index++) {
				if (numList.get(i) % index == 0) {
					pCount++;
					pSum += numList.get(index);
					break;
				}
			}
			if(pCount == 0) {
				System.out.printf("소수 개수 : ", pCount);
				
			}
			
			System.out.printf("\n소수의 합 : ", pSum);
		}
	}
}
