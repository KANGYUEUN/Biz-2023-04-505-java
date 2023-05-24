package com.callor.bank.models;
/*
 * 	acNum		VARCHAR2(10)
 *	acDiv		VARCHAR2(1)
 *	acBuId		VARCHAR2(5)
 *	acBalance	NUMBER
 *
 *	데이터 클래스는
 *	각 method 간에 데이터를 묶음으로 담아 전달하기위한 목적의 객체이다.
 */
public class AccDto {

	public String acNum;
	public String acDiv;
	public String acBuId;
	public int acBalance;
	
	// 필드 생성자, 임의 생성자 
	public AccDto(String acNum, String acDiv, String acBuId, int acBalance) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.acBuId = acBuId;
		this.acBalance = acBalance;
	}
	
	// super 생성자 , 기본생성자
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", acBuId=" + acBuId + ", acBalance=" + acBalance + "]";
	}
}