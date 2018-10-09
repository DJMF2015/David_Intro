package practice1;

public class Permutation {
	
		public static void main(String args[]) {
			
			permutate("ABG");	
			
		}
	public static void permutate(String fullup) {
		if (fullup ==null || fullup.length()==0) {
		
		System.out.println("must be greater than length of 0");
		return;
		}
		permutate("",fullup);
}	
		private static void permutate(String prefix, String leftover) {
		
			if (leftover.length()==0){
				System.out.println(prefix);
				
				return ;
			}
	for (int i=0;i<leftover.length();i++){
	
		
		permutate(prefix+leftover.charAt(i),leftover.substring(0, i)+leftover.substring(i+1,leftover.length()));
	
	
		

		}		
	}
	
}
