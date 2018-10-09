package practice1;

public class booleanPractice {
	static boolean negative=true;
	public static void main (String args[]) {
		System.out.println(posNeg(-10, -4, negative));	
		System.out.println(posNeg(-1, 2, negative));
		
	}
	public static boolean posNeg(int a,  int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		}
	


}