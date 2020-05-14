package Java0508;

public class ex02_char {

	public static void main(String[] args) {
		String str1 = "자바 ";
		String str2 = "재미있어.";
		String str3 = "너무 어려워.";
		
		String result;
		result = str1 + str2;
		System.out.println(result);
		
		result = str1 + str3;
		System.out.println(result);
		
		result = str1 + 8.0;
		System.out.println(result);
		
		System.out.println(str1 + str2);
		System.out.println(str1 + "너무 " + str2);

	}

}
