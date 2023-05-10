package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV1;

public class StudentexecA {

	public static void main(String[] args) {

		// ' interface ' 로 객체 선언, class 의 생성자로 객체 생성 초기화.
		StudentService stService = new StudentServiceImplV1();

		stService.loadStudent();
		stService.printStudent();

		StudentDto stDto = stService.getStudent("S0001");
		
		// ' null safe coding '
		// method 호출 리턴값을 결과로 하여 다른 객체 변수에 저장을 하고 
		// 객체의 속성, method 들을 포함하여 다른 일을 수행 하려교 할때
		// 객체 자체가 null 일 경루 익셉션 발생
		// 이러한 상황을 미리 예측하고 대비하는 코드.
		if (stDto != null) {
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());
		} else {
			System.out.println("찾는 데이터가 없다.");
		}
		
		// Exception safe, Exception handling code
		try {
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("찾는 데이터가 없다.");
		}
		
		
	}
}
