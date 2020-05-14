/*
	Date : 2020.05.11
	Author : 구민성
	Description : 연산자(Operation)
	Version : 1.0
 */

package Java0511;

public class ex02_IncreaseDecreaseOperation {
	public static void main(String[] args) {
		//단항연산자에 포함
		int num = 5;
		int result = num;
		
		System.out.println("결과값 : " + result);
		
		result = ++num; // num의 값을 1 증가 시킨뒤 연산에 적용
		System.out.println("결과값 : " + result);
		//num = 6
		
		result = num++; // num의 값을 연산에 적용한뒤 1 증가
		System.out.println("결과값 : " + result);
		//num = 7
		
		result = --num; // num의 값을 1 감소 시킨뒤 연산에 적용
		System.out.println("결과값 : " + result);
		//num = 6
		
		result = num--; // num의 값을 연산에 적용한뒤 1 감소
		System.out.println("결과값 : " + result);
		//num = 5
		
		
		
		
		
		
		int num1 = 5;
		int num2 = 11;
		int result2;
		
		result2 = ++num1 + --num2; //6+10=16  num1=6, num2=10
		System.out.println(result2);
		
		result2 = num2++ - num1--; //10-6=4   num1=5, num2=11
		System.out.println(result2);
		
		result2 = num1++ - ++num2; //5-12=-7  num1=6, num2=12
		System.out.println(result2);
		
		/*
		result2 = ++num1 + ++num2;
		System.out.println(result2); // 6+11=17, num1=6, num2=11
		
		result2 = num1++ + num2++;
		System.out.println(result2); // 6+11=17, num1=7, num2=12
		
		result2 = num1++ + ++num2;
		System.out.println(result2); // 7+13=20; num1=8, num2=13
		
		result2 = ++num1 + num2++;;
		System.out.println(result2); // 9+13=22; num1=9, num2=14
		*/
		
		
	}
}
