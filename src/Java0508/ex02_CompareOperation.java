/*
	Date : 2020.05.08
	Author : inchoriya
	Description : 대소/문자열 비교
	Version : 1.0
 */

package Java0508;

public class ex02_CompareOperation {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;

		boolean result;
		result = num1 > num2;
		System.out.println(num1 + ">" + num2 + " : " + result);
		// [>=]는 크거나 같다. ( 이상 )

		result = num1 < num2;
		System.out.println(num1 + "<" + num2 + " : " + result);
		// [<=]는 작거나 같다. ( 이하 )

		result = num1 == num2;
		System.out.println(num1 + "=" + num2 + " : " + result);

		result = num1 != num2;
		System.out.println(num1 + "!=" + num2 + " : " + result);

		// 문자열 비교
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "자바";

		result = str1.equals(str2); // 문자열이 같은지 판별하는 함수
		System.out.println("str1과 str2의 문자열 비교 : " + result);

		result = str1.equals(str3);
		System.out.println("str1과 str3의 문자열 비교 : " + result);

	}

}
