package com.callor.var.controller;

public class ControlF {
	public static void main(String[] args) {
		int intRnd = (int)(Math.random()* 10) + 1;
		if(intRnd % 3 == 0) {
			int intResult = intRnd * 3;
			System.out.println(intResult);
		} else {
			System.err.println(intRnd + "는(은) 3의 배수가 아님");
		}
		/*
		 * intResult 변수는 if() {} 의 scope 를 갖는다
		 * = if()  { } block 내부에서만 생명을 유지
		 * 즉, 이 block 벗어나면 변수 intResult 는 참조(읽기,쓰기) 할수 없다.
		 */
		// System.out.println(intResult); // 생명주기를 벗어나 참조 불가능
		
	}
}
