package com.callor.classes;

/*
 * ClassB 에서 ClassA 의 기능을 < "상속" = extends >
 * 
 * ClassB 에는 아무런 method 도 정의 되지 않았으나
 * ClassA 를 상속 받아 마지 ClassA 의  두개의 add() method 들이 정의 된것 처럼 사용 가능. 
 * 
 * '객체지향(OOP) 프로그램밍 에서 클래스를 상속 받기'
 * 기존에 잘 만들어진 클래스 코드가 있으면 그 코드를 
 * 내가 만든 클래스에서 사용 하고 싶을때
 * ClassA 는 매우 잘 만들어진 클래스 일때
 * ClassB 는 ClassA 의 method 를 그대로 상속 받아 이용 가능하다.
 * 
 *  만약 원래 ClassA 의 개발자가 코드를 upgrade 하면 
 *  ClassB 도 함께 Upgrade 되는 효과를 낼수 있다.
 * 
 */
public class ClassB extends ClassA {
	
	/*
	 *  < Java 에서 클래스에 상속 ( extends) >
	 *   Java 에서 클래스의 상속은 부모 클래스의 장점을 그대로 물려 받으면서 
	 *   필요에 따라 method 를 ' 재 정의' 하여 사용 할수 있는 기능.
	 *  
	 */
	@Override
	public void add(int num1, int num2) {
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2); // 재정의 
	}
	/*
	 * 	Object  를 상속 받는 모든 클래스는 
	 * 기본적으로 toString() method 가 있다.
	 * 기본 toString() method 클래스의 패키지명, 메모리 주소 등을 문자열로 return 한다.
	 * 
	 * 기본 toString() method 코드는 실제로 별 효용이 없다.
	 * 일반적으로 toString() 각 class 에서 ' 재 정의 ' 하여 사용 한다.
	 */
	@Override
	public String toString() {
		return "나는 원래 toString() method 를 재정의 한 것이다.";
	}
	
	

	
}
