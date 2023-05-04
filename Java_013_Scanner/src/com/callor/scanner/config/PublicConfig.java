package com.callor.scanner.config;

public class PublicConfig {
	/*
	 * 변수 선언문에 static 추가 된 경우
	 * "클래스 변수" : static 키워드가 있는것
	 * 프로젝트가 시작 될때 자동으로 생성(선언,초기화) 되는 변수
	 * 이 변수는 클래스를 객체로 생성 하지 않아도 사용 할 수 있다.
	 * 
	 *  일반적인 클래스에 선언된 변수 사용하기 위해서는 반드시 객체선언이 먼저 되어야 함.
	 *  DataClass obj = new Class()
	 *  odj.변수 = 30;
	 *
	 *  하지만 클래스 변수는 객체로 선언 하지 않아도 
	 *  직접 호출이 가능하다.
	 *  Config.변수 = 30;
	 *  System.out.println(PublicConfig.dLine)
	 *  System.out.println(PublicConfig.sLine)
	 */
	public static String dLine = "=".repeat(60);
	public static String sLine = "-".repeat(60);
	
	/*
	 * 클래스 method
	 * 프로젝트가 시작 될때 자동으로 메모리에 로딩 되어 사용할 준비가 완료되는 method
	 * PublicConfig.dLin(100);
	 */
	public static String dLine(int length) {
		return "=".repeat(length);
	}
	
	public static String sLine(int length) {
		return "-".repeat(length);
	}
	
	/*
	 * 클래스에 포함된 변수, method 에는 static 키워드를 추가 할 수 있다.
	 * 원래는 이러한 변수, method 를 정적변수, 정적메서드 라고 한다.
	 * 
	 * 프로젝트가 시작 될때 언제든지 사용 될수 있도록 미리 준비되는 도구들
	 * 사용 할때는 클래스명.변수, 클래스명.method() 와 같이 직접
	 * 클래스 이름을 통하여 접근한다.
	 */
}
