package com.callor.classes.exec.module;

public class ServiceB {
	public void scorePrint(String name, int kor, int eng, int math) {
		
		int sum = kor + eng + math;
		float avg = (float)sum / 3;
		
		
		System.out.println("======================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %2.5f\n",name,kor,eng,math,sum,avg);
		
		
		
	}

}
