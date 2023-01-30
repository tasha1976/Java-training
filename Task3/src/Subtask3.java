import java.util.Arrays;
import java.util.Comparator;

public class Subtask3 {
	private static class ByLetterMeetings implements Comparator<String> {
        private char letter;
        
        ByLetterMeetings(char l) {
            letter = l;
        }
        
        int matchesCount(String s) {
            int found = 0;
            
            for ( char c : s.toCharArray() )
                if ( letter == c )
                    ++found;
            
            return found;
        }
 
        public int compare(String a, String b) {
            int diff = matchesCount(a) - matchesCount(b);
            return ( diff != 0 ) ? diff : a.compareTo(b);
        }
    }
    
    public static void main(String[] args) {
        String s = "молоко кино табло или вино и домино";
        String[] words = s.split(" ");
        Arrays.sort(words, new ByLetterMeetings('о'));
        for ( String w : words )
            System.out.println(w);
 
    }
}

