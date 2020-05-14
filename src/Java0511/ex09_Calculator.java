/*
	Date : 2020.05.11
	Author : 구민성
	Description : 계산기(Calculator)
	Version : 1.0
 */

package Java0511;

import java.util.Scanner;

public class ex09_Calculator {

	public static void main(String[] args) {
		//두개의 정수를 입력받아서 결과를 출력하는 프로그램
		
		int num1;
		int num2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);
		
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);
		
		result = (double) num1 / num2;
		System.out.println("나눗셈결과 : " + result);
		
		result = num1 % num2;
		System.out.println("나머지 : " + result);

	}
}
