package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceA;

public class ExecJ {
	public static void main(String[] args) {
		ServiceA seA = new ServiceA();
		int rndnum1 = (int)(Math.random()*50)+51;
		int rndnum2 = (int)(Math.random()*50)+51;
		
		int result = seA.add(rndnum1, rndnum2);
		
		System.out.println("두수의 합 :" + result );
		
	}
}
