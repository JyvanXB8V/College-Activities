package quiz3OOP;	

import java.util.Scanner;
import java.util.Arrays;

public class Quiz3main {
	
	public static void main (String[] args ) {
		Scanner scan = new Scanner(System.in);
		char continueInput;
		int[] mainArr = new int[15];
		
		
		System.out.printf("%s","This program stores an array of fifteen inputted numbers and display\n");
		System.out.printf("%s","On the screen the number of Even and Odd numbers, their respective\n");
		System.out.printf("%s","Sum and Average, the Largest number, and the Smallest value.");
		System.out.print("\n");
		
	do {
		int evencount = 0;
		int oddcount = 0;
		int evensum = 0;
		int oddsum = 0;
		System.out.print("\n");
		for (int i = 0; i < 15; i++) {
			System.out.printf("      Input Number[%d] : ", i);
			mainArr[i] = scan.nextInt();
			if (mainArr[i] % 2 == 0) {
				evencount++;
				evensum += mainArr[i];
			} else {
				oddcount++;
				oddsum += mainArr[i];
			}
		}
		
		Arrays.sort(mainArr);
		int secsmallest = mainArr[1];
		int seclargest = mainArr[13];
		
		System.out.print("\n");
		System.out.println("Total Number of Even Numbers: " + evencount);
		System.out.println("The Sum of Even numbers     : " + evensum);
		System.out.printf("The Average of Even numbers : %.2f", evencount == 0 ? 0 : (double) evensum / evencount);
		System.out.println("\n");
		
		System.out.println("Total Number of Odd Numbers : " + oddcount);
		System.out.println("The Sum of Odd Numbers      : " + oddsum);
		System.out.printf("The Average of Odd Numbers  : %.2f", oddcount == 0 ? 0 : (double) oddsum / oddcount);
		System.out.println("\n");
		
		System.out.println("Second Largest Number       : " + seclargest);
		System.out.println("Second Smallest Number      : " + secsmallest);
		
		System.out.print("\n");
		System.out.print("Input Another? [Y/N] : ");
		continueInput = scan.next().charAt(0);
		
		if (continueInput == 'N' || continueInput == 'n') {
            break;
        } else if (continueInput != 'Y' && continueInput != 'y') {
            System.out.println("Invalid input, please enter Y or N.");
        }
		
	} while (true);
	
	System.out.print("\n");
    System.out.println("Program Terminated...");
    scan.close();
    
	}
}
