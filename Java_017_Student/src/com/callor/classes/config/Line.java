package com.callor.classes.config;

/*
 *  ' 코드에서 라인 그리기 '
 *  코드를 자주 사용 해야 할 것으로 예상 하여 static 변수와
 *  static method 로 생성 해 두고 필요시에 호출하여 사용 한다.
 */
public class Line {

	// 60 개 짜리 고정 길이로 LINE 문자열 만들기 
	public static final String dLINE = "=".repeat(60);
	public static final String sLINE = "-".repeat(60);
	
	public static final String dLINE(int length) {
		return "=".repeat(length);
	}
	
	public static final String sLINE(int length) {
		return "-".repeat(length);
	}
}
