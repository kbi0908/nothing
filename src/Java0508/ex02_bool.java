package Java0508;

public class ex02_bool {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		boolean bool1 = true;
		System.out.println(bool1);
		
		boolean bool2 = false;
		System.out.println(bool2);
		
		boolean bool3;
		
		//num1과 num2를 비교해 참 거짓을 판별하는 if구문
		if(num1>num2) {				
			bool3 = false;
		}
		else {
			bool3 = true;
		}
		System.out.println(bool3);
	}
}
