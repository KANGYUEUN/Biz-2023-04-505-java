package com.callor.student.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentExecD {

	public static void main(String[] args) {
		
		/*
		 *  " InputStream "
		 *  컴퓨터 주기억 장치 외부로 부터(키보드, 파일, 네트워크 등)을 통하여 데이터를 입력 받는 통로
		 *  정보처리에서 모든 데이터는 주기억장치에 적재 되어야 그 후 모든것 처리 가능.
		 *  
		 *  주 기억 장치를 기준으로 연결되어 사용되는 여러 통로를 Stream 이라고 하고,
		 *  주 기억 장치에 데이터가 들어오는 경우 ' InputStream '
		 *  주 기억 장치로 부터 데이터가 나가는 경우 ' OutputStream ' 이라고 한다.
		 */
		InputStream is = System.in;	
		/*
		 * InputStream is = System.in;
		 * 이것을 통해 키보드에서 데이터를 직접 주기억 장치에 저장하는 코드를 작성 할 수 있으나 
		 * 이 방법은 상당히 많은 코드를 작성 해야 한다. 이 수고를 'Scanner' 클래스를 통해 대신 처리 한다.
		 */
		Scanner scan = new Scanner(is);
		String studentFile = "src/com/callor/student/Student.txt";
		
		OutputStream os = null;
		PrintWriter out = null;
		
		try {
			os = new FileOutputStream(studentFile);
			out = new PrintWriter(os);
			
			for(int i = 0 ; i < 10 ; i ++ ) {
				out.print("0001,");
				out.print("홍길동,");
				out.print("정보통신,");
				out.print("3,");
				out.println("010-1111-1111");
				
			}
			out.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
