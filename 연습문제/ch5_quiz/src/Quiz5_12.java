import java.util.Scanner;

public class Quiz5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int correct = 0;
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"interger", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
				correct++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, correct);
	}

}
