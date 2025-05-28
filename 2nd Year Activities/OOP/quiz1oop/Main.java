package quiz1oop;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int num, thous, hunds, tens;
        
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("This program using Decision Control Structures displays the equivalent" 
			+ "\n" + "inputted number in Words.");
			System.out.print("\n");
			System.out.print("Enter an Integer Number: ");
			num = scan.nextInt();
		}
        
        
        System.out.println("The number is " + num);

        if (num < 1 || num > 3999) {
            System.out.println("You entered an INVALID INPUT.");
            return;
        }
        

        String words = "";

        // Handle thousands
        if (num >= 1000) {
            thous = num / 1000;
            if (thous == 3) words += "Three Thousand ";
            else if (thous == 2) words += "Two Thousand ";
            else if (thous == 1) words += "One Thousand ";
            num %= 1000;
        }

        // Handle hundreds
        if (num >= 100) {
             hunds = num / 100;
            if (hunds == 9) words += "Nine Hundred ";
            else if (hunds == 8) words += "Eight Hundred ";
            else if (hunds == 7) words += "Seven Hundred ";
            else if (hunds == 6) words += "Six Hundred ";
            else if (hunds == 5) words += "Five Hundred ";
            else if (hunds == 4) words += "Four Hundred ";
            else if (hunds == 3) words += "Three Hundred ";
            else if (hunds == 2) words += "Two Hundred ";
            else if (hunds == 1) words += "One Hundred ";
            num %= 100;
        }

        // Handle tens and ones
        if (num >= 20) {
             tens = num / 10;
            if (tens == 9) words += "Ninety ";
            else if (tens == 8) words += "Eighty ";
            else if (tens == 7) words += "Seventy ";
            else if (tens == 6) words += "Sixty ";
            else if (tens == 5) words += "Fifty ";
            else if (tens == 4) words += "Forty ";
            else if (tens == 3) words += "Thirty ";
            else if (tens == 2) words += "Twenty ";
            num %= 10;
        }

        // Handle ones
        if (num > 0) {
            if (num == 19) words += "Nineteen ";
            else if (num == 18) words += "Eighteen ";
            else if (num == 17) words += "Seventeen ";
            else if (num == 16) words += "Sixteen ";
            else if (num == 15) words += "Fifteen ";
            else if (num == 14) words += "Fourteen ";
            else if (num == 13) words += "Thirteen ";
            else if (num == 12) words += "Twelve ";
            else if (num == 11) words += "Eleven ";
            else if (num == 10) words += "Ten ";
            else if (num == 9) words += "Nine ";
            else if (num == 8) words += "Eight ";
            else if (num == 7) words += "Seven ";
            else if (num == 6) words += "Six ";
            else if (num == 5) words += "Five ";
            else if (num == 4) words += "Four ";
            else if (num == 3) words += "Three ";
            else if (num == 2) words += "Two ";
            else if (num == 1) words += "One ";
        }

        //System.out.println("Enter an integer between 1 and 3999: ");
        System.out.println("The number in words                : " + words);
        
    }
}