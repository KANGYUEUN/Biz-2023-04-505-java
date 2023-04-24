package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceE;

public class ExecN {
	public static void main(String[] args) {
		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMath = (int) (Math.random() * 50) + 51;

		ServiceE serviceE = new ServiceE();
		// ServiceE 에 선언된 score 메서드 호출 하기 위해 대리자(serviceE) 만들어 호출.
		serviceE.score(intKor, intEng, intMath); 

	}
}
