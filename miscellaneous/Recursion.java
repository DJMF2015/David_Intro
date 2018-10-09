package Functions;

public class Recursion {
	/**
	 * 1) Every rescursicve call must reduce to a simpler task in some way 2) There
	 * Must be a special case for for the simplest tasks directly public static void
	 * main(String[] args) {
	 **/
	public static void main(String args[]) {

		int sideLength = 6;
		Recursion(sideLength -1);
	}

	public static void Recursion(int sideLength) {
		// we don't want print when less<1 (0)
		if (sideLength < 1) {

			return;

		}

		Recursion(sideLength - 1);
		int n=	sideLength;
		for (int i = 2; i <= n; i++) {
			sideLength=sideLength*(sideLength);
			System.out.println(sideLength+"*");
			
		}
	
		
		System.out.println();
	}

	}

