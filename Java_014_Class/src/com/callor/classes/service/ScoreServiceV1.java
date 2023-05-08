package com.callor.classes.service;

import java.util.List;

import com.callor.classes.medels.ScoreDto;

public class ScoreServiceV1 {

	// 학생수를 10으로 설정하기 위한 변수 선언
	private int classSize = 10;

	/*
	 * 매개변수로 일반 변수가 아닌 참조형 객체 변수를 사용 참조형 객체변수는 실제 저장된 값이 전달 되는 것이 아니고 기억장소의 '주소'가 전달
	 * 된다.
	 * 
	 * main() method 에서 보낼때 scoreList 의 주소가 전달 되고 makeScore() 에서 값을 변경 시키면 main()
	 * method 의 scoreList 가 같이 변경되는 성질을 갖게 된다.
	 */

	public void makeScore(List<ScoreDto> scoreList) { // List 라는 type 의 class

		for (int i = 0; i < classSize; i++) {

			// 학번을 001,002형식으로 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * " List type 의 data " 배열에서는 먼저 배열선언후 배열 초기화, 각 요소의 데이터 저장이 이루어 졌으나
			 * 
			 * List type 에서는 1. 비어 있는 List type 을 생성 2. Dto 객체변수를 생성하고 3. Dto 각 변수에 값을
			 * setting(setter) 4. List 에 Dto 를 add.
			 * 
			 */
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusic(scMusic);
			scoreDto.setScArt(scArt);
			scoreList.add(scoreDto);

		}
	} // makeScore() end

	public void printScore(List<ScoreDto> scList) {

		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t수학\t음악\t미술\t총점");
		System.out.println("-".repeat(50));

		for (int i = 0; i < scList.size(); i++) {
			System.out.print(scList.get(i).getStNum() + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScMath() + "\t");
			System.out.print(scList.get(i).getScMusic() + "\t");
			System.out.print(scList.get(i).getScArt() + "\t");
			System.out.print(scList.get(i).getTotal() + "\n");
		}
		System.out.println("-".repeat(50));

	}

	// scList 데이터를 총점을 기준으로 오름차순 정렬하기
	// scList 의 객체 데이터에서 getTotal() 값을 기준으로 비교
	// scList 의 객체 요소를 교환하기 
	public void sortScore(List<ScoreDto> scList) {

		for (int i = 0; i < scList.size(); i++) {
			for (int j = i + 1; j < scList.size(); j++) {
				if (scList.get(i).getTotal() > scList.get(j).getTotal()) {
					ScoreDto scDto = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, scDto);
					
				}
			}
		}
	}

	public void add(int num1, int num2) {

		num1 = 1000; // 여기서 바꾸어도 변하지 않음
		num2 = 2000;
	}
}
