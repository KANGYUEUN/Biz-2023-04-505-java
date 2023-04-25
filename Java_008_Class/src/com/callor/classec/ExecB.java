package com.callor.classec;

import com.callor.classec.model.ScoreDto;
import com.callor.classec.module.ServiceB;

public class ExecB {

	public static void main(String[] args) {
		/*
		 * ScoreDto 클래스 를 사용하여 scoreDto 객체를 선언하고
		 * 생성자 메서드 ( ScoreDto() ) 를 사용하여 객체를 초기화(new) 한다.
		 * 
		 * scoreDto 객체를 초기화 하여 사용할 준비가 되면 이를 "인스턴스"가 되었다고 한다.
		 * 초기화 하는 순간 ScoreDto 클래스에서 선언한 변수들(여기서는 9가지)을
		 * 모두 사용 할수 있도록 동시에 초기화가 된다.
		 * 
		 */
		ScoreDto scoreDto = new ScoreDto();
		
		// 초기화된 ScoreDto 에 포함된 변수들의 값을 다시 셋팅
		scoreDto.kor = (int)(Math.random()*50) +51;
		scoreDto.eng = (int)(Math.random()*50) +51;
		scoreDto.math = (int)(Math.random()*50) +51;
		scoreDto.history = (int)(Math.random()*50) +51;
		scoreDto.music = (int)(Math.random()*50) +51;
		scoreDto.art = (int)(Math.random()*50) +51;
		scoreDto.play = (int)(Math.random()*50) +51;
		
		scoreDto.num ="0001";
		scoreDto.name ="홍길동";
		
		ServiceB serviceB = new ServiceB();
		serviceB.score(scoreDto);
	}
}
