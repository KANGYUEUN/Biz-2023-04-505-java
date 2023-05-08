package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassG {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();

		for ( int i = 0; i < 10; i ++ ) {
		numList.add((int) (Math.random() * 51) + 50);
		}
		
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) % 2 == 0) {
				System.out.println("짝수 : " + numList.get(i));
			}
		}
		
		// numList 의 맨끝에 정수 10 을 추가 하기 
		numList.add(10);
		// index 0 번 위치에 데이터 제거 하기 
		numList.remove(0);
		// index 0 번 위치에 데이터 10 추가 하기 
		numList.add(0,10);
		// index 0 번 위치의 데이터 읽어서 num 변수에 저장하기 
		int num =numList.get(0);
		// index 1 번 위치의 데이터를 100으로 변경하기 
		// 기존의 index 1번 위치의 데이터는 삭제되고 100이 저장 된다.
		numList.set(1, 100);
	}
}
