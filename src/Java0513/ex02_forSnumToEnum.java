/*
	Date : 2020.05.13
	Author : 구민성
	Description : For 예제 [S에서 N까지 모든 수의 합]
	Version : 1.1
 */

package Java0513;

import java.util.Scanner;

public class ex02_forSnumToEnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int sNum, eNum;
		int min, max;
		int sum = 0;
		
		System.out.print("첫번째 값 : ");
		sNum = sc.nextInt();
		System.out.print("두번째 값 : ");
		eNum = sc.nextInt();
		
		min = Math.min(sNum, eNum);		//더 작은 값을 min에 저장
		max = Math.max(sNum, eNum);		//더 큰 값을 max에 저장
		
		for(int i=min; i<=max; i++) {
			sum += i;
			//sum = sum + i;
			if(i!=10) {
				System.out.print(i+"+");
			}
			else {
				System.out.print(i+"="+sum);
			}	
		}
		System.out.println("\n총합 : " + sum);
	}

}
