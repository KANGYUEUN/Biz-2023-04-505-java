package com.callor.classes.exec;

public class ClassC {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length; i ++) {
			nums[i] = (int)(Math.random()*51)+50;
		}
		// nums배열요소에  저장된 값 10 이 삭제 되고
		// 새롭게 20 개가 생성된다 
		// 배열은 새로 생성시 기존의 모든 내용이 삭제
		// 배열은 한번 만들어진 상태에서 새롭게 크기를 변경 하거나 할수 없다.
		// nums = new int[20];
		
		// 배열 요소 전부를 반복하는 " 확장된 for 반복문 : for Each "
		// 0번 index 부터 배열 끝 index 까지 무조건 반복
		// nums 배열 요소를 펼치고 0 번 index 요소부터 끝 index 요소 까지 순서대로 
		// num 변수에 저장 하여 {} 코드에서 사용 할수 있도록 한다.
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		
		
	}
}
