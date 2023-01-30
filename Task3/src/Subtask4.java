
public class Subtask4 {
	public static void main(String[] args) {
	      String text = "В предложении из n слов первое слово поставить на место "
	           + "второго, второе - на место третьего, и т.д., (n-е слово - на место"
	            + " n-го, n-е слово поставить на место первого. В исходном и "
	            + "преобразованном предложениях между словами должны быть или один "
	            + "пробел, или знак препинания и один, пробел.";
	      String result = "";
	      int pos = text.lastIndexOf(" ");
	      int length = text.length();
	      result = String.valueOf(text.charAt(pos - 1)).matches("\\p{Punct}") ? String
	            .valueOf(text.charAt(pos + 1)).toUpperCase()
	            + text.substring(pos + 2, length - 1)
	            + text.substring(pos - 1, pos)
	            + " "
	            + String.valueOf(text.charAt(0)).toLowerCase()
	            + text.substring(1, pos - 1) + text.substring(length - 1)
	            : String.valueOf(text.charAt(pos + 1)).toUpperCase()
	                  + text.substring(pos + 2, length - 1) + " "
	                  + String.valueOf(text.charAt(0)).toLowerCase()
	                  + text.substring(1, pos) + text.substring(length - 1);
	      System.out.println(text);
	      System.out.println(result);
	   }
	}

