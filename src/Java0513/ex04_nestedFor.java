/*
	Date : 2020.05.13
	Author : 구민성
	Description : 중첩for문
	Version : 1.0
 */

package Java0513;

public class ex04_nestedFor {
	public static void main(String[] args) {
		System.out.println("●======================●");
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("| i값 : " + i + "\t");
				System.out.println("j값 : " + j + " |");
			}
			System.out.println("●======================●");
		}
	}

}
