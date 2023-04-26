package com.callor.classes.exec;

public class ExecI {
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		int lastNum = 0;
		/*
		 * lastIndex 초기화를 0으로 실행후 만약 배열에 댬긴 값중 3의 배수가 하나도 없을 경우 lastIndex 는 그대로 0이 될것이고
		 * 결과 출력 에서 0의 index 와 index 0 의 요소 값이 출력 된다. 이러한 논리 적인 문제를 해결하기 ㅐ위해 lastIndex 를
		 * -1 로 초기화 하고 결과 출력에서 lastIndex 값을 한번 더 검사
		 */
		int lastIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 3 == 0) {
				lastNum = i;
				lastIndex = nums[i];
			}
		}
		if (lastIndex > -1) {
			System.out.println(lastNum + " : 마지막 위치");
			System.out.println(lastIndex + " : 마지막 위치의 값");
		} else {
			System.out.println("3의 배수는 없다.");
		}

		/*
		 * index 시작값 : nums.length = 50 index 종료값 : index>0 조건에 있어 index 1일 경우 for() 종료
		 * 49,48,47,46....0 까지 생성해야 하는데 여기의 코드는 50~1까지 생성 되고 있다. 시작하자 마자 nums[50] 요소의 값을
		 * 읽으려고 시도한다. index OutofBounds 오류가 생김
		 */
		// for (int index = nums.length; index > 0; index--) {
		for (int index = nums.length - 1; index >= 0; index--) {
			if (nums[index] % 3 == 0) {
				System.out.println("마지막 3의 배수 : " + nums[index]);
				System.out.println("위치 : " + index);
			}
		}

	}

}
