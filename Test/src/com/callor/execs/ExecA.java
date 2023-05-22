package com.callor.execs;

import com.callor.dto.ExecDto;

public class ExecA {

	public static void main(String[] args) {
		int num;
		int num2;
		
		num = 1;
		num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		ExecDto exdto = new ExecDto();
		exdto.num = 1;
		exdto.num2 = 2;
		System.out.println(exdto.num);
		System.out.println(exdto.num2);
		swap(exdto);
		System.out.println(exdto.num);
		System.out.println(exdto.num2);
	}
	
	public static void swap(ExecDto dto) {
		int temp;
		temp = dto.num;
		dto.num = dto.num2;
		dto.num2 = temp;
	}
	
	public static void swap(int num , int num2) {
		int temp;
		temp = num;
		num = num2;
		num2 = temp;
		
	}
}
