package com.callor.classes.exec;

import com.callor.classes.models.StdData;

public class ExecE {

	public static void main(String[] args) {
		
		// StdData 클래스의 STUDENT 변수는 static 변수로 선언 되어 있다.
		// 따라서 객체를 생성하여 객체를 통해 접근 하지 않아도 사용이 가능하다.
		// 대신 클래스. 연산자 로 변수에 직접 접근이 가능하다. ' StdData.STUDENT '
		StdData stdData = new StdData();
		System.out.println(stdData.STUDENT);
		
		for ( int i = 0; i <StdData.STUDENT.length; i ++) {
			System.out.println(StdData.STUDENT[i]);
		}
		
		
		// StdData 클래스에 정의된 STUDENT 변수는 ' final ' 이 선언되어 있다.
		// 따라서 이 변수는 다시 재 정의 불가하다.
		// StdData.STUDENT = new String[10]; (불가능 한 상수 )
		
		String[] str = new String[10];
		str = new String[20];
		str = new String[30];
		
		
	}
	
	
	
}
