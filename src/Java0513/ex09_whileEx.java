/*
	Date : 2020.05.13
	Author : 구민성
	Description : while
	Version : 1.0
 */

package Java0513;

public class ex09_whileEx {
	public static void main(String[] args) {
		boolean run = true;
		int dice;
		int count = 0;
		
		//반복문 시작
		while (run) { 
			//dice에 주사위 값을 저장
			dice = (int) (Math.random() * 6) + 1;
			count ++;
			System.out.println("주사위 눈 : " + dice);
			if (dice == 5)
				//눈이 5가 나오면 run을 false로 저장해 while문 종료
				run = false;
		}
		System.out.println("총 " + count + "번 던졌습니다.");

	}

}
