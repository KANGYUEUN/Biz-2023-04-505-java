package com.callor.controller;

public class ControllerE {
	/*
	 * 51~100 랜덤수 1개 만들고 이것이 소수가 아닌지 찾기
	 * Prime : 1과 자신 이외의 약수를 갖지 않는수 
	 * 		< 2 ~ (자신-1) > 범위의 정수로 각각 나누었을때 
	 * 		나머지가 한번도 0이 아닌것
	 * 		나머지가 한번이라도 0이면 소수가 아님.
	 */
	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*50) +51;
		// 이 for명령에 의해 i 값은 rndNum -1 까지 연속된 정수가 됨
		// for () {} 까지 사용가능
		for(int i = 2 ; i < rndNum ; i ++) {
			if (rndNum % i == 0); {
				System.out.print(rndNum +" : ");
				System.out.print(i +"로 나누면 나머지가");
				System.out.print(rndNum % i );
				System.out.println("이 수는 소수가 아님");
				
				// 반복문을 수행하며 연산을 실행하는 과정에서 
				// 소수가 아님을 판별하면 더이상 진행할 이유가 없음 
				// break : for () 반복문을 중단.
				// 이는for 밖에서 사용불가.
				
				break;
			} 
		}
	}
}
