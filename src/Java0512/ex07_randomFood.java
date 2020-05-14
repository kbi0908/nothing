/*
	Date : 2020.05.12
	Author : 구민성/김상민/김혁/안준필
	Description : randomFoodRecommand
	Version : 1.0
 */

package Java0512;

import java.util.ArrayList;

public class ex07_randomFood {

	public static void main(String[] args) {
		
		ArrayList<String> num2 = new ArrayList<String>();
		
		int num;
		String menu = "";
		String menu2 = "";
		String drink = "";
		num = (int)(Math.random() * 5) + 1;
		int num3;

		
		switch(num) {
		case 1:
			menu = "한식";
			num2.add("갈비탕");
			num2.add("찜닭");
			num2.add("산채비빔밥");
			num2.add("김치찌개");
			num3 = (int)(Math.random() * num2.size()) + 1;
			menu2 = num2.get(num3);
			drink = "소주";
			break;
		case 2:
			menu = "일식";
			num2.add("스시");
			num2.add("돈카츠");
			num2.add("돈부리");
			num2.add("우동");
			num3 = (int)(Math.random() * num2.size()) + 1;
			menu2 = num2.get(num3);
			drink = "사케";
			break;
		case 3:
			menu = "중식";
			num2.add("짜장류");
			num2.add("돈파육");
			num2.add("훠궈");
			num2.add("마라탕");
			num3 = (int)(Math.random() * num2.size()) + 1;
			menu2 = num2.get(num3);
			drink = "고량주";
			break;
		case 4:
			menu = "양식";
			num2.add("파스타");
			num2.add("피자");
			num2.add("스테이크");
			num2.add("수제버거");
			num3 = (int)(Math.random() * num2.size()) + 1;
			menu2 = num2.get(num3);
			drink = "와인";
			break;
		case 5:
			menu = "분식";
			num2.add("김밥");
			num2.add("떡볶이");
			num2.add("순대");
			num2.add("라면");
			num2.add("튀김");
			num3 = (int)(Math.random() * num2.size()) + 1;
			menu2 = num2.get(num3);
			drink = "탄산음료";
			break;
		default:
			break;
		}
		
		System.out.println("오늘 점심은 " + menu + "입니다.");
		System.out.println(menu+"중 " + menu2 + "(이)가 맛있어");
		System.out.println(menu2+"에 " + drink + "한잔 딱!");
	}

}
