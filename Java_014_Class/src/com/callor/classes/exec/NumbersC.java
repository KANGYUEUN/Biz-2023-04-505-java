package com.callor.classes.exec;

public class NumbersC {

	public static void main(String[] args) {
		
		// 참조형 정수 배열 10개 생성
		// 참조형 정수 배열은 배열의 갯누는 만들어 지나
		//  각 요소는 초기화 되지 않아서 따로 초기화 시켜줘야 한다.
		Integer[] nums = new Integer[10];
		// 참조형 정수는 각 요소를 모두 초기화 시켜줘야 함
		nums[0]=0;
		for(int i = 0; i < nums.length; i ++ ) {
			nums[i] = 0;
		}
		
		// 참조형 숫자 배열의 요소는 일반 기본형 변수 초기화와 같이 생성한다.
		for(int i = 0; i < nums.length; i ++ ) {
			// 사용하지마라
			nums[i] = new Integer(0);
		}
		
		// primitive (기본)형 정수 배열 10개 생성
		// 기본형 정수 배열은 별도로 값을 초기화 하지 않아도 
		//  자동으로 0 초기화 생성 된다.
		int[] intNums = new int[10];
		
		System.out.println(nums[0]); 
		System.out.println(intNums[0]);
		
		boolean bYes = nums[0].equals(nums[1]); // 두개의 값이 같다 
		System.out.println(bYes);
		
		bYes = nums[0] == nums[1]; 
		System.out.println(bYes);
		
		String str1 = "Korea";
		String str2 = new String("Korea");
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true (참조형 이기 땨문에 이퀄스 사용해서 비교 해야함.)
	}
}
