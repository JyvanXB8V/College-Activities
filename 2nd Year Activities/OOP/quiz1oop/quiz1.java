package quiz1oop;

import java.util.Scanner;

public class quiz1 {
	
	public static void main(String[] args) {
		
		System.out.printf("This program using Decision Control Structures displays the equivalent\n");
		System.out.printf("inputted number in Words.");
		System.out.print("\n");
		System.out.print("\n");	
		
		int number, tens, hundreds, thousands;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.printf("%31s","Enter an Integer Number:  ");
			number = scan.nextInt();
						
		}	
		
        if (number < 1 || number > 3999) {
        	System.out.print("\n");	
            System.out.printf("%34s","You entered an INVALID INPUT.");
            return;
        }
        
        System.out.print("\n");	
		System.out.printf("%18s %2d","The number is",number);
		System.out.print("\n");	
        
        String words = "";
        
        // if the number is thousands
        if (number >= 1000) {
            thousands = number / 1000;
            if (thousands == 3) words += "Three Thousand ";
            else if (thousands == 2) words += "Two Thousand ";
            else if (thousands == 1) words += "One Thousand ";
            number %= 1000;
        }

        // if the number is hundreds
        if (number >= 100) {
             hundreds = number / 100;
            if (hundreds == 9) words += "Nine Hundred ";
            else if (hundreds == 8) words += "Eight Hundred ";
            else if (hundreds == 7) words += "Seven Hundred ";
            else if (hundreds == 6) words += "Six Hundred ";
            else if (hundreds == 5) words += "Five Hundred ";
            else if (hundreds == 4) words += "Four Hundred ";
            else if (hundreds == 3) words += "Three Hundred ";
            else if (hundreds == 2) words += "Two Hundred ";
            else if (hundreds == 1) words += "One Hundred ";
            number %= 100;
        }

        // if the number is tens
        if (number >= 20) {
             tens = number / 10;
            if (tens == 9) words += "Ninety ";
            else if (tens == 8) words += "Eighty ";
            else if (tens == 7) words += "Seventy ";
            else if (tens == 6) words += "Sixty ";
            else if (tens == 5) words += "Fifty ";
            else if (tens == 4) words += "Forty ";
            else if (tens == 3) words += "Thirty ";
            else if (tens == 2) words += "Twenty ";
            number %= 10;
        }

        // if the number is ones
        if (number > 0) {
            if (number == 19) words += "Nineteen ";
            else if (number == 18) words += "Eighteen ";
            else if (number == 17) words += "Seventeen ";
            else if (number == 16) words += "Sixteen ";
            else if (number == 15) words += "Fifteen ";
            else if (number == 14) words += "Fourteen ";
            else if (number == 13) words += "Thirteen ";
            else if (number == 12) words += "Twelve ";
            else if (number == 11) words += "Eleven ";
            else if (number == 10) words += "Ten ";
            else if (number == 9) words += "Nine ";
            else if (number == 8) words += "Eight ";
            else if (number == 7) words += "Seven ";
            else if (number == 6) words += "Six ";
            else if (number == 5) words += "Five ";
            else if (number == 4) words += "Four ";
            else if (number == 3) words += "Three ";
            else if (number == 2) words += "Two ";
            else if (number == 1) words += "One ";
        }
        
        System.out.printf("     The number in words    : " + words);
        
	}
	

}