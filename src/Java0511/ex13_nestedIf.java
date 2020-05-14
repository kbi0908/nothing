/*
	Date : 2020.05.11
	Author : 구민성
	Description : 다중 if문
	Version : 1.0
 */

package Java0511;

import java.util.Scanner;

public class ex13_nestedIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String grade;
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				if(score >= 95) {
					grade = "A+";
				}
				else {
					grade = "A";
				}
			}
			else if(score >= 80) {
				if(score >= 85) {
					grade = "B+";
				}
				else {
					grade = "B";
				}
			}
			else if(score >= 70) {
				if(score >= 75) {
					grade = "C+";
				}
				else {
					grade = "C";
				}
				
			}
			else if (score >= 60) {
				if(score >= 65) {
					grade = "D+";
				}
				else {
					grade = "D";
				}
			}
			else {
				grade = "F";
			}
			System.out.println("학점 : " + grade);
		}
		else {
			System.out.println("잘못된 점수입니다.");
		}

	}

}
