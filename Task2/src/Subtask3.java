import java.util.Scanner;

public class Subtask3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int range = 100;
		int number = (int)(Math.random()*range);
		while (true) {
			System.out.println("Вгадайте число від 0 до  " + range);
			int input_number = sc.nextInt();
			if (input_number == number) {
				System.out.println("Молодець!");
			break;
			} else if (input_number > number) {
				System.out.println("Багато");
			} else {
				System.out.println("Меньше");
			}
		 sc.close();
		}
	}
	}

