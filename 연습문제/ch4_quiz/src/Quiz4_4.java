
public class Quiz4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 0;
		
		while (sum<100) {
			if (++i%2 == 0) {
				sum -= i;		
			} else {
				sum += i;
			}
		}
		System.out.println("i="+i);
	}

}
