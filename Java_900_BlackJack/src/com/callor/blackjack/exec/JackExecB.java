package com.callor.blackjack.exec;

import com.callor.blackjack.service.BlackJeckService;

public class JackExecB {
	
	public static void main(String[] args) {
		BlackJeckService blackJack = new BlackJeckService();
		blackJack.gameStart();
	}
}
