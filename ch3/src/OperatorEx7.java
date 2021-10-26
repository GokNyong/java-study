
public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // 300은 byte형의 범위를 넘기 때문에 다른 값이 저장됨.
		System.out.println(c);
	}

}
