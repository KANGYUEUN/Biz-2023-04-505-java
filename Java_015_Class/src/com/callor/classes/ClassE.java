package com.callor.classes;

import java.util.List;

/*
 * ClassE 는 두개의 생성자 method 를 가지고 있다.
 * 한개는 매개변수가 없는 생성자 이를 ' 기본 생성자 ' 라고 한다.
 * 
 * 나머지 한개는 strList 매개 변수를 가진 생성자 이며 
 * this.strList를 초기화 시키는 코드가 있다.
 * 
 * 이것은 ' 임의 생성자 '라고 한다.
 */
public class ClassE {

	private List<String> strList; 

	// 매개변수가 없는 생성자 : 기본 생성자
	// 클래스의 임의생성자를 만들게 되면, 기본 생성자가 자동으로 만들어지지 않는다.
	// 임의 생성자를 만들려면 기본 생성자도 만들어야함.
	public ClassE() { 
	}
	
	//  임의 생성자
	public ClassE(List<String> strList) { 
		this.strList = strList;
	}
	
	public void printList() {
		System.out.println(strList.toString());
	}
}
