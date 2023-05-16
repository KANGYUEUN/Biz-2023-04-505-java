package com.callor.student.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class StudentExecE {

	public static void main(String[] args) {
		
		String studentFile = "src/com/callor/student/Student.txt";
		/*
		 * OutputStream 에는 System.out 이 있다.
		 * 이는 콘솔에 사용되는 출력 장치 이다.
		 */
		OutputStream os = System.out;
		try {
			os = new FileOutputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * OutputStream에 연결하여 
		 * print() method를 사용해 파일 기록을 하는 도구 
		 * 이 도구에 연결하는 OutputStream 도구를 선택적으로 사용하면 
		 * 똑같은 print() 를 사용하여 콘솔이나 파일 네트워크 에 데이터를 보낼수 있다.
		 */
		
		PrintWriter out = new PrintWriter(os);
		for(int i = 0 ; i < 10 ; i ++) {
			out.println("안녕하세요. 반갑습니다.");
		}
		/*
		 * 코드가 끝나기 전에 반드시 printWrter  객체를 사용 종료 해 줘야 한다.
		 * PrintWriter.close() method 가 실행 되기 전까지는
		 * 임시 보관소에 데이터가 보관 되어 있다가 출력장치에 데이터가 전달 된다.
		 */
		out.close(); // 닫아야 파일에 데이터 저장 된다.
	} 
}
