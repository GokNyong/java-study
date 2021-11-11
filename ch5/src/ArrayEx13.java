
public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hex = {'C', 'A' ,'F', 'E'};
		
		String[] binary = {"0000", "0001", "0010", "0011"
						 , "0100", "0101", "0110", "0111"
						 , "1000", "1001", "1010", "1011"
						 , "1100", "1101", "1110", "1111"};
		
		String result = "";
		
		for (int i=0; i<hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') { // 숫자일 때,
				result += binary[hex[i]-'0'];     // '8' - '0' 은 8의 결과가 나옴
			} else {
				result += binary[hex[i]-'A'+10]; // 'C' - 'A' 는 2의 결과가 나옴
			}
		}
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);
	}

}
