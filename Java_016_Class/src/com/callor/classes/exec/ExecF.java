package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.callor.classes.models.StdData;

public class ExecF {

	public static void main(String[] args) {
		
		// 배열의 크기과 인덱스 값을 알고 잇을대
		// 배열의 일부 요소만 사용 하고 싶을때
		for ( int i = 0; i <StdData.STUDENT.length; i ++) {
			System.out.println(StdData.STUDENT[i]); // 일일히 index 값을 지정해 줘야 함
		}
		
		// index 0~4 번까지 데이터만 사용 하고 싶을때
		for ( int i = 0; i <5; i ++) {
			System.out.println(StdData.STUDENT[i]); // 일일히 index 값을 지정해 줘야 함
		}
		
		// 배열의 크기와 index 를 모르거나 몰라도 될때
		// 전체 배열의 요소를 사용 하고 싶을때
		for(String str : StdData.STUDENT) {
			System.out.println(str); //  확장된 for 일일히 해주지 않아도 사용가능
		}
		
		// String List type 의 studentList 객체 변수를 선언 하고 
		// StdData.STUDENT 배열의 요소를 사용하여 
		// studentList 객체에 데이터를 채우기.
		// 아래 두개 의 코드는 동일하나 용도는 다르다.
		List<String> studentList = Arrays.asList(StdData.STUDENT);
		studentList = new ArrayList<>(Arrays.asList(StdData.STUDENT));
		
		
		for(String str : studentList) {
			System.out.println(str);
		}
		
		/* 		 배열 			| 			List
		 * -----------------------------------------------
		 * 처음에 개수를 지정	| 처음에 type 을 지정
		 * new String[10]		| List<String>
		 * 						| size() = 0 인상태로 시작
		 * ------------------------------------------------
		 * 개수범위내의 index  	| 필요에 따라 List 에 add() 
		 * 위치 요소에 값을 저장| 사용 하여 데이터 추가 
		 * str[3] = "Korea"		|
		 * ------------------------------------------------
		 * 개수 범위내의 index	| List 의 get(i) 를 통해 
		 * 위치 요소로 부터		| 데이터를 읽을수 있다.
		 * 값을 읽을수 있다.	|--------------------------
		 * println(str[0])		| 특정 index 요소 값 변경시 
		 * 						| List 의 set() 을 통해 
		 * 						| 값을 변경 할 수 있다.
		 *-------------------------------------------------
		 * 배열은 코드가 실행 	| List 는 필요에 따라 
		 * 되는 도중에 크기 변경| size() 를 사용 해서 
		 * 불가					| 변경 할 수 있다.
		 * ------------------------------------------------
		 * 						| remove(index) method 통해
		 * 						| 그 위치 삭제 가능 
		 */
		
	}
}
