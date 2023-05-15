package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

/*
 * StudentServiceImplV1 클래스를 작성한 개발자가 테스트 하기 위해 작성
 * 
 * StudentServiceImplV1 클래스에는 insertStudent() method 가 작성 되었으나
 * StudentService 인터페이스 에는 insertStudent() method 가 없어 호출 할수 없는 상황이다.
 * 
 * 1. Service interface 에  insertStudent() method 추가 해달라 요청. 
 * 		but, 사전에 조율이 되지않은 다른 팀원 클래스에 오류가 생김. 
 * 			 계속해서 isertStudent() 를 사용할 예정이라면 전원이 메서드를 추가하는 방법이 최선이다.
 * 			 특정 계발자의 필요에 의해 method 가 작성 되었다면, 절대 해서는 안됌.
 * 2. " 객체의 형변환 "을 통해 생성된 객체를 자신의 ImplV1 클래스로 형변환 하여 임시로 method를 사용 하는 방법 
 * 		((StudentServiceImplV1)stService).insertStudent();
 */
public class StudentExecC {

	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		
		/*
		 * stService 는 StutentService(interface) type의 객체이다.
		 * 그리고 insertStudent() method 는 StudentServiceImplV1() 클래스에 정의된 메서드 이다.
		 * 이러한 상황에서 insertStudent() method를 test 하기 위해 
		 * stService 객체를 ' 형변환 ' 하여 수행한다.
		 */
		((StudentServiceImplV1)stService).insertStudent();
		System.out.println("학생정보 입력 종료 !");
		stService.printStudent();
		
		
		
		
		
		
	}
}
