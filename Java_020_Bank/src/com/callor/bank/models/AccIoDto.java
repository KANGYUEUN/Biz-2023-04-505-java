package com.callor.bank.models;

/*
 * < 거래내역 데이터 클래스 >
 * 계좌번호 : acNum
 * 거래일자 : aiData
 * 거래시각 : aiTime
 * 거래구분 : aiDiv
 * 입금 : aiInput
 * 출금 : aiOutput
 */
public class AccIoDto {

	public String acNum;
	public String aiData;
	public String aiTime;
	public String acDiv;
	public int aiInput;
	public int aiOutput;

	public AccIoDto(String acNum, String aiData, String aiTime, String acDiv, int aiInput, int aiOutput) {
		super();
		this.acNum = acNum;
		this.aiData = aiData;
		this.aiTime = aiTime;
		this.acDiv = acDiv;
		this.aiInput = aiInput;
		this.aiOutput = aiOutput;
	}

	public AccIoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccIoDto [acNum=" + acNum + ", aiData=" + aiData + ", aiTime=" + aiTime + ", acDiv=" + acDiv
				+ ", aiInput=" + aiInput + ", aiOutput=" + aiOutput + "]";
	}

}
