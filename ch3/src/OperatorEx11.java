
public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		// 문자간의 사칙연산은 정수간의 연산과 동일하다.
		System.out.printf("'%c'-'%c = %d%n", d, a, d - a); // 'd' - 'a' = 3
		System.out.printf("'%c'-'%c = %d%n", two, zero, two - zero); // '2' - '0' = 2
		System.out.printf("'%c'=%d%n", a, (int)a);
		System.out.printf("'%c'=%d%n", d, (int)d);
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two, (int)two);
	}

}
