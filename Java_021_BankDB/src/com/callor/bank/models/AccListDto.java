package com.callor.bank.models;

public class AccListDto {

	public long aioSEQ; // NUMBER
	public String acNum; // VARCHAR2(20) 거래번호
	public String aioDate; // VARCHAR2(10) 거래일자
	public String aioTime; // VARCHAR2(10) 거래시각
	public String aioDiv; // VARCHAR2(1) 거래구분(입출금)
	public int aioInput; // NUMBER 입금액
	public int aioOutput; // NUMBER 출금액
	public String aioREM; // VARCHAR2(30) 

	public AccListDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccListDto(long aioSEQ, String acNum, String aioData, String aioTime, String aioDiv, int aioInput,
			int aioOutput, String aioREM) {
		super();
		this.aioSEQ = aioSEQ;
		this.acNum = acNum;
		this.aioDate = aioData;
		this.aioTime = aioTime;
		this.aioDiv = aioDiv;
		this.aioInput = aioInput;
		this.aioOutput = aioOutput;
		this.aioREM = aioREM;
	}

	@Override
	public String toString() {
		return "AccListDto [aioSEQ=" + aioSEQ + ", acNum=" + acNum + ", aioData=" + aioDate + ", aioTime=" + aioTime
				+ ", aioDiv=" + aioDiv + ", aioInput=" + aioInput + ", aioOutput=" + aioOutput + ", aioREM=" + aioREM
				+ "]";
	}

}
