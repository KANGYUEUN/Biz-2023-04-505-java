package com.callor.system.var;

public class VarAE {
	
	public static void main(String[] args) {
		int num1 = 0;
		num1 = 20 + 30;
		
		int num2 = 20;
		num1 = num2 + 20; // 40 (앞선 num1의 값 50이 무의미 해진다.)
		num2 = num1 + num2; // 60 (앞선 num1의 값이 40, 정의된 값이 num2 = 20 따라서 60이 된다.)
		num2 = num2 + 10; // 70 (앞선 값이 2 = 60이므로 70이된다.)
		
		
		
				
	}
}
