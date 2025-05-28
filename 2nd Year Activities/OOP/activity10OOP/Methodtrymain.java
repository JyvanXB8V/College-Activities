package activity10OOP;

public class Methodtrymain {
	
	public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
        
    }

}
