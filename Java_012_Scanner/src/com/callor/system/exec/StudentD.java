package com.callor.system.exec;

import com.callor.scanner.service.StudentServiceV22;

public class StudentD {

	public static void main(String[] args) {
		
		StudentServiceV22 studentService = new StudentServiceV22();
		studentService.inputStudents();
		
		studentService.printStudents();
	}
}
