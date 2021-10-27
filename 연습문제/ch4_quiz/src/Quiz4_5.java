
public class Quiz4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 1;
		
		while (i++ <= 10) {
			while (j++ <= i) {
				System.out.print("*");
			}
			j = 1;
			System.out.println();
		}
	}

}
