package com.callor.test.models;

public class GuideDto {

	public String gdId;
	public String gdList;
	public String gdSeq;
	public String gdGuid;
	
	public GuideDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuideDto(String gdId, String gdList, String gdSeq, String gdGuid) {
		super();
		this.gdId = gdId;
		this.gdList = gdList;
		this.gdSeq = gdSeq;
		this.gdGuid = gdGuid;
	}

	public String getGdId() {
		return gdId;
	}

	public void setGdId(String gdId) {
		this.gdId = gdId;
	}

	public String getGdList() {
		return gdList;
	}

	public void setGdList(String gdList) {
		this.gdList = gdList;
	}

	public String getGdSeq() {
		return gdSeq;
	}

	public void setGdSeq(String gdSeq) {
		this.gdSeq = gdSeq;
	}

	public String getGdGuid() {
		return gdGuid;
	}

	public void setGdGuid(String gdGuid) {
		this.gdGuid = gdGuid;
	}

	@Override
	public String toString() {
		return "GuideDto [gdId=" + gdId + ", gdList=" + gdList + ", gdSeq=" + gdSeq + ", gdGuid=" + gdGuid + "]";
	}
}
