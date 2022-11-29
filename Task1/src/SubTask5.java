import java.util.Scanner;

public class SubTask5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введіть значення n: ");
		int n = scanner.nextInt();
		String s = "";
		for(int i = 1; i <= n; i++) {
			s += String.valueOf(i) + " ";}
	            System.out.println(s);
	        }
	}


