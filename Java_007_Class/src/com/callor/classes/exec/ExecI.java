package com.callor.classes.exec;

import com.callor.classes.exec.module.MyClassC;

public class ExecI {
	public static void main(String[] args) {
		MyClassC myC = new MyClassC();
		
		int countPrime = 0;
		
		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;

			int result = myC.prime(rndNum); 
			if (result > 0) {
				countPrime++;
			}

		}
		System.out.println(countPrime + "는(은) 소수의 개수");
	}
}
