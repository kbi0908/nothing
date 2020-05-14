/*
	Date : 2020.05.13
	Author : 구민성
	Description : 별찍기
	Version : 3.0
 */

package Java0513;

public class ex06_TriForce {
	public static void main(String[] args) {
		char star = '□';
		char equal = '■';
		for (int i = 1; i <= 5; i++) { // 피라미드를 만드는 구간
			// 공백을 만드는 구간
			for (int k = 0; k <= 10 - i; k++) { // 루프1. 공백을 5번, 루프2. 공백을 4번 ...
				System.out.print(star);
			}
			// 별을 찍는 구간
			for (int j = 1; j <= i * 2 - 1; j++) { // 루프1. *를 1번, 루프2. *을 3번...
				System.out.print(equal);
			}
			for (int l = 0; l <= 10 - i; l++) {
				System.out.print(star);
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 6 - i; k++) {
				System.out.print(star);
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(equal);
			}
			for (int l = 1; l <= 12 - i * 2 - 1; l++) {
				System.out.print(star);
			}

			for (int a = 1; a <= i * 2 - 1; a++) {
				System.out.print(equal);
			}
			for (int b = 1; b <= 6 - i; b++) {
				System.out.print(star);
			}

			System.out.println();
		}
	}

}
