
public class SubTask6 {

		private static final int SYSTEM = 26;
	    private static final int START_SYMBOL = 64;

	    public static int chars2digits(String number) {
	        int sum = 0;
	        for (int i = 0; i < number.length(); i++) {
	            char symbol = number.charAt(i);
	            int symbolDig = symbol - START_SYMBOL;// 1 -26
	            sum += Math.pow(SYSTEM, number.length() - 1 - i) * symbolDig;
	        }
	        sum += Math.pow(SYSTEM, 0) - 1;
	        return sum;
	    }

	    public static String digits2chars(int number) {
	        StringBuilder str = new StringBuilder();


	        while (number > SYSTEM) {

	            int cel = number / SYSTEM - (number % 26 == 0 ? 1 : 0);
	            int ost = number - cel * SYSTEM;
	            ost = (ost == 0 ? 26 : ost);
	            number = cel;
	            str.append((char) (ost + START_SYMBOL));
	        }
	        str.append((char) (number + START_SYMBOL));
	        return str.reverse().toString();
	    }


	    public static void main(String[] args) {

	        System.out.println(digits2chars(12));
	        System.out.println(chars2digits("Z"));

	}

}
