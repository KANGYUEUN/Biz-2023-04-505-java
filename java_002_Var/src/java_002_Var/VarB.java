package java_002_Var;

public class VarB {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		num1 = 30;
		num2 = 40;
		
		// 변수에 어떤 값을 저장, 할당, 대입 하려면 
		// 반드시 먼저 선언 되어야 한다.
		
		// sum1 선언 하고 두 변수의 덧셈 결과 저장.
		int sum1 = 0;
		sum1 = num1 + num2;
		
		// sum2 선언과 동시에 두변수의 덧셈결과 저장.
		int sum2 = num1 + num2;
		System.out.println(sum1);
		
	}
}
