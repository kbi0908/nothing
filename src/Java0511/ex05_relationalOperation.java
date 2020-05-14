/*
	Date : 2020.05.11
	Author : 구민성
	Description : 연산자(Operation)
	Version : 1.0
 */

package Java0511;

public class ex05_relationalOperation {

	public static void main(String[] args) {
		// >, <, >=, <=, ==, !=
		int num1 = 7;
		int num2 = 2;
		boolean result;
		
		result = num1 > num2;
		System.out.println(num1 + " > " + num2 + " = " + result);
		
		result = num1 < num2;
		System.out.println(num1 + " < " + num2 + " = " + result);
		
		result = num1 >= num2;
		System.out.println(num1 + " >= " + num2 + " = " + result);
		
		result = num1 <= num2;
		System.out.println(num1 + " <= " + num2 + " = " + result);
		
		result = num1 == num2;
		System.out.println(num1 + " == " + num2 + " = " + result);
		
		result = num1 != num2;
		System.out.println(num1 + " != " + num2 + " = " + result);
		

	}

}
