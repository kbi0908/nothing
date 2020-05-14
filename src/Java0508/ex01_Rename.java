/*
	Date : 2020.05.08
	Author : inchoriya
	Description : Java 기본
	Version : 1.0
 */

package Java0508;

public class ex01_Rename {

	public static void main(String[] args) {
		String name = "구민성";
		String birth = "10월 2일";
		int age = 24;
		String adr = "산곡2동";
		String phone = "010-3912-0278";
		String email = "kbi0908@naver.com";
		String hobby = "산책, 게임";
		String speciality = "기계장치 분해/재조립";
		char blood = 'A';
		
		String member1 = ", 김상민";
		String member2 = ", 안준필";
		String member3 = ", 김혁";
		
		
		
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birth);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adr);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
		System.out.println("취미 : " + hobby);
		System.out.println("특기 : " + speciality);
		System.out.println("혈액형 : " + blood);
		System.out.println("팀원 : " + name + member1 + member2 + member3);
	}

}
