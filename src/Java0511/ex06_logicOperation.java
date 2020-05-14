/*
	Date : 2020.05.11
	Author : 구민성
	Description : 연산자(Operation)
	Version : 1.0
 */

package Java0511;

public class ex06_logicOperation {

	public static void main(String[] args) {
		//논리연산 AND, OR, NOT
		
		//AND연산 &&, 두 값이 모두 true여야 결과값이 true. 그 외엔 false
		
		//OR연산 ||, 두 값중 하나라도 true라면 결과값이 true. 모두 false라면 결과 값은 false
		
		//NOT연산	 !, 현재 논리값을 반전. true는 false로, false는 true로...
		
		boolean result;
		
		result = true && true;
		System.out.println("t&&t : " + result);
		
		result = false && true;
		System.out.println("t&&f :  " + result);
		
		result = false && false;
		System.out.println("f&&f : " + result);
		
		result = true || true;
		System.out.println("t||t : " + result);
		
		result = false || true;
		System.out.println("t||f :  " + result);
		
		result = false || false;
		System.out.println("f||f : " + result);
		
		
		
		boolean result2 = true;
		result2 = !result2;
		System.out.println("!result : " + result2);
		
	}

}
