/*
	Date : 2020.05.12
	Author : 구민성/김상민/김혁/안준필
	Description : randomFoodRecommand
	Version : 1.0
 */

package Java0512;

import java.util.ArrayList;								//ArrayList를 사용하기 위해 객체를 호출

public class ex_project {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();		//food를 문자열 자료형의 배열로써 선언
		ArrayList<String> drink = new ArrayList<>();	//drink를 문자열 자료형의 배열로써 선언
		
		int num,num2,num3;
		String menu = "";

		num = (int)(Math.random() * 5) + 1;				//1 ~ 5까지의 숫자를 무작위로 발생시켜 num에 저장
		
		switch(num) {									//발생한 num값을 사용하여 switch/case문에 활용
		case 1:
			menu = "한식";
			food.add("갈비탕");							// ooo.add(x) -> 배열에 x라는 value를 순차적으로 저장
			food.add("찜닭");
			food.add("산채비빔밥");
			food.add("김치찌개");
			drink.add("소주");
			drink.add("맥주");
			drink.add("사케");
			drink.add("탄산");
			
			break;										//조건을 만족하여 명령을 실행한 후switch문 종료
		case 2:
			menu = "일식";
			food.add("스시");
			food.add("돈카츠");
			food.add("돈부리");
			food.add("우동");

			drink.add("소주");
			drink.add("맥주");
			drink.add("사케");
			drink.add("탄산");
			break;
		case 3:
			menu = "중식";
			food.add("짜장");
			food.add("동파육");
			food.add("훠궈");
			food.add("마라탕");

			drink.add("소주");
			drink.add("맥주");
			drink.add("고량주");
			drink.add("탄산");
			break;
		case 4:
			menu = "양식";
			food.add("파스타");
			food.add("피자");
			food.add("스테이크&샐러드");
			food.add("수제버거");

			drink.add("소주");
			drink.add("맥주");
			drink.add("와인");
			drink.add("탄산");
			break;
		case 5:
			menu = "분식";
			food.add("김밥");
			food.add("라면");
			food.add("떡볶이&튀김");
			food.add("순대");

			drink.add("환타");
			drink.add("쿨피스");
			drink.add("사이다");
			drink.add("콜라");
			break;
		default:
			break;
		}
		num2 =(int)(Math.random() * food.size()) + 1;				//1 ~ 지정한 배열의 갯수 사이에서 무작위 숫자를 발생시켜 변수에 저장
		num3 =(int)(Math.random() * drink.size()) + 1;
		
		String s = food.toString();									//food라는 문자열 배열을 변수 s로 저장
		s = s.substring(1, s.length()-1);							//배열 s를 출력시 첫번째 글자([)와 마지막 글자(])를 제거
		
		System.out.println("뽑은 메뉴는 "+menu+"입니다"); 
		System.out.println(menu+"에는 " + s +"등이 있습니다");
		System.out.println("음식은 "+food.get(num2)+"입니다.");			//지정한 배열에 무작위로 지정된 숫자 index에 있는 값을 출력
		System.out.println("음료수는 "+ drink.get(num3) +"입니다.");
		
	}

}