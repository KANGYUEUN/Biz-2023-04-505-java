package com.callor.blackjack.service;
/*
 * 게임을 위한 52개의 카드 이미지 생성하기 
 * hit했을때 사용할 카드 제출하기 
 */

import java.util.List;
import com.callor.blackjack.models.CardDto;

public interface DeckService {
	
	public List<CardDto> newCardDeck(); 
	public CardDto getDeck(); 
	public void makeDeckList();
	
}
