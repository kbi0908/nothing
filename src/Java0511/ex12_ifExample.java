/*
	Date : 2020.05.11
	Author : 구민성
	Description : 조건문 if 예제
	Version : 1.0
 */

package Java0511;

import java.util.Scanner;

public class ex12_ifExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수입니다.");
		}
		else if(score >= 90) {
			System.out.println("학점 : A");
		}
		else if(score >= 80) {
			System.out.println("학점 : B");
		}
		else if(score >= 70) {
			System.out.println("학점 : C");
		}
		else if(score >= 60){
			System.out.println("학점 : D");
		}
		else {
			System.out.println("학점 : F");
		}

	}

}
