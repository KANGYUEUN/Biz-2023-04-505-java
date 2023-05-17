package com.callor.bank.models;

/*
 * < 고객정보 데이터 클래스 > 
 * 고객ID	문자열(10)	buid
 * 고객이름	문자열		buName
 * 전화번호	문자열		buTel
 * 주소		문자열		buAddr
 * 생년월일	문자열		buBirth
 * 직업		문자열		buJob
  */
public class BuyerDto {

	public String buid;
	public String buName;
	public String buTel;
	public String buAddr;
	public String buBirth;
	public String buJob;

	public BuyerDto(String buid, String buName, String buTel, String buAddr, String buBirth, String buJob) {
		super();
		this.buid = buid;
		this.buName = buName;
		this.buTel = buTel;
		this.buAddr = buAddr;
		this.buBirth = buBirth;
		this.buJob = buJob;
	}

	@Override
	public String toString() {
		return "BuyerDto [buid=" + buid + ", buName=" + buName + ", buTel=" + buTel + ", buAddr=" + buAddr
				+ ", buBirth=" + buBirth + ", buJob=" + buJob + "]";
	}

	public BuyerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
