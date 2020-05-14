/*
	Date : 2020.05.14
	Author : 구민성
	Description : day4 정리
	Version : 1.0
 */

package Java0513;

public class Ex00_day4_Summary {
	/*
	 1.반복문 for
	 
	 for(초기화식; 조건식; 증감식) {
	 	실행할 내용;
	 }
	 			┌	<-	<-	<-	<-	<-	┐
	 초기화식 -> 조건식 -> (참일 경우)실행할 내용 -> 증감식
	 			 └> (거짓일 경우)for문 종료 후 빠져나옴
	 
	 2.중첩 for문
	 
	 for(초기화식; 조건식; 증감식) {
	 	(실행할 내용)
	 	for(초기화식; 조건식; 증감식) {	
	 		(실행할 내용)
	 		//반복 횟수 : 외부 for문 * 내부 for문
	 	}
	 	//반복 횟수 : 내부 for문 
	 }
	 
	 
	 
	 3.continue문
	 -반복문과 함께 사용. 특정 조건을 만족시 다른 내용을 실행하지 않고 즉시 증감식으로 돌아감
	 
	 for(초기화식; 조건식; 증감식) {
	 	특정 조건 {
	 		continue;		// 조건을 만족시 실행할 내용;을 실행하지 않고 루프함
	 	}
	 	실행할 내용;			// 조건을 만족하지 않으면 실행할 내용;을 실행후 루프함
	 }
	 			┌	<-	<-	<-	<-	<-	┐
	 초기화식 -> 조건식 -> (참일 경우)실행할 내용 -> 증감식	<┐
	 			 │		└> 특정조건을 만족시 continue 실행
	 			 └> (거짓일 경우)for문 종료 후 빠져나옴
	 
	 
	 4. while문
	 -for문과 같은 반복문
	 
	 (1)for문과 비슷하게 사용하는 방법
	 while(조건식) {
	 	반복할 내용;
	 	증감식;
	 }
	 ┌	<-	<-	<-	┐
	조건식 -> (참일 경우)실행할 내용
	 └> (거짓일 경우)while문 종료 후 빠져나옴
	 
	 (2)반복횟수를 정하지 않는 방법
	 booolean n = true;
	 while(조건변수) {		//조건변수가 참이면 계속해서 반복함
	 	반복할 내용
	 	//반복문 종료하는 법
	 	1) 조건변수를 false만들기
	 	2) 특정 조건에서 break; 사용하기
	 }
	 
	 */

}