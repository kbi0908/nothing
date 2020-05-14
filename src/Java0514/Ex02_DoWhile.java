/*
	Date : 2020.05.14
	Author : 구민성
	Description : do - while 예제
	Version : 1.0
 */

package Java0514;

public class Ex02_DoWhile {

	public static void main(String[] args) {
		/*
		 do {
		 	반복할 내용
		 }
		 while(조건식);
		 //조건식이 참이면 do 내용을 반복
		 */
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i <= 10);
		
		i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	}

}
