package quiz5OOP;
import java.util.Scanner;

public class Quiz5try {
	
	public static int summation(int[] numbers) {
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("This program computes an array of five inputted numbers and return");
		System.out.println("the sum outside of the method\n");
		
		
		while (true) {
		Scanner scan = new Scanner(System.in);
		int[]numbers = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%19s %d %s %2s", "Input Number[",i,"]", ": ");
			 numbers[i] = scan.nextInt();
		}
		
		System.out.print("\n");
        int sum = summation(numbers);
        System.out.printf("%s %2s %d","The Sum of the numbers",":",sum);
        System.out.print("\n\n");
        
        System.out.printf("Input Another? [Y/N] : ");
        String input = scan.next();
        System.out.println();
        
        if (input.equalsIgnoreCase("n")) {
        	break;
        }
        
		}
		
		System.out.printf("Program Terminated ...");
		
	}
	

}
