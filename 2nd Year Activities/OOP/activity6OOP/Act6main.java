package activity6OOP;

import java.util.Scanner;

public class Act6main {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        char choice = 'Y';
        
        System.out.println("This is a Java program that implements the Bubble Sort to sort ten (10)\r\n"
                + "inputted integers in ascending order.\n");
        
        while (choice == 'Y' || choice == 'y') {
            int[] numbers = new int[10];
            int i = 0;
            
            while (i < 10) {
                System.out.printf("%21s %d %1s","Enter Number",(i + 1),": ");
                numbers[i] = scan.nextInt();
                i++;
            }

            int n = numbers.length;
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (numbers[k] > numbers[k + 1]) {
                        int temp = numbers[k];
                        numbers[k] = numbers[k + 1];
                        numbers[k + 1] = temp;
                    }
                }
            }
            
            System.out.printf("\n");
            System.out.println("Sorted integers in ascending order:");
            for (int num : numbers) {
                System.out.printf("%11d%n",num);
            }
            
            System.out.printf("\n");
            System.out.print("Input Another? [Y/N]: ");
            choice = scan.next().charAt(0);
        }
        
        System.out.println(" ");
        System.out.println("Program Terminated.");
    }
}