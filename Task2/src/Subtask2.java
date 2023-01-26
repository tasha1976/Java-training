
public class Subtask2 {
	 public static int substrCount(String input, String needle, int offset, int length) {
		 
		 return input.substring(offset, length + offset).split(needle, -1).length - 1;
	    }

	    public static void main(String[] args) {

	          System.out.println(substrCount("Good Golly Miss Molly", "ll", 1, 20));

	    }
	}