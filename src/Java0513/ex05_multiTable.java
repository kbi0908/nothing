/*
	Date : 2020.05.13
	Author : 구민성
	Description : 구구단
	Version : 1.0
 */

package Java0513;

public class ex05_multiTable {
	public static void main(String[] args) {
		int multi = 0;
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				multi = j * i;
				System.out.print(j+"×"+i+" = "+multi+" \t");
			}
			System.out.print("\n");
		}
	}
}
