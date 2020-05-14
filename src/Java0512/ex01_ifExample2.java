/*
	Date : 2020.05.12
	Author : 구민성
	Description : if 예제2
	Version : 1.0
 */

package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();

		double tot = kor + eng + mat;
		double avg = tot / 3;
		String grade;

		if (kor > 100 || eng > 100 || mat > 100) {
			System.out.println("점수가 잘못 입력되었습니다.");
		} 
		
		else {
			System.out.println("평균 : " + avg + "점");
			if (avg >= 90) {
				if (avg >= 95) {
					grade = "A+";
				} 
				
				else {
					grade = "A";
				}
				
			} 
			
			else if (avg >= 80) {
				if (avg >= 85) {
					grade = "B+";
				} 
				
				else {
					grade = "B";
				}
				
			} 
			
			else if (avg >= 70) {
				if (avg >= 75) {
					grade = "C+";
				} 
				
				else {
					grade = "C";
				}
				
			} 
			
			else if (avg >= 60) {
				if (avg >= 65) {
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
	}
}
