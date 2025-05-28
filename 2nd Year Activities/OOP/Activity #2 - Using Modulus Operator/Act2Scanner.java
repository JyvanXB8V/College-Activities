package Activity2OOP;

import java.util.Scanner;

public class Act2Scanner {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");
			System.out.printf("%n %37s","Input time in seconds           : ");
			int timeinsecs = scanner.nextInt();
			

			int hours = timeinsecs / 3600;
			int remainingsecs = timeinsecs % 3600;
			int mins = remainingsecs / 60;
			int secs = remainingsecs % 60;
			
			System.out.printf("%n %66s","The inputted time equivalent to : " + hours + " Hours " + mins + " Minutes " + secs + " Seconds ");
			
		}

	}

}
