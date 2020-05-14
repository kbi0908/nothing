/*
	Date : 2020.05.11
	Author : 구민성
	Description : 입력(Input)
	Version : 1.0
 */

package Java0511;

import java.util.Scanner;
//Scanner클래스는 java.util 패키지에 있는 입력 클래스
//java.util.Scanner라는 입력 클래스를 이 클래스에서 사용하도록 불러온다.

public class ex08_Scanner {

	public static void main(String[] args) {
		//스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner sc = new Scanner(System.in);
		//System.in에 있는 새로운 스캐너 객체를 sc로 선언한다.
		
		String name;
		int age;
		String address;
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		//입력한 문자열을 변수에 저장
		
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine().trim();
		//trim() : 앞뒤 공백을 제거하는 명령어
		
		System.out.println("주소를 입력하세요.");
		address = sc.nextLine();
		//입력한 그 라인의 모든 문자열을 변수에 저장
		
		System.out.println();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);

	}

}
