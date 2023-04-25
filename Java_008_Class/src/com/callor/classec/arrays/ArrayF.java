package com.callor.classec.arrays;

public class ArrayF {
	/*
	 * prime() method 에게 정수값 1개만 전달
	 * 그 정수값이 소수인지 아닌지 알려줘라 요청
	 * 소수이면 그자체 리턴 
	 * 아니면 0을 리턴 최종 처리는 메인에서 한다.
	 */
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	/*
	 * 다수의 데이터를 정보처리 할 경우
	 * 데이터를 수집하고, 수집이 완료 되었을때
	 * 한꺼번에 처리를 한다.
	 * 
	 * 데이터가 발생하는 즉시 처리 : "실시간 처리" ex) 티켓예매
	 * 데이터를 모두 수집하고 수집완료후 처리 : "배치(Batch)처리" ex) 급여계산 인구통계
	 * 
	 */
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < 10; i++) {
			// prime() 호출하여 구하기
			if (prime(nums[i]) > 0) {
				System.out.println(nums[i] + " 는 소수");
			} else {
				System.err.println(nums[i] + " 는 소수가 아님");
			}
		}
	}
}

