package Activity4OOP;

import java.util.Scanner;

public class act4main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueInput;

            System.out.printf("This program using Decision and Repetition Control Structures displays how many digit/s inputted\n");
            System.out.printf("by the user, the equivalent inputted number in words, and in Roman Numerals.");
            System.out.print("\n");

        do { 
        	System.out.print("\n");
        	System.out.printf("%34s","Enter an Integer Number: ");
            int number = scanner.nextInt();
            
            int originalNumber = number;  

            // check if the input is valid
            if (number < 1 && number > 99999) {
                System.out.print("\n");
                System.out.printf("%38s","You entered an INVALID INPUT.");
                System.out.print("\n");
            } else {
                // count digits using a loop
                int numDigits = 0;
                int tempNumber = number;
                while (tempNumber > 0) {
                    tempNumber /= 10;
                    numDigits++;
                }
                // convert numDigits to String
                String numDigitsString = "";
                switch (numDigits) {
                    case 1: numDigitsString = "one"; break;
                    case 2: numDigitsString = "two"; break;
                    case 3: numDigitsString = "three"; break;
                    case 4: numDigitsString = "four"; break;
                    case 5: numDigitsString = "five"; break;
                    case 6: numDigitsString = "six"; break;
                    // add more cases if needed
                }
                System.out.print("\n");
                System.out.printf("%22s %1s %1s","You entered a",numDigitsString,"digit number.");
                System.out.print("\n");
                System.out.printf("%22s %2d","The number is",number);
                System.out.print("\n");  
                System.out.print("         The number in words    : ");

              // save the original number for Roman numeral conversion

                // convert number to words using decision control structures
                // thousands
                
                
                if (number % 10000 == 0) {
                	int tenThousands = number /10000;
	                switch (tenThousands) {
	                case 1: System.out.print("Ten Thousand "); break;
	                case 2: System.out.print("Twenty Thousand "); break;
	                case 3: System.out.print("Thirty Thousand "); break;
	                case 4: System.out.print("Fourty Thousand "); break;
	                case 5: System.out.print("Fifty Thousand "); break;
	                case 6: System.out.print("Sixty Thousand "); break;
	                case 7: System.out.print("Seventy Thousand "); break;
	                case 8: System.out.print("Eighty Thousand "); break;
	                case 9: System.out.print("Ninety Thousand "); break;
	                	
	              
	                	}
                }
                else {
                	int tenThousands = number /10000;
                
		                switch (tenThousands) {
		                case 1: System.out.print("Ten "); break;
		                case 2: System.out.print("Twenty "); break;
		                case 3: System.out.print("Thirty "); break;
		                case 4: System.out.print("Fourty "); break;
		                case 5: System.out.print("Fifty "); break;
		                case 6: System.out.print("Sixty "); break;
		                case 7: System.out.print("Seventy "); break;
		                case 8: System.out.print("Eighty "); break;
		                case 9: System.out.print("Ninety "); break;
		                	
		                	
		                	}
                
                	number = number % 10000;
                
                }
                int thousands = number / 1000;
                switch (thousands) {
                    case 1: System.out.print("One Thousand "); break;
                    case 2: System.out.print("Two Thousand "); break;
                    case 3: System.out.print("Three Thousand "); break;
                    case 4: System.out.print("Four Thousand "); break;
                    case 5: System.out.print("Five Thousand "); break;
                    case 6: System.out.print("Six Thousand "); break;
                    case 7: System.out.print("Seven Thousand "); break;
                    case 8: System.out.print("Eight Thousand "); break;
                    case 9: System.out.print("Nine Thousand "); break;
                }
                number = number % 1000;  // remove thousands (place)

                // hundreds
                int hundreds = number / 100;
                switch (hundreds) {
                    case 1: System.out.print("One Hundred "); break;
                    case 2: System.out.print("Two Hundred "); break;
                    case 3: System.out.print("Three Hundred "); break;
                    case 4: System.out.print("Four Hundred "); break;
                    case 5: System.out.print("Five Hundred "); break;
                    case 6: System.out.print("Six Hundred "); break;
                    case 7: System.out.print("Seven Hundred "); break;
                    case 8: System.out.print("Eight Hundred "); break;
                    case 9: System.out.print("Nine Hundred "); break;
                }
                number = number % 100;  // remove hundreds (place)

             // for tens and ones
                int tens = number / 10;
                int ones = number % 10;
                if (number >= 10 && number <= 19) {
                    switch (number) {
                        case 10: System.out.print("Ten "); break;
                        case 11: System.out.print("Eleven "); break;
                        case 12: System.out.print("Twelve "); break;
                        case 13: System.out.print("Thirteen "); break;
                        case 14: System.out.print("Fourteen "); break;
                        case 15: System.out.print("Fifteen "); break;
                        case 16: System.out.print("Sixteen "); break;
                        case 17: System.out.print("Seventeen"); break;
                        case 18: System.out.print("Eighteen "); break;
                        case 19: System.out.print("Nineteen "); break;
                    }
                    number = 0;
                } else {
                    switch (tens) {
                        case 2: System.out.print("Twenty "); break;
                        case 3: System.out.print("Thirty "); break;
                        case 4: System.out.print("Forty "); break;
                        case 5: System.out.print("Fifty "); break;
                        case 6: System.out.print("Sixty "); break;
                        case 7: System.out.print("Seventy "); break;
                        case 8: System.out.print("Eighty "); break;
                        case 9: System.out.print("Ninety "); break;
                    }
                    switch (ones) {
                        case 1: System.out.print("One "); break;
                        case 2: System.out.print("Two "); break;
                        case 3: System.out.print("Three "); break;
                        case 4: System.out.print("Four "); break;
                        case 5: System.out.print("Five "); break;
                        case 6: System.out.print("Six "); break;
                        case 7: System.out.print("Seven "); break;
                        case 8: System.out.print("Eight "); break;
                        case 9: System.out.print("Nine "); break;
                    }
                }


                System.out.println();  // move to next line after converting number to words

                // roman numerals conv 1-3999 only
                if (originalNumber <= 3999) {
                    System.out.printf("%26s %7s","In Roman Numerals",": "," ");
                    if (originalNumber >= 1000) {
                        System.out.print("M".repeat(originalNumber / 1000));  // repeat 'M' for thousands
                        originalNumber %= 1000;
                    }
                    if (originalNumber >= 900) {
                        System.out.print("CM");
                        originalNumber -= 900;
                    }
                    if (originalNumber >= 500) {
                        System.out.print("D");
                        originalNumber -= 500;
                    }
                    if (originalNumber >= 400) {
                        System.out.print("CD");
                        originalNumber -= 400;
                    }
                    if (originalNumber >= 100) {
                        System.out.print("C".repeat(originalNumber / 100));  // repeat 'C' for hundreds
                        originalNumber %= 100;
                    }
                    if (originalNumber >= 90) {
                        System.out.print("XC");
                        originalNumber -= 90;
                    }
                    if (originalNumber >= 50) {
                        System.out.print("L");
                        originalNumber -= 50;
                    }
                    if (originalNumber >= 40) {
                        System.out.print("XL");
                        originalNumber -= 40;
                    }
                    if (originalNumber >= 10) {
                        System.out.print("X".repeat(originalNumber / 10));  // repeat the 'X' for tens
                        originalNumber %= 10;
                    }
                    if (originalNumber == 9) {
                        System.out.print("IX");
                    } else if (originalNumber >= 5) {
                        System.out.print("V");
                        originalNumber -= 5;
                    } else if (originalNumber == 4) {
                        System.out.print("IV");
                    } else if (originalNumber > 0) {
                        System.out.print("I".repeat(originalNumber));  // repeat the'I' for ones
                    }
                    System.out.println();  // end the Roman numeral output
                } else {
                    System.out.println("	 In Roman Numerals      : INPUT OUT OF RANGE");
                }
            }

            // do while loop
            System.out.print("\nInput Another? [Y/N]: ");
            continueInput = scanner.next().charAt(0);

            // y and n checker
            if (continueInput == 'N' || continueInput == 'n') {
                break;
            } else if (continueInput != 'Y' && continueInput != 'y') {
                System.out.println("Invalid input, please enter Y or N.");
            }

        } while (true);

        System.out.println("Program Terminated...");
        scanner.close();
    }
}
