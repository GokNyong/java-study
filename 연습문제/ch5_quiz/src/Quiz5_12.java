import java.util.Scanner;

public class Quiz5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int correct = 0;
		
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"interger", "����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n%n");
				correct++;
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		}
		System.out.printf("��ü %d���� �� %d���� ���߼̽��ϴ�.", words.length, correct);
	}

}
