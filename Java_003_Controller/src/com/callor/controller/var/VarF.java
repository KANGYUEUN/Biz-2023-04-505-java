package com.callor.controller.var;

public class VarF {
	public static void main(String[] args) {
		String str = "Republic of Korea";
		char cVar = str.charAt(3);
		System.out.println(cVar); // u 출력
		System.out.println(str.length()); // 17 출력
		
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i) + "\t");
		}
	}
}
