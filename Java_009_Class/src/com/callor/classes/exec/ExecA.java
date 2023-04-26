package com.callor.classes.exec;
/*
 * Java의 'class'
 * 객체지향 프로그래밍 방법론적 부분에서
 * 가장 표준적인 코딩 스타일.
 * 
 * Java 는 모든 코드(파일) 이 기본적으로 class 로 부터 시작한다.
 * 
 * Java 의 소스코드는 ~.java 로 저장 되나
 * "Java 클래스 파일"이라고 부른다.
 * 
 * 여기에는 method 들이 포함되고, 변수들이 포함된다.
 * method 만 있는 클래스 파일이 있고, 
 * 변수들만 있는 클래스 파일도 있고,
 * method 와 변수 두가지가 같이 있는 파일도 있다. (표준)
 * 
 * 코드를 테스드하고 실행 하기 위해 main() method 를 작성한다.
 * main() method는 진입점,  시작점 main() method 이라고 하며 
 * main() method를 포함하는 java class 코드를 진입점 코드 라고 한다.
 * 
 */
public class ExecA {
	public static void main(String[] args) {
		
		// 한개의 정수형 변수를 만들고 51~100 까지 랜덤수로 초기화 하기
		int num1 = (int)(Math.random()*50) +51;
		
		// 여러개릐 정수형 변수 '배열'[]묶음을 선언하기
		// 10개를 생성하여 배열을 만든다.
		int[] nums = new int[10];
		
		// 생성된 배열(공간) 에 정수값을 저장하기
		// 배열의 값을 저장하기 위해서는 배열의 index 를 지정해야 한다 
		// 배열[index] : 이는 항상 0부터 시작~ 최대값은 배열의길이 -1 까지 이다.
		
		nums[0] = 100; // 0 번(index) 위치에 100 저장
		nums[1] = 90;  // 저장되는 값은 index의 값이다.
		nums[2] = 80;
		nums[3] = 70;
		nums[4] = 60;
		nums[5] = 50;
		nums[6] = 40;
		nums[7] = 30;
		nums[8] = 20;
		nums[9] = 10;
		
		// nums 배열의 3번 index 값에 저장된 값을 읽어서 
		// num1 변수에 저장하라.
		num1 = nums[3]; // 70
		
		// nums 배열의 5번 index 에 저장된 값을 출력해라
		System.out.println(nums[5]);
		
		
		
		
		
		
		
		
	}
}
