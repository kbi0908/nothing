/*
	Date : 2020.05.12
	Author : 구민성
	Description : loopFor
	Version : 1.0
 */

package Java0512;

public class ex08_loopFor {
	public static void main(String[] args) {
		//안녕하세요 10번 출력
		//반복문 for
		/*
		 for(초기화식; 조건식; 증감식) {
		 	반복할 내용
		 }
		 */
		
		//1에서 10까지의 합
		
		int i;
		int sum = 0;
		for(i=1; i<=10; i++) {
			sum = sum+i;	// sum += i; 와 같은 의미
		}
		System.out.println("결과 : " + sum);
	}
	

}
