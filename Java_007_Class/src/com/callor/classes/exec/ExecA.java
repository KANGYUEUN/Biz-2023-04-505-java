/*
 * Java 의 package
 * Java 는 소스코드를 package 단위로 관리한다.
 * package = folder 와 같은 개념
 * 
 * base-package : com.callor.class
 * 3단위, 3단계 package 단위를 base-package 라고 한다.
 * base-package 는 식별자 역할을 한다.
 *  
 */
package com.callor.classes.exec;

public class ExecA {
	/*
	 * 정수 1개를 전달받아서 매개변수 num1에 받고 
	 * num1 변수에 전달받은 값이 소수인지 판별하여 
	 * 소수이면 num1 을 return 하고
	 * 아니면 0을 return 하는 method 정의
	 * 
	 * 가장 기본적인 형태만 갖춘 method 정의
	 * method 원형, method prototype 이라고 함.
	 */
	public static int prime(int num1) {
		for(int i =2; i < num1 ; i ++) {
			if(num1%i ==0) {
				return 0;
			}
		}
		return num1;
	}
	public static void main(String[] args) {
		/*
		 * prime() method 에 정수 11을 전달하여
		 * 소수인가 판별하여 그결과를 출력.
		 */
		int result =  prime(11);
		if(result > 0) {
			System.out.println(result + "소수");
		}
		
	}
}
