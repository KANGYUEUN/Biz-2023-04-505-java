package com.callor.test.service;

import java.util.List;

import com.callor.test.models.GuideDto;

public interface GuideService {
	
	public void loadGuide();
	public void printGuide();
	
	public GuideDto getGuide(String guide);
	public List<GuideDto> getGdList();

}
