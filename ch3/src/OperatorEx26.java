
public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); // 앞의 피연산자가 true 이므로 뒤의 ++ 단일연산자가 실행되지 않음.
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0); // 앞의 피연산자가 false 이므로 뒤의 ++ 단일연산자가 실행되지 않음.
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
