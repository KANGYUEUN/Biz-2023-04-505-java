package com.callor.classes;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		
		// Scanner 클래스 (도구)를 사용하여 연산 수행 하기 위한 준비
		// Scanner 클래스를 사용하여 scan 객체 생성하기
		/*
		 * 여러 기능이 있으나 
		 * 그 중에서 키보드로 입력된 데이터를 컴퓨터의 기억장소에 보관해주는 
		 * 기능을 수행하는 도구 : Scanner
		 * 
		 * Scanner 클래스는 혼자 키보드에서 가져 올수 없다
		 * 키보드가 눌린것을 알아채고, Scanner 에게 전달하여 데이터를 읽을 수 있도록 해주는 
		 * 보조 도구 : System.in 이다.
		 * 
		 * Scanner 클래스는 반드시 생성자 method 에 
		 * System.in 도구를 전달해 줘야 함.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine(); // 코드 블로킹

		System.out.println("키보드로 입력한 문자열: " + str );
		
	}
}
