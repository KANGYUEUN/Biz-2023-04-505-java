package com.callor.classes.exec;

import com.callor.classes.exec.module.MyClassC;

public class ExecH {
	/*
	 * 51~100 까지중 임의의 랜덤수를 생성
	 * MyClassC 의 prime() method 에게 전달하고 
	 * 소수 인지 아닌지 결과를 출력.
	 */
	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*50)+51; {
			
			// MyClassC type 의 myC 객체 생성(선언과 초기화)
			// myC 는 MyClassC 의 대리자 역할을 수행
			MyClassC myC = new MyClassC();
			
			// myC 대리자를 통하여 prime(int) method 를 호출
			// 결과를 result 변수에 받는다.
			int result = myC.prime(rndNum);
			
			// result 에 저장된 값이 0보다 크면 소수 아니면 소수가 아니다.
			if(result > 0 ) {
				System.out.println(rndNum + "는 소수이다.");	
			} else {
				System.err.println(rndNum + "는 소수가 아니다.");
			}
			
		}
	}
}
