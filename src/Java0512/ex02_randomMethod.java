/*
	Date : 2020.05.12
	Author : 구민성
	Description : random 메소드 
	Version : 1.0
 */

package Java0512;

public class ex02_randomMethod {

	public static void main(String[] args) {
		//랜덤 메소드 : 특정 범위내 숫자 하나를 출력하는 메소드
		//Math.random() => 0보다 크거나 같고, 1보다 작은 숫자를 무작위로 발생
		/*
		int ranNum;
		ranNum = (int)(Math.random() * 10) + 1;
		System.out.println(ranNum);
		//(int)(Math.random() * N) + S;
		//N : 끝 		S : 시작
		*/
		
		int dice = (int)(Math.random() * 6) + 1;
		//1부터 6까지의 정수를 무작위로 발생시켜 dice변수에 저장
		System.out.println("주사위 눈 : " + dice);
		
		
		
//		int lotto = (int)(Math.random() * 45) + 1;
//		System.out.println(lotto);
			
		}
}

