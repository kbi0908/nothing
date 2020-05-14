/*
	Date : 2020.05.11
	Author : 구민성
	Description : 조건문 if
	Version : 1.0
 */

package Java0511;

public class ex11_else_if {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 5;
		
		if(num1 > num2) {
			System.out.println("num1이 더 크다.");
		}
		else if(num1 < num2) {
			System.out.println("num2가 더 크다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
		

	}

}
