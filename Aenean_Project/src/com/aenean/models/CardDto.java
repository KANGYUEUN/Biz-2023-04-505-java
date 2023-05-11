package com.aenean.models;

public class CardDto {

	 private String pattern; // 카드 문양
	 private String denomination; // 13개의 끗수
	
		 
	public CardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CardDto(String pattern, String denomination) {
		super();
		this.pattern = pattern;
		this.denomination = denomination;
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
	@Override
	public String toString() {
		return "CardDto [pattern=" + pattern + ", denomination=" + denomination + "]";
	}
}
