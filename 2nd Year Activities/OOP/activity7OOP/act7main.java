package activity7OOP;

import java.util.Scanner;

public class act7main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int students = 5;
        int acts = 3;
        double[][] grades = new double[students][acts];
        double[] averages = new double[students];

        System.out.println("This program will input grades of three (3) assigned activities of five\r\n" + //
                        "students and calculate the average grades of the activities of each of\r\n" + //
                        "the five (5) students.");
        
        for (int i = 0; i < students; i++) {
            System.out.println();
            double total = 0;
            for (int j = 0; j < acts; j++) {
                System.out.printf("%51s", "Enter grade of Student #" + (i + 1) + " for Activity [" + (j + 1) + "]: ");
                grades[i][j] = scanner.nextDouble();
                total += grades[i][j];
            }
            averages[i] = total / acts;
        }
        
        // Display the grades and averages
        System.out.printf("\n\n %39s \n\n","STUDENT GRADES");
        System.out.println("             Activity#1  Activity#2  Activity#3  Average");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < students; i++) {
            System.out.printf("Student#%d", (i + 1));
            for (int j = 0; j < acts; j++) {
                System.out.printf("         %.0f", grades[i][j]);
            }
            System.out.printf("       %.2f\n", averages[i]);
        }
        
        scanner.close();
    }
}
