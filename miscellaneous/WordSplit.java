package practice1;

public class WordSplit {


public static void main(String[] args) {
	
	   String sampleSentence = "Thequick  brownfox  jumpsoverthelazydog";
	   String[] words = sampleSentence.split("\\s");//matches one or more whitespaces
	   int itemCount = words.length;
	   System.out.println("The number of words is: " + itemCount);
	   for (int i = 0; i < itemCount; i++) {
	      String word = words[i];
	      System.out.println(word);
	   }
}

}