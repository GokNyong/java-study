
public class OperatorEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("10 == 10.0f	\t %b%n", 10==10.0f); // true 더 큰 데이터 타입으로 변환 후 비교
		System.out.printf("'0' == 0 	\t %b%n", '0'==0); // 48 == 0 -> false
		System.out.printf("'A' == 65	\t %b%n", 'A'==65); // 65 == 65 -> true
		System.out.printf("'A' > 'B'	\t %b%n", 'A' > 'B'); // 65 > 66 -> false
		System.out.printf("'A'+1 != 'B'	\t %b%n", 'A'+1 != 'B'); // 66 != 66 -> false
	}

}
