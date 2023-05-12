package com.callor.test;

public class TestA {

	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*100) +1;
		
		for(int i = 0; i <100; i ++) {
			System.out.println(rndNum);
			System.out.println("100번 테스트 결과 1~100까지 범위의 랜덤수를 만들어 내고 있음");
			
			if(rndNum < 0 || rndNum > 101 ) {
				System.err.println("100번 테스트를 수행 하려 했으나 테스트에 실패함");
			}
			break;
		}
	}
}
