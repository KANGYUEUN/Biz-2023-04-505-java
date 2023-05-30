package com.callor.shop.models;

public class IolistDto {
	public long ioSEQ; 		// NUMBER
	public String ioDate; 	// VARCHAR2(10)
	public String ioTime; 	// VARCHAR2(10)
	public int ioBuid; 		// NUMBER
	public String ioPCode; 	// VARCHAR2(13)
	public String ioQuan; 	// NUMBER
	public int ioPrice; 	// NUMBER

	public IolistDto(long ioSEQ, String ioDate, String ioTime, int ioBuid, 
			String ioPCode, String ioQuan, int ioPrice) {
		this.ioSEQ = ioSEQ;
		this.ioDate = ioDate;
		this.ioTime = ioTime;
		this.ioBuid = ioBuid;
		this.ioPCode = ioPCode;
		this.ioQuan = ioQuan;
		this.ioPrice = ioPrice;
	}

	public IolistDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IolistDto [ioSEQ=" + ioSEQ + ", ioDate=" + ioDate + ", "
				+ "ioTime=" + ioTime + ", ioBuid=" + ioBuid
				+ ", ioPCode=" + ioPCode + ", ioQuan=" + ioQuan + ", "
						+ "ioPrice=" + ioPrice + "]";
	}
}