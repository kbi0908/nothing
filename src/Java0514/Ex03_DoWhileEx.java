/*
	Date : 2020.05.14
	Author : 구민성
	Description : do-while(Up&Down 게임)
	Version : 1.0
 */

package Java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 45) + 1;		//1에서 45사이의 숫자 하나를 무작위로 발생
		int input = 0;
		int count = 0;
		
		boolean run = true;								//계속 반복시켜줄 bool자료형 변수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Up & Down game Start!");
		
		do {
			System.out.println("1부터 45까지의 숫자를 말하세요.");
			input = sc.nextInt();
			count++;									//횟수 카운트
			if(input < answer) {						//입력값이 낮으면 Up!을 출력
				System.out.println("Up!");
			}
			else if(input > answer) {					//입력값이 높으면 Down!을 출력
				System.out.println("Down!");
			}
			else {										//입력값과 정답이 같으면 정답과 승리횟수를 출력
				System.out.println("정답은 " + answer + " 입니다!");
				System.out.println("총 시도한 횟수는 " + count + "번 입니다.");
					if(count <= 5) {
						System.out.println("당신이 이겼습니다!");
					}
					else {
						System.out.println("저의 승리입니다!");
					}
				run = false;
				continue;
			}
			System.out.println("\n현재 횟수는 " + count + "번 입니다.\n\n");
		}
		while(run);
	}

}
