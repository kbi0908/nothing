/*
	Date : 2020.05.12
	Author : 구민성
	Description : switchCase
	Version : 1.0
 */

package Java0512;

import java.util.Scanner;

public class ex04_switchCase {
	
	public static void main(String[] args) {
		/*
		 switch(조건변수) {
		 	case 변수값1 :
		 		조건이 참일때 실행
		 		break;
		 	case 변수값2 :
		 		조건이 참일때 실행
		 		break;
		 	case 변수값n :
		 		조건이 참일때 실행
		 		break;
		 	default :
		 		case의 그 어떤 조건도 참이 아닐 경우 실행
		 		break;
		 }
		 */
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		switch (num) {
		case 0: 	// num이 0일때
			System.out.println("0을 입력했습니다.");
			break; 	// 해당 switch/case문 종료
					// (사용하지 않으면 다음 case도 무조건 실행함)
		case 1:
			System.out.println("1을 입력했습니다.");
			break;
		case 2:
			System.out.println("2를 입력했습니다.");
			break;
		default:
			System.out.println("그 외에 숫자를 입력했습니다.");
			break;
		}
		
		
	}

}
