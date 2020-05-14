/*
	Date : 2020.05.13
	Author : 구민성
	Description : while
	Version : 1.0
 */

package Java0513;

public class ex08_while {
	public static void main(String[] args) {
		/*
		 * while (반복조건) { 실행 내용 }
		 */
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
