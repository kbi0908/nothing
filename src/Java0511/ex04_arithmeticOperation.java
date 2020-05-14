/*
	Date : 2020.05.11
	Author : 구민성
	Description : 연산자(Operation)
	Version : 1.0
 */

package Java0511;

public class ex04_arithmeticOperation {

	public static void main(String[] args) {
		//[변수/상수/식] '연산자' [변수/상수/식]
		// +, -, *, /, %
		
		int num1 = 7;
		int num2 = 2;
		int result;
		
		//덧셈
		result = num1 + num2;
		System.out.println("+ : " + result);
		
		//뺄셈
		result = num1 - num2;
		System.out.println("- : " + result);
		
		//곱셈
		result = num1 * num2;
		System.out.println("* : " + result);
		
		//나눗셈
		result = num1 / num2;
		System.out.println("/ : " + result);
		
		//나머지
		result = num1 % num2;
		System.out.println("% : " + result);
		

	}

}
