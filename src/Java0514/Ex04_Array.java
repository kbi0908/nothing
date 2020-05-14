/*
	Date : 2020.05.14
	Author : 구민성
	Description : 배열
	Version : 1.0
 */

package Java0514;

public class Ex04_Array {

	public static void main(String[] args) {
		/*
		 * 배열 : 같은 변수타입의 데이터를 하나의 변수에 저장하는 구조 
		 * 배열 선언 
		 * ㄱ.타입[] 배열 이름; => int[] num1 
		 * ㄴ.타입 배열이름[]; => int num1[];
		 * 
		 * 배열 초기화 
		 * num1 = new int[] {1, 2, 3, 4, 5};
		 * 
		 * 배열 선언 초기화 
		 * int[] num3 = {10, 11, 12, 13, 14, 15};
		 * 
		 * 배열변수.length
		 * 해당 배열의 길이를 나타낸다.
		 * 
		 */
		int score[] = {90, 80, 85};
		int tot = 0;
		double avg;
		
		for(int i=0; i<score.length; i++) {
			tot += score[i];
			System.out.println("score[" + i + "] : " + score[i]);
		}
		avg = (double)tot/score.length;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}

}
