package com.callor.exam;

public class ExamA {

	public static void main(String[] args) {
		
		// 랜덤수를 생성하고, 생성한 랜덤수가 범위에 맞는지 10번 테스트 수행
		int index = 0;
		for (index = 0; index < 100; index++) {
			int rndNum = (int) (Math.random() * 200) + 1;
			if (rndNum < 1 || rndNum > 100) { // 실패 이면 빠져 나오기
				break;
			}
		}
		// 테스트를 수행한 결과가 어떤지 표현 
		if (index >= 100) {
			System.out.println("100번 수행 결과 1~100 까지 랜덤수를 만들어내고 모두 통과함");
		} else {
			System.out.println("테스트 횟수 :" + index);
			System.out.println("100번 수행 결과 " + index + "번째에서 실패");
		}
	}
}
