import java.util.Scanner;

public class SubTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть будь-які числа");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = a+b;
		System.out.printf("%.2f", c);
		System.out.println();
	}
}