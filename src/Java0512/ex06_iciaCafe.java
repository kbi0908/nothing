/*
	Date : 2020.05.12
	Author : 구민성
	Description : iciaCafe
	Version : 1.0
 */

package Java0512;

import java.util.Scanner;

public class ex06_iciaCafe {

	public static void main(String[] args) {
		//키오스크 : 무인결제 시스템
		/*
		 아메리카노 - 4,000
		 바닐라라떼 - 4,500
		 자몽허니블랙티 - 5,000
		 바닐라초코칩모카 = 5,500
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		int price = 0;
		String menu = "";
		
		System.out.println("ICIA Cafe에 오신것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다.\n");
		
		// \n : 한줄 띄우기
		// \t : 탭만큼 간격띄우기
		
		System.out.println("1.아메리카노\t\t2.바닐라라떼");
		System.out.println("3.자몽허니블랙티\t\t4.바닐라초코칩모카");
		
		System.out.print("메뉴 선택 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			menu = "아메리카노";
			price = 4000;
			break;
		case 2:
			menu = "바닐라라떼";
			price = 4500;
			break;
		case 3:
			menu = "자몽허니블랙티";
			price = 5000;
			break;
		case 4:
			menu = "바닐라초코칩모카";
			price = 5500;
			break;
		default:
			System.out.println("\n해당 메뉴는 없습니다.");
			break;
		}
		if(num >= 1 && num <= 4) {
			System.out.println("\n주문하신 메뉴는 " + menu);
			System.out.println("가격은 " + price + "원입니다.");
		}
		System.out.println("이용해주셔서 감사합니다.");
	}

}
