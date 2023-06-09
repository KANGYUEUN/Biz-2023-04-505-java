package com.callor.blackjack.service.impl;
/*
 * hit() : 카드 받기
 * showDeck() : 보유한 카드 보이기 
 * showScore() : 보유한 카드의 점수 보이기 
 */

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;
import com.callor.blackjack.utils.AnsiColor;
import com.callor.blackjack.utils.Line;

public class PlayerServiceImplV1 implements PlayerService {

	// player 가 get 한 카드를 저장할 리스트
	protected final List<CardDto> deckList;
	protected final String playerName;

	/*
	 * new PlayerService() 으로 생성자를 호출하면 playerName 를 " 딜러 " 로 설정 new
	 * PlayerService("타짜") 으로 생성자를 호출하면 playerName 를 " 타짜 " 로 설정
	 */
	public PlayerServiceImplV1() {
		this("딜러");
	}

	public PlayerServiceImplV1(String playerName) {
		deckList = new ArrayList<>();
		this.playerName = playerName;
	}

	public void hit(CardDto card) {
		deckList.add(card);
	}

	public void showDeck() {
		System.out.println(Line.dLine(100));
		System.out.printf("%s, 받은카드 : %d매, 점수 : %d\n", playerName, deckList.size(), this.getScore());
		System.out.println(Line.sLine(100));

		String[] patterns = deckList.get(0).getPattern();

		for (int rows = 0; rows < patterns.length; rows++) {
			for (CardDto cardDto : deckList) {
				if ("◆,♥".contains(cardDto.suit)) {
					System.out.print(AnsiColor.RED(cardDto.getPattern()[rows]));
				} else {
					System.out.print(AnsiColor.CYAN(cardDto.getPattern()[rows]));
				}
			}
			System.out.println();
		}

		for (CardDto card : deckList) {
			System.out.println(card.toString());
		}
		System.out.println(Line.dLine(100));
	}

	public int getScore() {
		int score = 0;
		for (CardDto card : deckList) {
			score += card.value;
		}
		return score;
	}

	public String getPlayName() {
		return this.playerName;
	}
}
