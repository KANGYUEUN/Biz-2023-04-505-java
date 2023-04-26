package com.callor.classes.exec;

public class ExecE {
	public static void main(String[] args) {
		/*
		 * 배열 요소의 생성 개수는 그때 그때 상황에 따라 다르다.
		 * 배열의 요소를 대상으로 for()  반복문 처리 할때
		 * 배열 요소 갯수를 일일이 숫자로 코딩하는 것은 비효율 적이다.
		 * 
		 * Java 에서 배열을 생성하면 배열의 요소 개수를 알수 있는 변수를 자동으로 생성한다.
		 * " 배열.length " 로 사용한다.
		 * nums.length
		 */
		int[] nums = new int[22];
		
		// 데이터 준비와 수집
		for (int i = 0; i < nums.length ; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		// 데이터 처리 5의 배수 찾기
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println(nums[i] + "는 5의 배수");
			}
		}
	}
}
