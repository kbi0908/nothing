/*
	Date : 2020.05.11
	Author : 구민성
	Description : 연산자(Operation)
	Version : 1.0
 */

package Java0511;

public class ex07_conditionalOperation {

	public static void main(String[] args) {
		/*삼항연산자
		
		//[조건식] ? [참일때 값] : [거짓일때 값];
		int age1 = 35;
		int age2 = 50;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		resultChar = (age1 < age2) ? 'O' : 'X';	
		//35<50은 참이므로 'O'를 변수에 저장
		
		resultInt = (age1 > age2) ? 0 : 1;
		//35>50은 거짓이므로 1을 변수에 저장
		
		resultStr = (age1 < age2) ? "진실" : "거짓";
		//35<50은 참이므로 "진실"을 변수에 저장
		
		System.out.println("결과  : " + resultChar);
		System.out.println("결과  : " + resultInt);
		System.out.println("결과  : " + resultStr);
		*/
		
		
		//10이 홀수인지 짝수인지 구분하는 프로그램
		int num = 10;
		boolean isEven;
		
		isEven = (num % 2 == 0) ? true : false;
		//10을 2로 나눈 나머지는 0이므로 true를 저장
		
		System.out.println("10은 짝수이다? : " + isEven);
		
		isEven = (num % 2 != 0) ? true : false;
		//조건에 만족하지 않기 때문에 false를 저장
		
		System.out.println("10은 홀수이다? : " + isEven);

	}
	
}
