
public class SubTask3 {
	public static void main (String[] args){
		System.out.println("Найбільший спільний дільник двох чисел:");
		System.out.print(gcd(12, 18));
	}
		public static int gcd(int a,int b) {
			 a = Math.abs(a);
			 b = Math.abs(b);
			 if (b>a) {
				int tmp = a;
				a = b;
				b = tmp;
			}
		int r = a % b;
		for (; r != 0; ) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
		}
		}
