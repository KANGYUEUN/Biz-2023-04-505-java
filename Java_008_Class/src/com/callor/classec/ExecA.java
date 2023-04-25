package com.callor.classec;

import com.callor.classec.module.ServiceA;

public class ExecA {
	public static void main(String[] args) {
		int kor = (int) (Math.random() * 50) + 51;
		int eng = (int) (Math.random() * 50) + 51;
		int math = (int) (Math.random() * 50) + 51;
		int history = (int) (Math.random() * 50) + 51;
		int music = (int) (Math.random() * 50) + 51;
		int art = (int) (Math.random() * 50) + 51;
		int play = (int) (Math.random() * 50) + 51;

		ServiceA serviceA = new ServiceA();
		serviceA.score(kor, eng, math, history, music, art, play);

	}
}
