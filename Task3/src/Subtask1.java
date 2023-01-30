import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Subtask1 {
	public static void main(String[] args) throws IOException {
		
	    Scanner sc = new Scanner(System.in);
	    String fileName = sc.nextLine();
	    ArrayList<String> list = new ArrayList<>();
	    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	    while (rd.ready()) {
	      String[] s = rd.readLine().split("\\s");
	      Collections.addAll(list, s);
	    }
	    rd.close();
	    String[] words = new String[list.size()];
	    words = list.toArray(words);
	    StringBuilder result = getLine(words);
	    System.out.println(result.toString());
	    sc.close();
	  }

	  private static StringBuilder getLine(String... words) {
	    ArrayList<String> strings = new ArrayList<>();
	    Collections.addAll(strings, words);
	    StringBuilder sb = new StringBuilder();
	    if (strings.size() == 0) {
	      return new StringBuilder();
	    }

	    sb.append(strings.get(0));
	    strings.remove(0);

	    while (strings.size() > 0) {
	      for (int i = 0; i < strings.size(); i++) {
	        String a = strings.get(i).toUpperCase().toLowerCase();
	        String b = sb.toString().toUpperCase().toLowerCase();
	        if (a.charAt(0) == b.charAt(sb.length() - 1)) { 
	          sb.append(" ").append(strings.get(i));
	          strings.remove(i);
	          continue;
	        }

	        if (b.charAt(0) == a.charAt(a.length() - 1)) { 
	          sb.insert(0, " ");
	          sb.insert(0, strings.get(i));
	          strings.remove(i);
	        }
	      }
	    }
	    return sb;
	  }
	}
