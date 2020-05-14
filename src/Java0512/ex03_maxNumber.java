/*
	Date : 2020.05.12
	Author : 구민성
	Description : maxNumber
	Version : 1.0
 */
package Java0512;

import java.util.Scanner;

public class ex03_maxNumber {

	public static void main(String[] args) {
		//두 수를 입력받아 큰수를 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, max;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("세번째 수 : ");
		num3 = sc.nextInt();

		max = Math.max(num1, num2);
		//num1과 num2중 더 큰 값을 max에 저장
		max = Math.max(max, num3);
		//저장된 max와 num3중 더 큰 값을 max에 저장
		System.out.println("최대값 : " + max);
	}

}
