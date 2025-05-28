package activity11OOP;

import java.util.Scanner;

public class mainmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("This program takes two arrays as input and merges them into a third array.\n");

            System.out.printf("%35s","Enter the First Array Limit: ");
            int size1 = scanner.nextInt();
            System.out.print("\n");
            
            int[] array1 = new int[size1];
            for (int i = 0; i < size1; i++) {
                System.out.printf("%45s","Enter FirstArrayElement[" + i + "]   : ");
                array1[i] = scanner.nextInt();
            }
            
            System.out.print("\n");
            System.out.printf("%36s","Enter the Second Array Limit: ");
            int size2 = scanner.nextInt();
            System.out.print("\n");
            
            int[] array2 = new int[size2];
            for (int i = 0; i < size2; i++) {
                System.out.printf("%45s","Enter SecondArrayElement[" + i + "]  : ");
                array2[i] = scanner.nextInt();
            }
            
            System.out.print("\n");
            System.out.printf("%36s","Merge two Array Elements...");
            System.out.print("\n\n");

            int[] mergedArray = new int[size1 + size2];
            mergingmethod.mergeArrays(array1, size1, array2, size2, mergedArray);

            for (int i = 0; i < size1; i++) {
                System.out.println("\t      FirstArrayElement[" + i + "]         : " + mergedArray[i]);
            }
            for (int i = size1; i < size1 + size2; i++) {
                System.out.println("\t      SecondArrayElement[" + (i - size1) + "]        : " + mergedArray[i]);
            }

            
            scanner.nextLine(); 
            
            System.out.print("\n\n");
            System.out.printf("%28s","Input Another? [Y/N]: ");
            String continueInput = scanner.nextLine();
            System.out.println();

            if (continueInput.equalsIgnoreCase("N")) {
                System.out.println();
                System.out.printf("%27s", "Program terminated...");
                break;
            }
        }

        scanner.close();
    }
}