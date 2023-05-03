package com.callor.system.exec;

import com.callor.scanner.service.StudentServiceV1;

public class StudentC {

	public static void main(String[] args) {
		
		StudentServiceV1 studentService = new StudentServiceV1();
		
		studentService.inputStudent();
		
	}
}
