import java.util.*;

public class Quiz5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			//shuffle
			for (int j=0; j<question.length; j++) {
				char tmp = ' ';
				int target = (int)(Math.random() * question.length);
				
				tmp = question[i];
				question[i] = question[target];
				question[target] = tmp;
			}
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
		
	}

}
