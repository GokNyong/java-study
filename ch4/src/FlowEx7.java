import java.util.*;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("����� " + user + "�Դϴ�");
		System.out.println("���� " + com + "�Դϴ�");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case -2: case 1:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
//				break;
		}
	}

}