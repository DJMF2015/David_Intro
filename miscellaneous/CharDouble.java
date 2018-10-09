package practice1;


public class CharDouble {
	static long startTime = System.currentTimeMillis()%600;
	public static void main(String args[]) {
		doubleChar("Hi-There");
		doubleChar("AAbb");
		
		System.out.println("Number of and’s: " +
		count("this and and  this and that and and this", "and"));	
		
		counttime();
	}

	public static String doubleChar(String str) {
	
		String var = " ";

		for (int i = 0; i < str.length(); i++) {

			str.charAt(i);
			var = var + str.charAt(i) + str.charAt(i);
			
		}
		System.out.println(var);	//count("this and this and that and this", "this");
		
		return var;
	}

	
	
	
	public static int count(String s, String target) {

		int count = 0;
		int n = target.length();
		for (int i =0;i<= s.length()-n; i++) {
			String piece = s.substring(i, i+n);
			if (piece.equals(target)) 
				count++;

		}
		
		return count;   
			}
	
public static void counttime() {
    long startTime = System.currentTimeMillis();

    long total = 0;
    for (int i = 0; i < 10000000; i++) {
       total += i;
    }

    long stopTime = System.nanoTime();
    long elapsedTime = stopTime - startTime;
    System.out.println(elapsedTime);
 }


	}

