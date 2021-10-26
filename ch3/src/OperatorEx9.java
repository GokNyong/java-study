
public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1_000_0000 * 1_000_0000; // int * int의 최댓값을 넘으므로 오버플로우가 발생.
		long b = 1_000_0000 * 1_000_0000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
