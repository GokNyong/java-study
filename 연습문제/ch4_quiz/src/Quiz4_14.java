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
			System.out.print("1과 100사이의 값을 입력하세요.>");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("더 낮은 값을 입력해 보세요.");
			} else if (input < answer) {
				System.out.println("더 높은 값을 입력해 보세요.");				
			} else {
				System.out.println(count + "번 만에 정답을 맞추었습니다.");	
				break;
			}
			
		} while (true);
	}

}
