package activity9OOP;

import java.util.Scanner;

public class Act9methodtry {
	
	public static boolean areConsecutive(int num1, int num2, int num3, int num4) {
        // Check if the numbers are in consecutive order
        if (num2 == num1 + 1 && num3 == num2 + 1 && num4 == num3 + 1) {
            return true;
        }
        return false;
	}

    public static void main(String[] args) {
    	
    	
    	System.out.println("This Program Will Check the inputted 4  integers if consecutive or not.");
    	System.out.println();
    	int num1,num2,num3,num4;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Input the four numbers
            System.out.print("\tInput the first number : ");
            num1 = scanner.nextInt();
            System.out.print("\tInput the second number: ");
             num2 = scanner.nextInt();
            System.out.print("\tInput the third number : ");
             num3 = scanner.nextInt();
            System.out.print("\tInput the fourth number: ");
             num4 = scanner.nextInt();

            // Check if the numbers are consecutive
            System.out.println();
            if (areConsecutive(num1, num2, num3, num4)) {
                System.out.println("The 4 numbers are consecutive.");
            } else {
                System.out.println("The 4 numbers are not consecutive.");
            }

            // Ask the user if they want to check another set of numbers
            System.out.println();
            System.out.print("Input another [Y/N]? ");
            String input = scanner.next();
            System.out.println();
            if (input.equalsIgnoreCase("N")) {
                System.out.println("Program terminated...");
                break;
            }
        }
    }

}
