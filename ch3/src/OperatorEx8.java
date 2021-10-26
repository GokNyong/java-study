
public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_0000;
		int b = 2_000_0000;
		
		long c = (long)a * b; // int * int를의 결과가 이미 int타입의 값으로, 값손실이 일어나므로 한가지를 long으로 바꾸어 주어야함
		
		System.out.println(c);
	}

}
