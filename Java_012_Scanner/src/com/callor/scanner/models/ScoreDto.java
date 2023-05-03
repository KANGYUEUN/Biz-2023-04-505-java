package com.callor.scanner.models;

public class ScoreDto {

	private String stNum;
	private int scKor;
	private int scEng;
	private int scMath;
	private int scNusic;
	private int scArt;

	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScEng() {
		return scEng;
	}
	public void setScEng(int scEng) {
		this.scEng = scEng;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	public int getScNusic() {
		return scNusic;
	}
	public void setScNusic(int scNusic) {
		this.scNusic = scNusic;
	}
	public int getScArt() {
		return scArt;
	}
	public void setScArt(int scArt) {
		this.scArt = scArt;
	}
	
	@Override
	public String toString() {
		return "ScoreDto [stNum=" + stNum + ", scKor=" + scKor + ", scEng=" + scEng + ", scMath=" + scMath
				+ ", scNusic=" + scNusic + ", scArt=" + scArt + "]";
	}

}
