package com.callor.blackjack.service.impl;
/*
 * 게임을 위한 52개의 카드 이미지 생성하기 
 * hit했을때 사용할 카드 제출하기 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.DeckService;

public class DeckServiceImplV1 implements DeckService {
	
	// 52장의 CardDto를 갖는 List
	protected final List<CardDto> cardDeck;
	
	public DeckServiceImplV1() {
		cardDeck = new ArrayList<>();
	}
	
	public List<CardDto> newCardDeck() {
		if(cardDeck.isEmpty()) {
			makeDeckList();
		}
		for(int i = 0; i < 100 ; i ++ ) {
			Collections.shuffle(cardDeck);
		}
		return cardDeck;
	}

	// 위 코드에서 셔플된 카드 덱에서 한장씩 카드를 제출하기 
	public CardDto getDeck() {
		if(cardDeck.isEmpty()) newCardDeck();
		try {
			return cardDeck.remove(0);
		} catch (Exception e) {
			return null;
		}
	}
	
	
	public void makeDeckList() {
		String strSuit = "◆♥♠♣";
		String strDenomination = "A234567890KQJ";
		
		String[] suits = strSuit.split("");
		String[] denoms = strDenomination.split("");
		
		// 52 장 카드 만들기
		// 두개의 배열을 for 문으로 반복하여 52회 반복하는 코드 완성
		for(String suit : suits) {
			for(String denom : denoms) {
				
				CardDto cdDto = new CardDto();
				cdDto.suit = suit;
				
				try {
					int value = Integer.valueOf(denom);
					if (value == 0) value = 10; // KQJ 에 대한 입샙션 처리
					cdDto.denomination = value + ""; // 보이는 값
					cdDto.value = value; // 계산에 사용될 값
				} catch (Exception e) {
					cdDto.denomination = denom;
					if(denom.equals("A")) cdDto.value = 1;
					else cdDto.value = 10;
				}
				cardDeck.add(cdDto);
			}
		}
	}
}
