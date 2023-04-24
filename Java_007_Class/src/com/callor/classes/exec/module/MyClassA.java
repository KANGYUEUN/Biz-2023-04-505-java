package com.callor.classes.exec.module;

public class MyClassA {
	
	/* 
	 * MyClassA 클래스의 "생성자 method"
	 * public 키워드만을 가진 메서드
	 * class 와 이름이 같은 메서드 static 이 없는 method
	 */
	public MyClassA() {
		
	}
	
	// static 키워드가 없는 method()
	// 매개변수 num1,num2 를 가지고 그 값을 전달받아 덧셈후 리턴하는 method
	/*
	 * 2개의 매개변수를 통하여 정수 2개를 전달받고 
	 * 전달받은 정수를 덧셈하여 return 하는 add() method
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
