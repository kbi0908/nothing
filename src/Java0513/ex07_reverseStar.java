/*
	Date : 2020.05.13
	Author : 구민성
	Description : 별찍기
	Version : 1.0
 */

package Java0513;

public class ex07_reverseStar {
	public static void main(String[] args) {
		char star = '□';
		char equal = '■';
		for (int i = 5; i >= 1; i--) {
			for (int k = 0; k <= 5 - i; k++) {
				System.out.print(star);
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(equal);
			}
			for (int l = 0; l <= 5 - i; l++) {
				System.out.print(star);
			}
			System.out.println();
		}

		for (int i = 2; i <= 5; i++) {
			for (int k = 0; k <= 5 - i; k++) {
				System.out.print(star);
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(equal);
			}
			for (int l = 0; l <= 5 - i; l++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
