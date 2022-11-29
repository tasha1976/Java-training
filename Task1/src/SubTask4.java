import java.util.Scanner;

public class SubTask4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Сума розрядів числа: ");
	    System.out.println((num % 10) + (num / 10) % 10 + (num / 100));

	}

}
