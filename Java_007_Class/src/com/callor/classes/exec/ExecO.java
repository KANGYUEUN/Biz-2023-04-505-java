package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceF;

public class ExecO {
	public static void main(String[] args) {
		int Kor = (int) (Math.random() * 50) + 51;
		int eng = (int) (Math.random() * 50) + 51;
		int math = (int) (Math.random() * 50) + 51;
		int history = (int) (Math.random() * 50) + 51;
		int music = (int) (Math.random() * 50) + 51;
		int draw = (int) (Math.random() * 50) + 51;
		int athletic = (int) (Math.random() * 50) + 51;

		ServiceF serviceF = new ServiceF();
		serviceF.score(Kor, eng, math, history, music, draw, athletic);

	}
}
