package com.callor.classes.models;

public class StudentDto {

	/*
	 * " 클래스 변수 " = 속성 , 필드 
	 * public 접근 제한자가 설정 되어 있기 때문에
	 * 변수에 ' 직접 ' 접근이 가능한 상태.
	 * 
	 */
	public String stNum;
	public String stName;
	public String stDept;
	public int stGrade;
	public String stTel;
	public String stAddress;
	
	
	
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + ", stAddress=" + stAddress + "]";
	}
}
