import java.util.*;

public class Quiz4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("�� ���� ���� �Է��� ������.");
			} else if (input < answer) {
				System.out.println("�� ���� ���� �Է��� ������.");				
			} else {
				System.out.println(count + "�� ���� ������ ���߾����ϴ�.");	
				break;
			}
			
		} while (true);
	}

}
