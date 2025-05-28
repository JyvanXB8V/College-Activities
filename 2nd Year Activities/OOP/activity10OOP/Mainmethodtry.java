package activity10OOP;

import java.util.Scanner;

public class Mainmethodtry {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            System.out.println("This program will count all words in a sentence (string).");
            System.out.println();
            
            while (true) {
            System.out.printf("%38s","Input the sentence             : ");
            String sentence = scanner.nextLine();
            int wordCount = Methodtrymain.countWords(sentence);
            
            
            System.out.printf("%39s","Number of words in the sentence: " + wordCount);
            System.out.println();
            System.out.println();
            System.out.printf("%35s","Input another sentence [Y/N]? ");
            String continueInput = scanner.nextLine();
            System.out.println();
            
            if (continueInput.equalsIgnoreCase("N")) {
            	System.out.println();
                System.out.printf("%26s","Program terminated...");
                break;
            }
        }
        scanner.close();
    }

}
