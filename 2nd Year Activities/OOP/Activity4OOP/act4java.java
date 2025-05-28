package Activity4OOP;

import java.util.Scanner;

public class act4java {
	public static void main(String[] args) {
		
		System.out.printf("This program using Decision and Repetition Control Structures displays how many digit/s inputted\n");
		System.out.printf("by the user, the equivalent inputted number in words, and in Roman Numerals.");
		System.out.print("\n");
		System.out.print("\n");	
		
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.printf("%34s","Enter an Integer Number: ");
			 int number = scanner.nextInt();
			 
			 if (number < 0 || number > 99999) {
				    System.out.print("\n");	
			        System.out.printf("%38s","You entered an INVALID INPUT.");
			        
			        return;
			    }
			 System.out.print("\n");	
			 int dgtcnts = countDigits(number);
			 System.out.println(convertToWords(dgtcnts));
			 
			 System.out.printf("%22s %2d","The number is",number);
				System.out.print("\n");	

			    String words = convertToWords(number);
			    System.out.printf("%29s %3s %2s","The number in words ",":",words);
			    System.out.print("\n");
			    
			  if (number >= 1 || number <= 3999) {
				  String romanNumerals = convertToRomanNumerals(number);
			      System.out.printf("%28s %4s %2s","In Roman Numerals: ",":", romanNumerals);
			  } else {
				  System.out.println("In Roman Numerals : INPUT OUT OF RANGE");
			}
		}
	      
	}
	
	private static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
            number /= 10;
		}
		return count;
	}
	
	private static String convertToWords(int number) {
		String words = "";
		if (number >= 1000) {
			words += convertThousands(number / 1000) + " Thousand ";
			number %= 1000;
		}
		if (number >= 100)  {
			words += convertHundreds(number / 100) + " Hundred ";
			number %= 100;
		}
		if (number >= 20) {
			words += convertTens(number / 10) + " ";
			number %= 10;
		}
		if (number >= 0) {
			words += convertOnes(number);
		}
		return words.trim();
	}
	
	
	private static String convertThousands(int thousands) {
		switch (thousands) {
		case 1: return "One";
        case 2: return "Two";
        case 3: return "Three";
        default: return "";
		}		
	}
	
	private static String convertHundreds(int hundreds) {
		switch (hundreds) {
		case 1: return "One";
		case 2: return "Two";
		case 3: return "Three";
        case 4: return "Four";
        case 5: return "Five";
        case 6: return "Six";
        case 7: return "Seven";
        case 8: return "Eight";
        case 9: return "Nine";
        default: return "";
		}
	}
	
	private static String convertTens(int tens) {
		switch (tens) {
		case 2: return "Twenty";
		case 3: return "Thirty";
        case 4: return "Forty";
        case 5: return "Fifty";
        case 6: return "Sixty";
        case 7: return "Seventy";
        case 8: return "Eighty";
        case 9: return "Ninety";
        default: return "";
		}
	}
	
	private static String convertOnes(int ones) {
		switch (ones) {
		case 1: return "One";
		case 2: return "Two";
		case 3: return "Three";
		case 4: return "Four";
		case 5: return "Five";
		case 6: return "Six";
		case 7: return "Seven";
		case 8: return "Eight";
		case 9: return "Nine";
		case 10: return "Ten";
		case 11: return "Eleven";
		case 12: return "Twelve";
		case 13: return "Thirteen";
		case 14: return "Fourteen";
		case 15: return "Fifteen";
		case 16: return "Sixteen";
		case 17: return "Seventeen";
		case 18: return "Eighteen";
		case 19: return "Nineteen";
		default: return "";
		}
	}
	
	private static String convertToRomanNumerals(int number) {
		String romanNumerals = "";
		while (number >= 0) {
			if (number >= 1000) {
                romanNumerals += "M";
                number -= 1000;
            } else if (number >= 900) {
                romanNumerals += "CM";
                number -= 900;
            } else if (number >= 500) {
                romanNumerals += "D";
                number -= 500;
            } else if (number >= 400) {
                romanNumerals += "CD";
                number -= 400;
            } else if (number >= 100) {
                romanNumerals += "C";
                number -= 100;
            } else if (number >= 90) {
                romanNumerals += "XC";
                number -= 90;
            } else if (number >= 50) {
                romanNumerals += "L";
                number -= 50;
            } else if (number >= 40) {
                romanNumerals += "XL";
                number -= 40;
            } else if (number >= 10) {
                romanNumerals += "X";
                number -= 10;
            } else if (number >= 9) {
                romanNumerals += "IX";
                number -= 9;
            } else if (number >= 5) {
                romanNumerals += "V";
                number -= 5;
            } else if (number >= 4) {
                romanNumerals += "IV";
                number -= 4;
            } else {
                romanNumerals += "I";
                number -= 1;
            }
        }
        return romanNumerals;

		}
	}
	