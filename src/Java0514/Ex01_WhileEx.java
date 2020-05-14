/*
	Date : 2020.05.14
	Author : 구민성
	Description : while 예제
	Version : 1.0
 */

package Java0514;

import java.util.Scanner;

public class Ex01_WhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int money = 0;
		int select;
		int moneyError;
		
		while (run) {
			System.out.println("┌──────────────────────┐");
			System.out.println("│1.예금|2.출금|3.잔고|4.종료 │");
			System.out.println("└──────────────────────┘");
			System.out.print("선택>>");
			select = sc.nextInt();
			System.out.println("Loading···");
			
			
			switch (select) {
			case 1:
				System.out.print("예금액 : ");
				money += sc.nextInt();			//입력한 예금액 잔고에 합하여 저장
				break;
			case 2:
				System.out.print("출금액 : ");
				moneyError = sc.nextInt();
				if (money < moneyError) {		//출금액이 잔고보다 높으면 출금되지 않음
					System.out.println("잔고가 모자랍니다.\n\n");
					continue;
				} else {
					money -= moneyError;		//잔고에서 출금액만큼 뺀뒤에 저장
				}
				break;
			case 3:
				System.out.println("현재 잔고액 : " + money);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;					//더이상 반복되지 않고 프로그램 종료
				break;
			default:
				System.out.println("유효한 입력이 아닙니다.");
				break;
			}
			System.out.println("\n\n");
		}

	}

}
