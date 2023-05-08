package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassE {

	public static void main(String[] args) {
		
		// Generic type : <> 로 감싸진 클래스 type
		// numList 에 추가 할수 있는 데이터는 정수만 가능
		// Generic type  은 primitive type 은 사용 할수 없다.
		// 반드시 클래스(wrapper, class, data class ) 만 사용 가능
		
		// List<int> numList = new ArrayList<>();
		// numList 는 정수값만 부여 가능 
		
		List<Integer> numList = new ArrayList<>();
		System.out.println(numList.size());
		
		// List type 의 변수에 item 추가 하기
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		System.out.println(numList.size());
		
		// index 3이후 데이터 위치에 100 의  값을 추가 하기 
		numList.add(3,100); // 10 20 30 100 40 50 
		numList.add(3,200); // 10 20 30 200 100 40 50 
		for( int i = 0 ; i < numList.size(); i ++) {
			System.out.print(numList.get(i)+ "\t"); // 10 20 30 40 50 
		} 
	}
}
