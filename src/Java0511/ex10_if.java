/*
	Date : 2020.05.11
	Author : 구민성
	Description : 조건문 if
	Version : 1.0
 */

package Java0511;

public class ex10_if {

	public static void main(String[] args) {
		/*
			if(조건식) {
				조건식이 참일 때 실행
			}
			else {
				조건식이 거짓일 때 실행
			}
		 */
		/*
		boolean condition = true;
		
		if(condition) {
			System.out.println("조건만족");
		}
		else {
			System.out.println("조건불만족");
		}
		*/
		
		
		int age = 10;
		
		if(age >= 8) {
			System.out.println("학교에 갑니다.");
		}
		else {
			System.out.println("학교에 가지 않습니다.");
		}
		
		String str1 = "id";
		String str2 = "id";
		
		if(str1.equals(str2)) {
			System.out.println("두 문장이 같다.");
		}
		else {
			System.out.println("두 문장이 다르다.");
		}

	}

}
