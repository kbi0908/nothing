/*
	Date : 2020.05.13
	Author : 구민성
	Description : continue	
	Version : 1.1
 */

package Java0513;

public class ex03_continue {
	public static void main(String[] args) {
		//continue문은 반복문과 함께 사용
		//반복문 안에서 continue를 받으면 그 이후 문장을 수행하지 않고 for문의 증감식을 수행
		/*
		 for(초기화식; 조건식; 증감식) {
		 	특정 조건;
		 	continue;
		 	
		 	반복문 수행;
		 }
		 
		 */
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("총합 : " + sum);
		
	}

}
