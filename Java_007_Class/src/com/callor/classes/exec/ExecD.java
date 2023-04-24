package com.callor.classes.exec;

import com.callor.classes.exec.module.MyClassA;

public class ExecD {
	public static void main(String[] args) {
		/*
		 * MyClassA type 에 myA 객체를 선언하고
		 * MyClassA() 생성자 method 를 사용하여
		 * myA 객체를 초기화 한다.
		 */
		MyClassA myA = new MyClassA();
		
		/*
		 * String type str 객체를 선언
		 * String() 생성자 method 를 사용하여
		 * str 객체를 초기화 한다.
		 */
		String string = new String("Republic of Korea");
		
		/*
		 * Scanner type 의 scan 객체를 선언하고,
		 * Scanner() 생성자 method 를 사용하여
		 * scan 객체를 초기화 한다.(변수를 사용할수 있다.)
		 */
		// Scanner scan = new Scanner(System.in);
		
		/*
		 * class type(= 변수 선언 키워드가 Class) 의 객체를 선언하고
		 * class type 으로 선언된 변수 : "객체"
		 * 선언 되지 않은 변수는 초기화,저장,읽기,쓰기 등이 일체 허용되지 않는다.
		 * 
		 * 객체를 생성자 메서드를 사용하여 초기화 한다.
		 * 객체(변수) 를 사용가능한 형태로 만들기
		 * 초기화 하지 않으면 일부 기능만 사용할수 있다.
		 * 
		 * 
		 * 일반 변수는 값을 저장,할당,대입 하면 초기화가 된다.
		 * 객체는 클래스의 생성자 method()를 사용하여 초기화 한다. ( 차이가 있음)
		 */
		
		 int num1;
		 num1 = 0;
	}
}
