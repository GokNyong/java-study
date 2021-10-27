
public class Quiz4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=3; j++) {
				int x = j+1+(i-1)/3*3;
				int z = j+i;
				int y = i%3==0 ? 3 : i%3;
				System.out.printf("%d * %d = %d\t", x, y, x*y);
			}
			System.out.println();
		}
	}

}
