package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {

	public static void main(String[] args) {
		// Java 1.8 이후 버전에서는 생성자에 Generic 생략 가능
		//  원칙 : List<Integer> numList = new ArrayList<Integer>();
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numList.add((int) (Math.random() * 51) + 50);
			
		}
		
		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				if (numList.get(i) > numList.get(j)) {
					int temp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, temp);
				}
			}
		}
		//List type 의 객체변수에는 toString() method 가 포함 되고 
		// 단순히 List 의 값들을 출력 해 볼수 있다.
		System.out.println(numList.toString());
	}
}
